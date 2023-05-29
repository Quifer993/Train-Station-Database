package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.TrainDrivers;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class TrainDriversInputFormBuilder extends AbstractEntityInputFormBuilder<TrainDrivers> {

    public TrainDriversInputFormBuilder(RequestExecutor requestExecutor) {
        super(TrainDrivers::new, ServiceFactory.getTrainDriversService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            TrainDrivers trainDrivers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<TrainDrivers> controller
    ) {

    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового водителя(нельзя)";
    }

    @Override
    protected String getEditFormWindowTitle(TrainDrivers trainDrivers) {
        return String.format("%s - изменить(нельзя)", trainDrivers.getLastName() + ' ' + trainDrivers.getFirstName());
    }
}
