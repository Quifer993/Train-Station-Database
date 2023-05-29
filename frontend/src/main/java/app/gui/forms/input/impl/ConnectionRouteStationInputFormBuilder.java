package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class ConnectionRouteStationInputFormBuilder extends AbstractEntityInputFormBuilder<ConnectionRouteStation> {

    public ConnectionRouteStationInputFormBuilder(RequestExecutor requestExecutor) {
        super(ConnectionRouteStation::new, ServiceFactory.getConnectionRouteStationService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            ConnectionRouteStation connectionRouteStation,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<ConnectionRouteStation> controller
    ) {
            ChoiceItemSupplier<Long> routeSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getRoutesService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameRoute()),
                    "Не удалось загрузить список типов для маршрутов"
            );

            controller.addChoiceBox(
                    "Маршрут",
                    connectionRouteStation.getRoutes() == null ? null : connectionRouteStation.getRoutes().getId(),
                    value -> {
                        Routes routes = new Routes();
                        routes.setId(value);
                        connectionRouteStation.setRoutes(routes);
                    },
                    routeSupplier
            );

            ChoiceItemSupplier<Long> stationSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStationsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getPlacement()),
                    "Не удалось загрузить список типов для станций"
            );

            controller.addChoiceBox(
                    "Станция",
                    connectionRouteStation.getRoutes() == null ? null : connectionRouteStation.getRoutes().getId(),
                    value -> {
                        Stations stations = new Stations();
                        stations.setId(value);
                        connectionRouteStation.setStations(stations);
                    },
                    stationSupplier

            );

            controller.addIntegerField(
                    "Время остановки(мин)",
                    connectionRouteStation.getTimeWait(),
                    connectionRouteStation::setTimeWait
            );


            controller.addIntegerField(
                    "Время в пути(мин)",
                    connectionRouteStation.getTimeToNextStation(),
                    connectionRouteStation::setTimeToNextStation
            );
            controller.addIntegerField(
                    "Номер станции от начала",
                    connectionRouteStation.getNumberStationFromStart(),
                    connectionRouteStation::setNumberStationFromStart
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового рабочего";
    }

    @Override
    protected String getEditFormWindowTitle(ConnectionRouteStation connectionRouteStation) {
        return String.format("%s - изменить", connectionRouteStation.getStations() + " " + connectionRouteStation.getRoutes());
    }
}
