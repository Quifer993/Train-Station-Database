package app.gui.controllers;

import app.gui.controllers.interfaces.ContextWindowBuilder;
import app.gui.forms.filtering.FilterBoxBuilder;
import app.gui.forms.filtering.impl.*;
import app.gui.forms.input.EntityInputFormBuilder;
import app.gui.forms.input.impl.*;
import app.model.*;
import app.services.*;
import app.services.filters.*;
import app.utils.LocalDateFormatter;
import app.utils.RequestExecutor;
import app.utils.ServiceFactory;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import lombok.SneakyThrows;

import java.time.Instant;
import java.util.Map;
import java.util.function.Supplier;

public class MainController {

    private RequestExecutor requestExecutor;

    @FXML
    private TabPane contentTabPane;

    @FXML
    private Label statusBarLabel;

    @FXML
    private Tab defaultTab;

    @SneakyThrows
    public void init(RequestExecutor requestExecutor) {
        this.requestExecutor = requestExecutor;
        contentTabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.ALL_TABS);
    }

    @FXML
    void openStatusOperability() {
        createEntityTable(
                "Работоспособность",
                StatusOperability.getPropertyNames(),
                StatusOperability.getSortPropertyNames(),
                ServiceFactory.getStatusOperabilityService(),
                new StatusOperabilityInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openStatusPassengers() {
        createEntityTable(
                "Тип пассажира",
                StatusPassengers.getPropertyNames(),
                StatusPassengers.getSortPropertyNames(),
                ServiceFactory.getStatusPassengersService(),
                new StatusPassengersInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openStatusFlights() {
        createEntityTable(
                "Статус рейса",
                StatusFlights.getPropertyNames(),
                StatusFlights.getSortPropertyNames(),
                ServiceFactory.getStatusFlightsService(),
                new StatusFlightsInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openStatusPreparation() {
        createEntityTable(
                "Статус подготовки",
                StatusPreparation.getPropertyNames(),
                StatusPreparation.getSortPropertyNames(),
                ServiceFactory.getStatusPreparationService(),
                new StatusPreparationInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openStatusTrain() {
        createEntityTable(
                "Статус рейса",
                StatusTrains.getPropertyNames(),
                StatusTrains.getSortPropertyNames(),
                ServiceFactory.getStatusTrainsService(),
                new StatusTrainsInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openPreparationWorkers() {
        createEntityTable(
                "Работники подготовки состава",
                PreparationWorkers.getPropertyNames(),
                PreparationWorkers.getSortPropertyNames(),
                ServiceFactory.getPreparationWorkersService(),
                new PreparationWorkersInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openTrainComplexes() {
        createEntityTable(
                "Комплексы поезда",
                TrainComplexes.getPropertyNames(),
                TrainComplexes.getSortPropertyNames(),
                ServiceFactory.getTrainComplexesService(),
                new TrainComplexesInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openRoutes() {
        createEntityTable(
                "Маршруты",
                Routes.getPropertyNames(),
                Routes.getSortPropertyNames(),
                ServiceFactory.getRoutesService(),
                new RoutesInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openTrainDrivers() {
        createEntityTable(
                "Водители локомотивов",
                TrainDrivers.getPropertyNames(),
                TrainDrivers.getSortPropertyNames(),
                ServiceFactory.getTrainDriversService(),
                new TrainDriversInputFormBuilder(requestExecutor),
                null,
                new TrainDriversFilterBoxBuilder(),
                TrainDriversFilter::new
        );
    }

    @FXML
    void openMedicalExamination() {
        createEntityTable(
                "Мед комиссия",
                MedicalExamination.getPropertyNames(),
                MedicalExamination.getSortPropertyNames(),
                ServiceFactory.getMedicalExaminationService(),
                new MedicalExaminationInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }
    @FXML
    void openTrains() {
        createEntityTable(
                "Поезда",
                Trains.getPropertyNames(),
                Trains.getSortPropertyNames(),
                ServiceFactory.getTrainsService(),
                new TrainsInputFormBuilder(requestExecutor),
                null,
                new TrainsFilterBoxBuilder(),
                TrainsFilter::new
        );
    }

    @FXML
    void openConnectionRouteStation() {
        createEntityTable(
                "Связь маршрут - станция",
                ConnectionRouteStation.getPropertyNames(),
                ConnectionRouteStation.getSortPropertyNames(),
                ServiceFactory.getConnectionRouteStationService(),
                new ConnectionRouteStationInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openStations() {
        createEntityTable(
                "Станции",
                Stations.getPropertyNames(),
                Stations.getSortPropertyNames(),
                ServiceFactory.getStationsService(),
                new StationsInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }


    @FXML
    void openDepartment() {
        createEntityTable(
                "Отделы",
                Department.getPropertyNames(),
                Department.getSortPropertyNames(),
                ServiceFactory.getDepartmentService(),
                new DepartmentInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );

    }

    @FXML
    void openStationWorkers() {
        createEntityTable(
                "Работники",
                StationWorkers.getPropertyNames(),
                StationWorkers.getSortPropertyNames(),
                ServiceFactory.getStationWorkersService(),
                new StationWorkersInputFormBuilder(requestExecutor),
                null,
                new StationWorkersFilterBoxBuilder(),
                StationWorkersFilter::new
        );
    }

    @FXML
    void openPassengers() {
        createEntityTable(
                "Пассажиры",
                Passengers.getPropertyNames(),
                Passengers.getSortPropertyNames(),
                ServiceFactory.getPassengersService(),
                new PassengersInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openTickets() {
        createEntityTable(
                "Билеты",
                Tickets.getPropertyNames(),
                Tickets.getSortPropertyNames(),
                ServiceFactory.getTicketsService(),
                new TicketsInputFormBuilder(requestExecutor),
                null,
                new TicketsFilterBoxBuilder(),
                TicketsFilter::new
        );
    }

    @FXML
    void openFlight() {
        createEntityTable(
                "Рейсы",
                Flight.getPropertyNames(),
                Flight.getSortPropertyNames(),
                ServiceFactory.getFlightService(),
                new FlightInputFormBuilder(requestExecutor),
                null,
                new FlightFilterBoxBuilder(),
                FlightFilter::new
        );
    }

    @FXML
    void openConnectionBrigadeWorkers() {
        createEntityTable(
                "Работники в бригаде",
                ConnectionBrigadeWorkers.getPropertyNames(),
                ConnectionBrigadeWorkers.getSortPropertyNames(),
                ServiceFactory.getConnectionBrigadeWorkersService(),
                new ConnectionBrigadeWorkersInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );
    }

    @FXML
    void openBrigades() {
        createEntityTable(
                "Бригады",
                Brigades.getPropertyNames(),
                Brigades.getSortPropertyNames(),
                ServiceFactory.getBrigadesService(),
                new BrigadesInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );

    }

    @FXML
    void openWork() {
        createEntityTable(
                "Профессии",
                Work.getPropertyNames(),
                Work.getSortPropertyNames(),
                ServiceFactory.getWorkService(),
                new WorkInputFormBuilder(requestExecutor),
                null,
                null,
                null
        );

    }

    private void setStatusBarMessage(String message) {
        Platform.runLater(() -> {
            String messageTime = LocalDateFormatter.getFormattedDateTime(Instant.now().toEpochMilli());
            String messageWithTime = String.format("%s: %s", messageTime, message);
            statusBarLabel.textProperty().setValue(messageWithTime);
        });
    }

    @SneakyThrows
    private <T extends Entity> EntityTableController<T> createEntityTable(
            String tableName,
            Map<String, String> entityPropertyNames,
            Map<String, String> entitySortPropertyNames,
            Service<T> entityService,
            EntityInputFormBuilder<T> inputFormBuilder,
            ContextWindowBuilder<T> infoWindowBuilder,
            FilterBoxBuilder<T> filterBoxBuilder,
            Supplier<Filter> newFilterSupplier
    ) {
        FXMLLoader tableLoader = FxmlLoaderFactory.createEntityTableLoader();
        Node table = tableLoader.load();

        Tab tableTab = new Tab(tableName);
        tableTab.setContent(table);
        tableTab.setOnClosed(event -> {
            if (contentTabPane.getTabs().isEmpty()) {
                contentTabPane.getTabs().add(defaultTab);
            }
        });

        contentTabPane.getTabs().remove(defaultTab);
        contentTabPane.getTabs().add(tableTab);
        contentTabPane.getSelectionModel().select(tableTab);

        EntityTableController<T> controller = tableLoader.getController();
        controller.setInfoWindowBuilder(infoWindowBuilder);

        controller.setEntityRemover(entityService::deleteById);

        Node filterBox = null;
        if (filterBoxBuilder != null && newFilterSupplier != null) {
            Filter filter = newFilterSupplier.get();
            filterBox = filterBoxBuilder.buildFilterBox(filter);
            controller.setEntitySource(pageInfo -> entityService.search(filter, pageInfo));
        } else {
            controller.setEntitySource(entityService::getAll);
        }

        controller.setRequestExecutor(requestExecutor);

        controller.init(
                entityPropertyNames,
                entitySortPropertyNames,
                inputFormBuilder,
                null,
                false,
                this::setStatusBarMessage,
                filterBox,
                true
        );

        return controller;
    }

    @SneakyThrows
    private <T extends Entity> Node createInfoWindowEntityTable(
            Map<String, String> entityPropertyNames,
            Map<String, String> entitySortPropertyNames,
            EntityTableController.EntitySource<T> entitySource,
            EntityTableController.EntityRemover<T> entityRemover,
            EntityInputFormBuilder<T> inputFormBuilder,
            Supplier<T> newEntitySupplier
    ) {

        FXMLLoader tableLoader = FxmlLoaderFactory.createEntityTableLoader();
        Node table = tableLoader.load();

        EntityTableController<T> entityTableController = tableLoader.getController();
        entityTableController.setEntitySource(entitySource);
        entityTableController.setEntityRemover(entityRemover);
        entityTableController.setRequestExecutor(requestExecutor);
        entityTableController.init(
                entityPropertyNames,
                entitySortPropertyNames,
                inputFormBuilder,
                newEntitySupplier,
                true,
                this::setStatusBarMessage,
                null,
                true
        );

        return table;
    }
}
