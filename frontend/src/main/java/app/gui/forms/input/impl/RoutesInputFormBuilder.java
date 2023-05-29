package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.Department;
import app.model.Routes;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class RoutesInputFormBuilder extends AbstractEntityInputFormBuilder<Routes> {

    public RoutesInputFormBuilder(RequestExecutor requestExecutor) {
        super(Routes::new, ServiceFactory.getRoutesService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Routes routes,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Routes> controller
    ) {
        if(formType == FormType.CREATION_FORM) {
            controller.addTextField(
                    "Название маршрута",
                    routes.getNameRoute(),
                    routes::setNameRoute
            );
        }
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый маршрут";
    }

    @Override
    protected String getEditFormWindowTitle(Routes routes) {
        return String.format("%s - изменить", routes.getNameRoute());
    }
}
