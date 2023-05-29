package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter @Setter
public class Trains extends Entity {
    private StatusTrains statusTrains = new StatusTrains();
    private String statusName;

    private Brigades brigadeTrainDrivers = new Brigades();
    private String brigadeTrainDriversId;

    private Brigades brigadeOperability = new Brigades();
    private String brigadeOperabilityId;

    private Brigades brigadePreparation = new Brigades();
    private String brigadePreparationId;

    private Stations stations = new Stations();
    private String placement;


    private Integer placesInRailwayCarriage;
    private Integer capacityRailwayCarriage;


    @Override
    public Trains clone() {
        var clone = (Trains) super.clone();
        if (statusTrains != null) clone.setStatusTrains(statusTrains.clone());
        if (stations != null) clone.setStations(stations.clone());
        if (brigadeTrainDrivers != null) clone.setBrigadeTrainDrivers(brigadeTrainDrivers.clone());
        if (brigadeOperability != null) clone.setBrigadeOperability(brigadeOperability.clone());
        if (brigadePreparation != null) clone.setBrigadePreparation(brigadePreparation.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (statusTrains != null) statusName = statusTrains.getNameStatus();
        if (stations != null) placement = stations.getPlacement();
        if (brigadeTrainDrivers != null) brigadeTrainDriversId = brigadeTrainDrivers.getId() + " " + brigadeTrainDrivers.getDepartment().getDepartmentName();
        if (brigadeOperability != null) brigadeOperabilityId = brigadeOperability.getId() + " " + brigadeOperability.getDepartment().getDepartmentName();
        if (brigadePreparation != null) brigadePreparationId = brigadePreparation.getId() + " " + brigadePreparation.getDepartment().getDepartmentName();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("statusName", "Тип поезда");
        propertyNames.put("capacityRailwayCarriage", "Вагонов");
        propertyNames.put("placesInRailwayCarriage", "Мест в вагоне");
        propertyNames.put("placement", "Станция");
        propertyNames.put("brigadeTrainDriversId", "Бригада водителей");
        propertyNames.put("brigadeOperabilityId", "Бригада починки");
        propertyNames.put("brigadePreparationId", "Бригада подготовки");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("statusTrains", "Тип поезда");
        sortPropertyNames.put("capacityRailwayCarriage", "Вагонов");
        sortPropertyNames.put("placesInRailwayCarriage", "Мест в вагоне");
        sortPropertyNames.put("stations", "Станция");
        sortPropertyNames.put("brigadeTrainDrivers", "Бригада водителей");
        sortPropertyNames.put("brigadeOperability", "Бригада починки");
        sortPropertyNames.put("brigadePreparation", "Бригада подготовки");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
