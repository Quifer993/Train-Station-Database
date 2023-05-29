package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.Department;
import app.model.StationWorkers;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StationWorkersInputFormBuilder extends AbstractEntityInputFormBuilder<StationWorkers> {

    public StationWorkersInputFormBuilder(RequestExecutor requestExecutor) {
        super(StationWorkers::new, ServiceFactory.getStationWorkersService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StationWorkers stationWorkers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StationWorkers> controller
    ) {
            controller.addTextField(
                    "Фамилия",
                    stationWorkers.getLastName(),
                    stationWorkers::setLastName
            );
            controller.addTextField(
                    "Имя",
                    stationWorkers.getFirstName(),
                    stationWorkers::setFirstName
            );
            controller.addTextField(
                    "Отчество",
                    stationWorkers.getSurname(),
                    stationWorkers::setSurname
            );
            controller.addDateField(
                    "Дата рождения",
                    stationWorkers.getBirthday(),
                    stationWorkers::setBirthday
            );
            controller.addTextField(
                    "пол",
                    stationWorkers.getSex(),
                    stationWorkers::setSex
            );
            controller.addIntegerField(
                    "Количество детей",
                    stationWorkers.getAmountChildren(),
                    stationWorkers::setAmountChildren
            );
            controller.addDateField(
                    "Дата найма",
                    stationWorkers.getHireDate(),
                    stationWorkers::setHireDate
            );
//            controller.addTextField(
//                    "Профессия",
//                    stationWorkers.getWorkName(),
//                    stationWorkers::setWorkName
//            );
            ChoiceItemSupplier<Long> workIdSupplier = makeChoiceItemSupplierFromEntities(
                    ServiceFactory.getWorkService(),
                    c -> new ChoiceItem<>(c.getId(), c.getWorkName()),
                    "Не удалось загрузить список типов для профессий"
            );

            controller.addChoiceBox(
                    "Тип сотрудника",
                    stationWorkers.getWork() == null ? null : stationWorkers.getWork().getId(),
                    value -> {
                        Work work = new Work();
                        work.setId(value);
                        stationWorkers.setWork(work);
                    },
                    workIdSupplier

            );

            controller.addIntegerField(
                    "Зарплата",
                    stationWorkers.getSalary(),
                    stationWorkers::setSalary
            );


    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового рабочего";
    }

    @Override
    protected String getEditFormWindowTitle(StationWorkers stationWorkers) {
        return String.format("%s - изменить", stationWorkers.getLastName() + ' ' + stationWorkers.getFirstName());
    }
}
