package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.StatusTrains;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StatusTrainsInputFormBuilder extends AbstractEntityInputFormBuilder<StatusTrains> {

    public StatusTrainsInputFormBuilder(RequestExecutor requestExecutor) {
        super(StatusTrains::new, ServiceFactory.getStatusTrainsService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StatusTrains statusTrains,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StatusTrains> controller
    ) {
            controller.addTextField(
                    "Название",
                    statusTrains.getNameStatus(),
                    statusTrains::setNameStatus
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый статус";
    }

    @Override
    protected String getEditFormWindowTitle(StatusTrains statusTrains) {
        return String.format("%s - изменить", statusTrains.getNameStatus());
    }
}
