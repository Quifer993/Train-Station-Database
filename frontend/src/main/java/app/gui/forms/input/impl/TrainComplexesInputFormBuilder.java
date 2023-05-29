package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.TrainComplexes;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class TrainComplexesInputFormBuilder extends AbstractEntityInputFormBuilder<TrainComplexes> {

    public TrainComplexesInputFormBuilder(RequestExecutor requestExecutor) {
        super(TrainComplexes::new, ServiceFactory.getTrainComplexesService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            TrainComplexes trainComplexes,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<TrainComplexes> controller
    ) {
        if(formType == FormType.CREATION_FORM) {
            controller.addTextField(
                    "Название",
                    trainComplexes.getNameComplexes(),
                    trainComplexes::setNameComplexes
            );
        }
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый комплекс";
    }

    @Override
    protected String getEditFormWindowTitle(TrainComplexes trainComplexes) {
        return String.format("%s - изменить", trainComplexes.getNameComplexes());
    }
}
