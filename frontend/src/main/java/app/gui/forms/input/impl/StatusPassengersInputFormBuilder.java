package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.StatusPassengers;
import app.model.StatusTrains;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StatusPassengersInputFormBuilder extends AbstractEntityInputFormBuilder<StatusPassengers> {

    public StatusPassengersInputFormBuilder(RequestExecutor requestExecutor) {
        super(StatusPassengers::new, ServiceFactory.getStatusPassengersService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StatusPassengers statusPassengers,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StatusPassengers> controller
    ) {
            controller.addTextField(
                    "Название",
                    statusPassengers.getNameStatus(),
                    statusPassengers::setNameStatus
            );
            controller.addIntegerField(
                    "Скидка",
                    statusPassengers.getDiscount(),
                    statusPassengers::setDiscount
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый статус";
    }

    @Override
    protected String getEditFormWindowTitle(StatusPassengers statusPassengers) {
        return String.format("%s - изменить", statusPassengers.getNameStatus());
    }
}
