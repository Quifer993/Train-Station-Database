package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.Passengers;
import app.model.StationWorkers;
import app.model.Work;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class PassengersInputFormBuilder extends AbstractEntityInputFormBuilder<Passengers> {

    public PassengersInputFormBuilder(RequestExecutor requestExecutor) {
        super(Passengers::new, ServiceFactory.getPassengersService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Passengers passengers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Passengers> controller
    ) {
            controller.addTextField(
                    "Фамилия",
                    passengers.getLastName(),
                    passengers::setLastName
            );
            controller.addTextField(
                    "Имя",
                    passengers.getFirstName(),
                    passengers::setFirstName
            );
            controller.addTextField(
                    "Отчество",
                    passengers.getSurname(),
                    passengers::setSurname
            );
            controller.addDateField(
                    "Дата рождения",
                    passengers.getBirthday(),
                    passengers::setBirthday
            );
            controller.addTextField(
                    "пол",
                    passengers.getSex(),
                    passengers::setSex
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить нового пассажира";
    }

    @Override
    protected String getEditFormWindowTitle(Passengers passengers) {
        return String.format("%s - изменить", passengers.getLastName() + ' ' + passengers.getFirstName());
    }
}
