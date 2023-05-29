package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.Routes;
import app.model.Stations;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StationsInputFormBuilder extends AbstractEntityInputFormBuilder<Stations> {

    public StationsInputFormBuilder(RequestExecutor requestExecutor) {
        super(Stations::new, ServiceFactory.getStationsService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Stations stations,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Stations> controller
    ) {
        if(formType == FormType.CREATION_FORM){
            controller.addTextField(
                    "Название станции",
                    stations.getPlacement(),
                    stations::setPlacement
            );
        }
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новую станцию";
    }

    @Override
    protected String getEditFormWindowTitle(Stations stations) {
        return String.format("%s - изменить", stations.getPlacement());
    }
}
