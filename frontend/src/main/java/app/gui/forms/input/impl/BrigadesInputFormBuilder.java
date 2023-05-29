package app.gui.forms.input.impl;

import app.gui.controllers.EntityInputFormController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.Brigades;
import app.model.Department;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;

public class BrigadesInputFormBuilder extends AbstractEntityInputFormBuilder<Brigades> {

    public BrigadesInputFormBuilder(RequestExecutor requestExecutor) {
        super(Brigades::new, ServiceFactory.getBrigadesService(), requestExecutor);
    }

    @Override
    protected void fillInputForm(
            Brigades brigades,
            FormType formType,
            boolean isContextWindow,
            EntityInputFormController<Brigades> controller
    ) {
        
        ChoiceItemSupplier<Long> departmentIdSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getDepartmentService(),
                c -> new ChoiceItem<>(c.getId(), c.getDepartmentName()),
                "Не удалось загрузить список отделов"
        );

        controller.addChoiceBox(
                "Название отдела",
                brigades.getDepartment() == null ? null : brigades.getDepartment().getId(),
                value -> {
                    Department department = new Department();
                    department.setId(value);
                    brigades.setDepartment(department);
                },
                departmentIdSupplier
        );

    }

    @Override
    protected String getCreationFormWindowTitle() {
        return "Добавить новую бригаду";
    }

    @Override
    protected String getEditFormWindowTitle(Brigades brigades) {
        return String.format("%s - изменить", brigades.getDepartmentName());
    }
}
