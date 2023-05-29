package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class TrainComplexes extends Entity {

    private String nameComplexes;


    @Override
    public TrainComplexes clone() {
        var clone = (TrainComplexes) super.clone();
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("nameComplexes", "Комплекс");//в javafx

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("nameComplexes", "Комплекс");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
