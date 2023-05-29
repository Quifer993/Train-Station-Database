package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class TicketsInputFormBuilder extends AbstractEntityInputFormBuilder<Tickets> {

    public TicketsInputFormBuilder(RequestExecutor requestExecutor) {
        super(Tickets::new, ServiceFactory.getTicketsService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Tickets tickets,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Tickets> controller
    ) {
            ChoiceItemSupplier<Long> flightSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getFlightService(),
                    c -> new ChoiceItem<>(c.getId(), c.getId() + " " + c.getRoutes().getNameRoute()),
                    "Не удалось загрузить список рейсов"
            );
            controller.addChoiceBox(
                    "Рейс",
                    tickets.getFlight() == null ? null : tickets.getFlight().getId(),
                    value -> {
                        Flight flight = new Flight();
                        flight.setId(value);
                        tickets.setFlight(flight);
                    },
                    flightSupplier
            );

            ChoiceItemSupplier<Long> passengersSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getPassengersService(),
                    c -> new ChoiceItem<>(c.getId(), c.getLastName() + " " + c.getFirstName()),
                    "Не удалось загрузить список пассажиров"
            );
            controller.addChoiceBox(
                    "Пассажир",
                    tickets.getPassengers() == null ? null : tickets.getPassengers().getId(),
                    value -> {
                        Passengers passengers = new Passengers();
                        passengers.setId(value);
                        tickets.setPassengers(passengers);
                    },
                    passengersSupplier
            );

            ChoiceItemSupplier<Long> statusPassengersSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStatusPassengersService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameStatus()),
                    "Не удалось загрузить список статусов пассажира"
            );
            controller.addChoiceBox(
                    "Статус подготовки составов",
                    tickets.getStatusPassengers() == null ? null : tickets.getStatusPassengers().getId(),
                    value -> {
                        StatusPassengers statusPassengers = new StatusPassengers();
                        statusPassengers.setId(value);
                        tickets.setStatusPassengers(statusPassengers);
                    },
                    statusPassengersSupplier
            );

            ChoiceItemSupplier<Long> startStationSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStationsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getPlacement()),
                    "Не удалось загрузить список станций"
            );
            controller.addChoiceBox(
                    "Начальная станция",
                    tickets.getStartStation() == null ? null : tickets.getStartStation().getId(),
                    value -> {
                        Stations stations = new Stations();
                        stations.setId(value);
                        tickets.setStartStation(stations);
                    },
                    startStationSupplier
            );

            ChoiceItemSupplier<Long> finishStationSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStationsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getPlacement()),
                    "Не удалось загрузить список станций"
            );
            controller.addChoiceBox(
                    "Конечная станция",
                    tickets.getFinishStation() == null ? null : tickets.getFinishStation().getId(),
                    value -> {
                        Stations stations = new Stations();
                        stations.setId(value);
                        tickets.setStartStation(stations);
                    },
                    finishStationSupplier
            );


        controller.addDateField(
                "Время брони",
                tickets.getTimeBooking(),
                tickets::setTimeBooking
        );
        controller.addDateField(
                "Время продажи",
                tickets.getTimeSale(),
                tickets::setTimeSale
        );
        controller.addDateField(
                "Время возврата",
                tickets.getTimeTicketReturn(),
                tickets::setTimeTicketReturn
        );

        controller.addIntegerField(
                "Вагон",
                tickets.getRailwayCarriage(),
                tickets::setRailwayCarriage
        );
        controller.addIntegerField(
                "Место в вагоне",
                tickets.getPlaceRailwayCarriage(),
                tickets::setPlaceRailwayCarriage
        );
        controller.addTextField(
                "Багаж",
                tickets.getLuggage(),
                tickets::setLuggage
        );
        controller.addIntegerField(
                "Цена",
                tickets.getPrice(),
                tickets::setPrice
        );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый рейс";
    }

    @Override
    protected String getEditFormWindowTitle(Tickets tickets) {
        return String.format("%s - изменить рейс", tickets.getPassengers().getLastName() +
                " " + tickets.getPassengers().getFirstName() +
                " " + tickets.getFlight().getRoutes().getNameRoute() +
                " " + tickets.getTimeBooking());
    }
}
