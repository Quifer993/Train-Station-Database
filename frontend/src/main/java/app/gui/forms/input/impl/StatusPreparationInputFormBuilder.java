package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.Department;
import app.model.StatusPreparation;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StatusPreparationInputFormBuilder extends AbstractEntityInputFormBuilder<StatusPreparation> {

    public StatusPreparationInputFormBuilder(RequestExecutor requestExecutor) {
        super(StatusPreparation::new, ServiceFactory.getStatusPreparationService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StatusPreparation statusPreparation,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StatusPreparation> controller
    ) {
            controller.addTextField(
                    "Название",
                    statusPreparation.getNameStatus(),
                    statusPreparation::setNameStatus
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый статус";
    }

    @Override
    protected String getEditFormWindowTitle(StatusPreparation department) {
        return String.format("%s - изменить", department.getNameStatus());
    }
}
