package app.gui.forms.filtering.impl;

import app.gui.controllers.FilterBoxController;
import app.gui.controllers.interfaces.ChoiceItemSupplier;
import app.gui.custom.ChoiceItem;
import app.model.Routes;
import app.model.TrainDrivers;
import app.model.Trains;
import app.model.type.LuggageEnum;
import app.model.type.ResultEnum;
import app.services.filters.Filter;
import app.services.filters.TrainsFilter;
import app.utils.ServiceFactory;

public class TrainsFilterBoxBuilder extends AbstractFilterBoxBuilder<Trains> {
    @Override
    protected void fillFilterBox(FilterBoxController<Trains> controller, Filter filter) {
        TrainsFilter trainDriversFilter = (TrainsFilter) filter;
        ChoiceItemSupplier<Routes> routesIdWorkerSupplier = makeChoiceItemSupplierFromEntities(
                ServiceFactory.getRoutesService(),
                c -> new ChoiceItem<>(c.clone(),  c.getNameRoute()),
                "Не удалось загрузить список маршрутов"
        );

        controller.setNumberOfRows(3);
        controller.setNumberOfCols(10);

        int row = 0;

        controller.addLabel("Маршрут:", 0, row, 2);
        controller.addChoiceBox(trainDriversFilter::setRoutes, routesIdWorkerSupplier, 2, row, 5);

        row++;
        controller.addLabel("Сортировка по цене:", 0, row, 2);
        controller.addChoiceBox(trainDriversFilter::setLuggageEnum, LuggageEnum::getChoiceItems, 2, row, 5);
//
//        row++;
//        controller.addLabel("Поезд:", 0, row, 2);
//        controller.addChoiceBox(trainsFilter::setTrains, trainsIdSupplier, 2, row, 5);
//
//        row++;
//        controller.addLabel("Профессия:", 0, row, 2);
//        controller.addChoiceBox(worksFilter::setWork, worksIdSupplier, 2, row, 5);
    }
}
