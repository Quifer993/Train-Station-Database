package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.StatusOperability;
import app.model.StatusPreparation;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StatusOperabilityInputFormBuilder extends AbstractEntityInputFormBuilder<StatusOperability> {

    public StatusOperabilityInputFormBuilder(RequestExecutor requestExecutor) {
        super(StatusOperability::new, ServiceFactory.getStatusOperabilityService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StatusOperability statusOperability,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StatusOperability> controller
    ) {
            controller.addTextField(
                    "Название",
                    statusOperability.getNameStatus(),
                    statusOperability::setNameStatus
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый статус";
    }

    @Override
    protected String getEditFormWindowTitle(StatusOperability statusOperability) {
        return String.format("%s - изменить", statusOperability.getNameStatus());
    }
}
