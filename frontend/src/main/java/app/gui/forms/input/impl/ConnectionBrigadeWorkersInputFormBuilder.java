package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.Brigades;
import app.model.ConnectionBrigadeWorkers;
import app.model.StationWorkers;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class ConnectionBrigadeWorkersInputFormBuilder extends AbstractEntityInputFormBuilder<ConnectionBrigadeWorkers> {

    public ConnectionBrigadeWorkersInputFormBuilder(RequestExecutor requestExecutor) {
        super(ConnectionBrigadeWorkers::new, ServiceFactory.getConnectionBrigadeWorkersService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            ConnectionBrigadeWorkers connectionBrigadeWorkers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<ConnectionBrigadeWorkers> controller
    ) {
            ChoiceItemSupplier<Long> workerIdSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getStationWorkersService(),
                    c -> new ChoiceItem<>(c.getId(), c.getWorkName()),
                    "Не удалось загрузить список типов для работников"
            );

            controller.addChoiceBox(
                    "Работник",
                    connectionBrigadeWorkers.getStationWorkers() == null ? null : connectionBrigadeWorkers.getStationWorkers().getId(),
                    value -> {
                        StationWorkers stationWorkers = new StationWorkers();
                        stationWorkers.setId(value);
                        connectionBrigadeWorkers.setStationWorkers(stationWorkers);
                    },
                    workerIdSupplier

            );

            ChoiceItemSupplier<Long> brigadeIdSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getBrigadesService(),
                    c -> new ChoiceItem<>(c.getId(), c.getId().toString() + ' ' + c.getDepartment().getDepartmentName()),
                    "Не удалось загрузить список типов для бригад"
            );

            controller.addChoiceBox(
                    "Бригада",
                    connectionBrigadeWorkers.getBrigades() == null ? null : connectionBrigadeWorkers.getBrigades().getId(),
                    value -> {
                        Brigades brigades = new Brigades();
                        brigades.setId(value);
                        connectionBrigadeWorkers.setBrigades(brigades);
                    },
                    brigadeIdSupplier

            );

    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового рабочего";
    }

    @Override
    protected String getEditFormWindowTitle(ConnectionBrigadeWorkers connectionBrigadeWorkers) {
        return String.format("%s - изменить", connectionBrigadeWorkers.getBrigadeId() + connectionBrigadeWorkers.getStationWorkerName());
    }
}
