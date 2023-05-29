package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class WorkInputFormBuilder extends AbstractEntityInputFormBuilder<Work> {

    public WorkInputFormBuilder(RequestExecutor requestExecutor) {
        super(Work::new, ServiceFactory.getWorkService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Work department,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Work> controller
    ) {
        if(formType == FormType.CREATION_FORM) {
            controller.addTextField(
                    "Название",
                    department.getWorkName(),
                    department::setWorkName
            );
        }
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый цех";
    }

    @Override
    protected String getEditFormWindowTitle(Work work) {
        return String.format("%s - изменить", work.getWorkName());
    }
}
