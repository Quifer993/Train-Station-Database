package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.PreparationWorkers;
import app.model.TrainComplexes;
import app.model.TrainDrivers;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class PreparationWorkersInputFormBuilder extends AbstractEntityInputFormBuilder<PreparationWorkers> {

    public PreparationWorkersInputFormBuilder(RequestExecutor requestExecutor) {
        super(PreparationWorkers::new, ServiceFactory.getPreparationWorkersService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            PreparationWorkers preparationWorkers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<PreparationWorkers> controller
    ) {
        if(formType == FormType.EDIT_FORM) {
            ChoiceItemSupplier<Long> сomplexesSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getTrainComplexesService(),
                    c -> new ChoiceItem<>(c.getId(), c.getNameComplexes()),
                    "Не удалось загрузить список типов для комплексов"
            );

            controller.addChoiceBox(
                    "Комплекс",
                    preparationWorkers.getTrainComplexes() == null ? null : preparationWorkers.getTrainComplexes().getId(),
                    value -> {
                        TrainComplexes trainComplexes = new TrainComplexes();
                        trainComplexes.setId(value);
                        preparationWorkers.setTrainComplexes(trainComplexes);
                    },
                    сomplexesSupplier
            );
        }
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового рабочего подготовки(нельзя)";
    }

    @Override
    protected String getEditFormWindowTitle(PreparationWorkers preparationWorkers) {
        return String.format("%s - изменить", preparationWorkers.getLastName() + ' ' + preparationWorkers.getFirstName());
    }
}
