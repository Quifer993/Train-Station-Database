package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class FlightInputFormBuilder extends AbstractEntityInputFormBuilder<Flight> {

    public FlightInputFormBuilder(RequestExecutor requestExecutor) {
        super(Flight::new, ServiceFactory.getFlightService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Flight flight,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Flight> controller
    ) {
            ChoiceItemSupplier<Long> routesSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getRoutesService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameRoute()),
                    "Не удалось загрузить список маршрутов"
            );
            controller.addChoiceBox(
                    "Маршрут",
                    flight.getRoutes() == null ? null : flight.getRoutes().getId(),
                    value -> {
                        Routes routes = new Routes();
                        routes.setId(value);
                        flight.setRoutes(routes);
                    },
                    routesSupplier
            );

            ChoiceItemSupplier<Long> trainsSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getTrainsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getId() + " " + c.getStatusTrains().getNameStatus()),
                    "Не удалось загрузить список поездов"
            );
            controller.addChoiceBox(
                    "Поезд",
                    flight.getTrains() == null ? null : flight.getTrains().getId(),
                    value -> {
                        Trains trains = new Trains();
                        trains.setId(value);
                        flight.setTrains(trains);
                    },
                    trainsSupplier
            );

            ChoiceItemSupplier<Long> statusPreparationSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStatusPreparationService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameStatus()),
                    "Не удалось загрузить список статусов подготовки составов"
            );
            controller.addChoiceBox(
                    "Статус подготовки составов",
                    flight.getStatusPreparation() == null ? null : flight.getStatusPreparation().getId(),
                    value -> {
                        StatusPreparation statusPreparation = new StatusPreparation();
                        statusPreparation.setId(value);
                        flight.setStatusPreparation(statusPreparation);
                    },
                    statusPreparationSupplier
            );

            ChoiceItemSupplier<Long> statusOperabilitySupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStatusOperabilityService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameStatus()),
                    "Не удалось загрузить список статусов работоспособности"
            );
            controller.addChoiceBox(
                    "Работоспособность",
                    flight.getStatusOperability() == null ? null : flight.getStatusOperability().getId(),
                    value -> {
                        StatusOperability statusOperability = new StatusOperability();
                        statusOperability.setId(value);
                        flight.setStatusOperability(statusOperability);
                    },
                    statusOperabilitySupplier
            );

            ChoiceItemSupplier<Long> statusFlightSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStatusFlightsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameStatus()),
                    "Не удалось загрузить список статусов рейсов"
            );
            controller.addChoiceBox(
                    "Статус рейса",
                    flight.getStatusFlights() == null ? null : flight.getStatusFlights().getId(),
                    value -> {
                        StatusFlights statusFlights = new StatusFlights();
                        statusFlights.setId(value);
                        flight.setStatusFlights(statusFlights);
                    },
                    statusFlightSupplier
            );


        controller.addDateField(
                "Время отправления",
                flight.getTimeStart(),
                flight::setTimeStart
        );
        controller.addIntegerField(
                "Цена",
                flight.getPriceFlight(),
                flight::setPriceFlight
        );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый рейс";
    }

    @Override
    protected String getEditFormWindowTitle(Flight flight) {
        return String.format("%s - изменить рейс", flight.getId() +
                " " + flight.getRouteName() +
                " " + flight.getTrainsData());
    }
}
