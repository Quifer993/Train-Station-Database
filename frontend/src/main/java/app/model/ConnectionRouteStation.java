package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class ConnectionRouteStation extends Entity {
    private Routes routes = new Routes();
    private String nameRoute;
    private Stations stations = new Stations();
    private String placement;

    private Integer numberStationFromStart;
    private Integer timeToNextStation;
    private Integer timeWait;

    @Override
    public ConnectionRouteStation clone() {
        var clone = (ConnectionRouteStation) super.clone();
        if (routes != null) clone.setRoutes(routes.clone());
        if (stations != null) clone.setStations(stations.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (routes != null) nameRoute = routes.getNameRoute();
        if (stations != null) placement = stations.getPlacement();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.put("nameRoute", "Маршрут");
        propertyNames.put("placement", "Станция");
        propertyNames.put("numberStationFromStart", "Номер станции от начала");
        propertyNames.put("timeToNextStation", "Время в пути(мин)");
        propertyNames.put("timeWait", "Остановка(мин)");

        sortPropertyNames.put("routes", "Маршрут");
        sortPropertyNames.put("stations", "Станция");
        sortPropertyNames.put("numberStationFromStart", "Номер станции от начала");
        sortPropertyNames.put("timeToNextStation", "Время в пути(мин)");
        sortPropertyNames.put("timeWait", "Остановка(мин)");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
