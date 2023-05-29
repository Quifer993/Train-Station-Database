package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class ConnectionBrigadeWorkers extends Entity {
    private Brigades brigades = new Brigades();
    private Long brigadeId;
    private StationWorkers stationWorkers = new StationWorkers();
    private String stationWorkerName;

    @Override
    public ConnectionBrigadeWorkers clone() {
        var clone = (ConnectionBrigadeWorkers) super.clone();
        if (brigades != null) clone.setBrigades(brigades.clone());
        if (stationWorkers != null) clone.setStationWorkers(stationWorkers.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (brigades != null) brigadeId = brigades.getId();
        if (stationWorkers != null) stationWorkerName = stationWorkers.getLastName() + ' ' + stationWorkers.getFirstName();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.put("brigadeId", "Номер бригады");
        propertyNames.put("stationWorkerName", "Работник");

        sortPropertyNames.put("brigades", "Номер бригады");
        sortPropertyNames.put("stationWorkers", "Работник");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
