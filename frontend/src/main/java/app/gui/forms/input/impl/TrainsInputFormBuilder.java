package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class TrainsInputFormBuilder extends AbstractEntityInputFormBuilder<Trains> {

    public TrainsInputFormBuilder(RequestExecutor requestExecutor) {
        super(Trains::new, ServiceFactory.getTrainsService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Trains trains,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Trains> controller
    ) {
            controller.addIntegerField(
                    "Вагонов",
                    trains.getCapacityRailwayCarriage(),
                    trains::setCapacityRailwayCarriage
            );
            controller.addIntegerField(
                    "Мест в вагоне",
                    trains.getPlacesInRailwayCarriage(),
                    trains::setPlacesInRailwayCarriage
            );

            ChoiceItemSupplier<Long> statusTrainsSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStatusTrainsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameStatus()),
                    "Не удалось загрузить список типов поездов"
            );

            controller.addChoiceBox(
                    "Тип поезда",
                    trains.getStatusTrains() == null ? null : trains.getStatusTrains().getId(),
                    value -> {
                        StatusTrains statusTrains = new StatusTrains();
                        statusTrains.setId(value);
                        trains.setStatusTrains(statusTrains);
                    },
                    statusTrainsSupplier
            );
            ChoiceItemSupplier<Long> stationsSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStationsService(),
                    c -> new ChoiceItem<>(c.getId(), c.getPlacement()),
                    "Не удалось загрузить список станций"
            );

            controller.addChoiceBox(
                    "Станция",
                    trains.getStations() == null ? null : trains.getStations().getId(),
                    value -> {
                        Stations stations = new Stations();
                        stations.setId(value);
                        trains.setStations(stations);
                    },
                    stationsSupplier
            );

            ChoiceItemSupplier<Long> driversSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getBrigadesService(),
                    c -> c.getDepartment().getDepartmentName().equals("Водители подвижного состава"),
                    c -> new ChoiceItem<>(c.getId(), c.getId().toString()),
                    "Не удалось загрузить список бригад водителей"
            );

            controller.addChoiceBox(
                    "Бригада водителей",
                    trains.getBrigadeTrainDrivers() == null ? null : trains.getBrigadeTrainDrivers().getId(),
                    value -> {
                        Brigades brigades = new Brigades();
                        brigades.setId(value);
                        trains.setBrigadeTrainDrivers(brigades);
                    },
                    driversSupplier
            );
            ChoiceItemSupplier<Long> operabilitySupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getBrigadesService(),
                    c -> c.getDepartment().getDepartmentName().equals("Ремонт составов"),
                    c -> new ChoiceItem<>(c.getId(), c.getId().toString()),
                    "Не удалось загрузить список бригад ремонтников состава"
            );

            controller.addChoiceBox(
                    "Бригада ремонтников состава",
                    trains.getBrigadeOperability() == null ? null : trains.getBrigadeOperability().getId(),
                    value -> {
                        Brigades brigades = new Brigades();
                        brigades.setId(value);
                        trains.setBrigadeOperability(brigades);
                    },
                    operabilitySupplier
            );

            ChoiceItemSupplier<Long> preparationSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getBrigadesService(),
                    c -> c.getDepartment().getDepartmentName().equals("Подготовка составов"),
                    c -> new ChoiceItem<>(c.getId(), c.getId().toString()),
                    "Не удалось загрузить список бригад подготовки состава"
            );

            controller.addChoiceBox(
                    "Бригада подготовки состава",
                    trains.getBrigadePreparation() == null ? null : trains.getBrigadePreparation().getId(),
                    value -> {
                        Brigades brigades = new Brigades();
                        brigades.setId(value);
                        trains.setBrigadePreparation(brigades);
                    },
                    preparationSupplier
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового поезда";
    }

    @Override
    protected String getEditFormWindowTitle(Trains trains) {
        return String.format("%s - изменить", trains.getId() + ' ' + trains.getStatusName());
    }
}
