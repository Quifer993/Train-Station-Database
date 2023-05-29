package app.gui.forms.filtering.impl;

import app.gui.controllers.FilterBoxController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.services.Service;
import app.services.filters.Filter;
import app.services.filters.StationWorkersFilter;
import app.utils.ServiceFactory;

public class StationWorkersFilterBoxBuilder extends AbstractFilterBoxBuilder<StationWorkers> {
    @Override
    protected void fillFilterBox(FilterBoxController<StationWorkers> controller, Filter filter) {
        StationWorkersFilter departmentFilter = (StationWorkersFilter) filter;
        ChoiceItemSupplier<Department> departmentIdSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getDepartmentService(),
                c -> new ChoiceItem<>(c.clone(),  c.getDepartmentName()),
                "Не удалось загрузить список отделов"
        );

        ChoiceItemSupplier<Brigades> brigadesIdSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getBrigadesService(),
//                c -> c.getDepartment().getDepartmentName().equals("Подготовка составов") ||
//                        c.getDepartment().getDepartmentName().equals("Ремонт составов") ||
//                        c.getDepartment().getDepartmentName().equals("Водители подвижного состава"),
                c -> new ChoiceItem<>(c.clone(),  c.getId().toString()),
                "Не удалось загрузить список бригад"
        );

        ChoiceItemSupplier<Trains> trainsIdSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getTrainsService(),
                c -> new ChoiceItem<>(c.clone(),  c.getId().toString()),
                "Не удалось загрузить список поездов"
        );

        ChoiceItemSupplier<Work> worksIdSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getWorkService(),
                c -> new ChoiceItem<>(c.clone(),  c.getWorkName()),
                "Не удалось загрузить список профессий"
        );

        controller.setNumberOfRows(3);
        controller.setNumberOfCols(10);

        int row = 0;

        controller.addLabel("Отдел:", 0, row, 2);
        controller.addChoiceBox(departmentFilter::setDepartment, departmentIdSupplier, 2, row, 5);

        row++;
        controller.addLabel("Бригада:", 0, row, 2);
        controller.addChoiceBox(departmentFilter::setBrigades, brigadesIdSupplier, 2, row, 5);

        row++;
        controller.addLabel("Поезд:", 0, row, 2);
        controller.addChoiceBox(departmentFilter::setTrains, trainsIdSupplier, 2, row, 5);

        row++;
        controller.addLabel("Профессия:", 0, row, 2);
        controller.addChoiceBox(departmentFilter::setWork, worksIdSupplier, 2, row, 5);
//        controller.addLabel("Дата сборки:", 0, row, 2);
//        controller.addLabel("от", 2, row, 1);
//        controller.addDateField(stationWorkersFilter::setMinAssembledDate, 3, row, 3);
//        controller.addLabel("до", 6, row, 1);
//        controller.addDateField(stationWorkersFilter::setMaxAssembledDate, 7, row, 3);
    }
}
