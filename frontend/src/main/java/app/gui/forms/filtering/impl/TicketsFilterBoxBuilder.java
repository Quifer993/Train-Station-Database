package app.gui.forms.filtering.impl;

import app.gui.controllers.FilterBoxController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.services.filters.Filter;
import app.services.filters.FlightFilter;
import app.services.filters.TicketsFilter;
import app.utils.ServiceFactory;

public class TicketsFilterBoxBuilder extends AbstractFilterBoxBuilder<Tickets> {
    @Override
    protected void fillFilterBox(FilterBoxController<Tickets> controller, Filter filter) {
        TicketsFilter ticketsFilter = (TicketsFilter) filter;
        ChoiceItemSupplier<Flight> flightIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getFlightService(),
                c -> new ChoiceItem<>(c.clone(),  c.getId() + " " + c.getRoutes().getNameRoute()),
                "Не удалось загрузить список рейсов"
        );

        controller.setNumberOfRows(3);
        controller.setNumberOfCols(10);

        int row = 0;

        controller.addLabel("Рейс:", 0, row, 2);
        controller.addChoiceBox(ticketsFilter::setFlight, flightIdWorkerSupplier, 2, row, 5);
    }
}
