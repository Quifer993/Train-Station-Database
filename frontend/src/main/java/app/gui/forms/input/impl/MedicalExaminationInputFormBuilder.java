package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.MedicalExamination;
import app.model.StationWorkers;
import app.model.TrainDrivers;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class MedicalExaminationInputFormBuilder extends AbstractEntityInputFormBuilder<MedicalExamination> {

    public MedicalExaminationInputFormBuilder(RequestExecutor requestExecutor) {
        super(MedicalExamination::new, ServiceFactory.getMedicalExaminationService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            MedicalExamination medicalExamination,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<MedicalExamination> controller
    ) {

            controller.addTextField(
                    "Описание",
                    medicalExamination.getDescription(),
                    medicalExamination::setDescription
            );
            controller.addTextField(
                    "Результат",
                    medicalExamination.getResult(),
                    medicalExamination::setResult
            );

            controller.addDateField(
                    "Дата прохождения",
                    medicalExamination.getDateMedicalExamination(),
                    medicalExamination::setDateMedicalExamination
            );

            ChoiceItemSupplier<Long> workerSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getTrainDriversService(),
                    c -> new ChoiceItem<>(c.getId(), c.getLastName() + " " + c.getFirstName()),
                    "Не удалось загрузить список типов для профессий"
            );

            controller.addChoiceBox(
                    "Сотрудник",
                    medicalExamination.getTrainDrivers() == null ? null : medicalExamination.getTrainDrivers().getId(),
                    value -> {
                        TrainDrivers trainDrivers = new TrainDrivers();
                        trainDrivers.setId(value);
                        medicalExamination.setTrainDrivers(trainDrivers);
                    },
                    workerSupplier

            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового рабочего";
    }

    @Override
    protected String getEditFormWindowTitle(MedicalExamination medicalExamination) {
        return String.format("%s - изменить", medicalExamination.getTrainDrivers().getWorkName() + " дата: " + medicalExamination.getDateMedicalExamination());
    }
}
