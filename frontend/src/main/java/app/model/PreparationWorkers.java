package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class PreparationWorkers extends StationWorkers {
    private TrainComplexes trainComplexes;
    private String nameComplexes;
//    private String nameWorker;

    public PreparationWorkers clone() {
        var clone = (PreparationWorkers) super.clone();
        if (trainComplexes != null) clone.setTrainComplexes(trainComplexes.clone());
//        nameWorker = this.getLastName() + " " + this.getFirstName();
        return clone;
    }
    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (trainComplexes != null) nameComplexes = trainComplexes.getNameComplexes();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
//        propertyNames.put("lastName", (StationWorkers.getPropertyNames()).get("lastName"));
//        propertyNames.put("firstName", (StationWorkers.getPropertyNames()).get("firstName"));
        propertyNames.put("nameComplexes", "Комплекс");
        propertyNames.put("lastName", "Рабочий");
        propertyNames.put("firstName", "Рабочий");

        sortPropertyNames.putAll(StationWorkers.getSortPropertyNames());
        sortPropertyNames.put("lastName", "Рабочий");
        sortPropertyNames.put("firstName", "Рабочий");
        sortPropertyNames.put("trainComplexes", "Комплекс");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
