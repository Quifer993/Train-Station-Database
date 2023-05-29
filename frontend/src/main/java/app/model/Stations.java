package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class Stations extends Entity {

    private String placement;


    @Override
    public Stations clone() {
        return (Stations) super.clone();
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("placement", "Станция");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("placement", "Станция");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
