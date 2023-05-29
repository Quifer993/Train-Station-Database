package app.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter @Setter
public class Flight extends Entity {
    private Integer priceFlight;
    private Date timeStart;

    private String statusPreparationName;
    private StatusPreparation statusPreparation = new StatusPreparation();

    private String statusOperabilityName;
    private StatusOperability statusOperability = new StatusOperability();

    private String statusFlightsName;
    private StatusFlights statusFlights = new StatusFlights();

    private String trainsData;
    private Trains trains = new Trains();

    private String routeName;
    private Routes routes = new Routes();

    @Override
    public Flight clone() {
        var clone = (Flight) super.clone();
        if (statusPreparation != null) clone.setStatusPreparation(statusPreparation.clone());
        if (statusOperability != null) clone.setStatusOperability(statusOperability.clone());
        if (statusFlights != null) clone.setStatusFlights(statusFlights.clone());
        if (trains != null) clone.setTrains(trains.clone());
        if (routes != null) clone.setRoutes(routes.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (statusPreparation != null) statusPreparationName = statusPreparation.getNameStatus();
        if (statusOperability != null) statusOperabilityName = statusOperability.getNameStatus();
        if (statusFlights != null) statusFlightsName = statusFlights.getNameStatus();
        if (trains != null) trainsData = trains.getId() + " " + trains.getStatusTrains().getNameStatus();
        if (routes != null) routeName = routes.getNameRoute();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("priceFlight", "Цена");
        propertyNames.put("timeStart", "Время выезда");
        propertyNames.put("statusPreparationName", "Подготовка состава");
        propertyNames.put("statusOperabilityName", "Работоспособность");
        propertyNames.put("statusFlightsName", "Статус рейса");
        propertyNames.put("trainsData", "Поезд");
        propertyNames.put("routeName", "Маршрут");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("priceFlight", "Цена");
        sortPropertyNames.put("timeStart", "Время выезда");
        sortPropertyNames.put("statusPreparation", "Подготовка состава");
        sortPropertyNames.put("statusOperability", "Работоспособность");
        sortPropertyNames.put("statusFlights", "Статус рейса");
        sortPropertyNames.put("trains", "Поезд");
        sortPropertyNames.put("routes", "Маршрут");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
