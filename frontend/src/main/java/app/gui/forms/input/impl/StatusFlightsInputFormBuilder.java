package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.model.StatusFlights;
import app.model.StatusOperability;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class StatusFlightsInputFormBuilder extends AbstractEntityInputFormBuilder<StatusFlights> {

    public StatusFlightsInputFormBuilder(RequestExecutor requestExecutor) {
        super(StatusFlights::new, ServiceFactory.getStatusFlightsService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            StatusFlights statusFlights,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<StatusFlights> controller
    ) {
            controller.addTextField(
                    "Название",
                    statusFlights.getNameStatus(),
                    statusFlights::setNameStatus
            );
    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новый статус";
    }

    @Override
    protected String getEditFormWindowTitle(StatusFlights statusFlights) {
        return String.format("%s - изменить", statusFlights.getNameStatus());
    }
}
