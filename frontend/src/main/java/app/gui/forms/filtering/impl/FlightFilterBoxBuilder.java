package app.gui.forms.filtering.impl;

import app.gui.controllers.FilterBoxController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.model.type.LuggageEnum;
import app.services.filters.Filter;
import app.services.filters.FlightFilter;
import app.services.filters.TrainsFilter;
import app.utils.ServiceFactory;

public class FlightFilterBoxBuilder extends AbstractFilterBoxBuilder<Flight> {
    @Override
    protected void fillFilterBox(FilterBoxController<Flight> controller, Filter filter) {
        FlightFilter flightFilter = (FlightFilter) filter;
        ChoiceItemSupplier<Routes> routesIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getRoutesService(),
                c -> new ChoiceItem<>(c.clone(),  c.getNameRoute()),
                "Не удалось загрузить список маршрутов"
        );

        ChoiceItemSupplier<StatusFlights> statusFlightIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getStatusFlightsService(),
                c -> new ChoiceItem<>(c.clone(),  c.getNameStatus()),
                "Не удалось загрузить список маршрутов"
        );

        ChoiceItemSupplier<StatusTrains> statusTrainIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getStatusTrainsService(),
                c -> new ChoiceItem<>(c.clone(),  c.getNameStatus()),
                "Не удалось загрузить список маршрутов"
        );

        controller.setNumberOfRows(3);
        controller.setNumberOfCols(10);

        int row = 0;

        controller.addLabel("Маршрут:", 0, row, 2);
        controller.addChoiceBox(flightFilter::setRoutes, routesIdWorkerSupplier, 2, row, 5);

        row++;
        controller.addLabel("Статус рейса:", 0, row, 2);
        controller.addChoiceBox(flightFilter::setStatusFlights, statusFlightIdWorkerSupplier, 2, row, 5);

        row++;
        controller.addLabel("Тип поезда:", 0, row, 2);
        controller.addChoiceBox(flightFilter::setStatusTrains, statusTrainIdWorkerSupplier, 2, row, 5);
    }
}
