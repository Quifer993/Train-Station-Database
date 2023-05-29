package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class Routes extends Entity {

    private String nameRoute;


    @Override
    public Routes clone() {
        return (Routes) super.clone();
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("nameRoute", "Маршрут");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("nameRoute", "Маршрут");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
