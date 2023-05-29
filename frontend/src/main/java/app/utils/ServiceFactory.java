package app.utils;

import app.model.*;
import app.services.*;
import app.services.impl.*;
import app.services.impl.api.PassengersServiceApi;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ServiceFactory {

    private static final String SERVER_HOSTNAME = "http://localhost:8080/api/v1/";

    public DepartmentService getDepartmentService() {
        return new DepartmentServiceImpl(SERVER_HOSTNAME);
    }

    public WorkService getWorkService() {
        return new WorkServiceImpl(SERVER_HOSTNAME);
    }

    public static BrigadesService getBrigadesService() { return new BrigadesServiceImpl(SERVER_HOSTNAME); }

    public static Service<StationWorkers> getStationWorkersService() {
        return new StationWorkersServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<ConnectionBrigadeWorkers> getConnectionBrigadeWorkersService() {
        return new ConnectionBrigadeWorkersServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<StatusPreparation> getStatusPreparationService() {
        return new StatusPreparationServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<StatusOperability> getStatusOperabilityService() {
        return new StatusOperabilityServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<StatusPassengers> getStatusPassengersService() {
        return new StatusPassengersServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<StatusFlights> getStatusFlightsService() {
        return new StatusFlightsServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<StatusTrains> getStatusTrainsService() {
        return new StatusTrainsServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<TrainDrivers> getTrainDriversService() {
        return new TrainDriversServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<MedicalExamination> getMedicalExaminationService() {
        return new MedicalExaminationServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<Routes> getRoutesService() {
        return new RoutesServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<Stations> getStationsService() {
        return new StationsServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<ConnectionRouteStation> getConnectionRouteStationService() {
        return new ConnectionRouteStationServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<TrainComplexes> getTrainComplexesService() {
        return new TrainComplexesServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<PreparationWorkers> getPreparationWorkersService() {
        return new PreparationWorkersServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<Trains> getTrainsService() {
        return new TrainsServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<Passengers> getPassengersService() {
        return new PassengersServiceImpl(SERVER_HOSTNAME);
    }

    public static Service<Flight> getFlightService() {
        return new FlightServiceImpl(SERVER_HOSTNAME);
    }
    public static Service<Tickets> getTicketsService() {
        return new TicketsServiceImpl(SERVER_HOSTNAME);
    }
}
