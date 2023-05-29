package app.gui.forms.filtering.impl;

import app.gui.controllers.FilterBoxController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.*;
import app.model.type.ResultEnum;
import app.services.filters.Filter;
import app.services.filters.StationWorkersFilter;
import app.services.filters.TrainDriversFilter;
import app.utils.ServiceFactory;

public class TrainDriversFilterBoxBuilder extends AbstractFilterBoxBuilder<TrainDrivers> {
    @Override
    protected void fillFilterBox(FilterBoxController<TrainDrivers> controller, Filter filter) {
        TrainDriversFilter trainDriversFilter = (TrainDriversFilter) filter;
//        ChoiceItemSupplier<MedicalExamination> medicalExaminationIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
//                ServiceFactory.getMedicalExaminationService(),
//                c -> new ChoiceItem<>(c.clone(),  c.getTrainDrivers().getLastName() + " " +  c.getTrainDrivers().getFirstName() + " " +  c.getDateMedicalExamination().toString()),
//                "Не удалось загрузить мед список"
//        );

//        StationWorkersFilter brigadesFilter = (StationWorkersFilter) filter;
//        ChoiceItemSupplier<Brigades> brigadesIdSupplier = makeChoiceItemSupplierFromEntities(
//                ServiceFactory.getBrigadesService(),
////                c -> c.getDepartment().getDepartmentName().equals("Подготовка составов") ||
////                        c.getDepartment().getDepartmentName().equals("Ремонт составов") ||
////                        c.getDepartment().getDepartmentName().equals("Водители подвижного состава"),
//                c -> new ChoiceItem<>(c.clone(),  c.getId().toString()),
//                "Не удалось загрузить список бригад"
//        );
//
//        StationWorkersFilter trainsFilter = (StationWorkersFilter) filter;
//        ChoiceItemSupplier<Trains> trainsIdSupplier = makeChoiceItemSupplierFromEntities(
//                ServiceFactory.getTrainsService(),
//                c -> new ChoiceItem<>(c.clone(),  c.getId().toString()),
//                "Не удалось загрузить список поездов"
//        );
//
//        StationWorkersFilter worksFilter = (StationWorkersFilter) filter;
//        ChoiceItemSupplier<Work> worksIdSupplier = makeChoiceItemSupplierFromEntities(
//                ServiceFactory.getWorkService(),
//                c -> new ChoiceItem<>(c.clone(),  c.getWorkName()),
//                "Не удалось загрузить список поездов"
//        );

        controller.setNumberOfRows(3);
        controller.setNumberOfCols(10);

        int row = 0;

        controller.addLabel("Мед:", 0, row, 2);
        controller.addChoiceBox(trainDriversFilter::setResultEnum, ResultEnum::getChoiceItems, 2, row, 5);

        row++;
//        controller.addLabel("Бригада:", 0, row, 2);
//        controller.addChoiceBox(brigadesFilter::setBrigades, brigadesIdSupplier, 2, row, 5);
//
//        row++;
//        controller.addLabel("Поезд:", 0, row, 2);
//        controller.addChoiceBox(trainsFilter::setTrains, trainsIdSupplier, 2, row, 5);
//
//        row++;
//        controller.addLabel("Профессия:", 0, row, 2);
//        controller.addChoiceBox(worksFilter::setWork, worksIdSupplier, 2, row, 5);
        controller.addLabel("Дата сборки:", 0, row, 2);
        controller.addLabel("от", 2, row, 1);
        controller.addDateField(trainDriversFilter::setMinDate, 3, row, 3);
        controller.addLabel("до", 6, row, 1);
        controller.addDateField(trainDriversFilter::setMaxDate, 7, row, 3);
    }
}
