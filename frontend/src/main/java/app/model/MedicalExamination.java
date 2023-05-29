package app.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter @Setter
public class MedicalExamination extends Entity {
    private TrainDrivers trainDrivers = new TrainDrivers();
    private String trainDriversName;
    Date dateMedicalExamination;
    String result;
    String description;

    @Override
    public MedicalExamination clone() {
        var clone = (MedicalExamination) super.clone();
        if (trainDrivers != null) clone.setTrainDrivers(trainDrivers.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (trainDrivers != null) trainDriversName = trainDrivers.getLastName() + ' ' + trainDrivers.getFirstName();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("trainDriversName", "Сотрудник");
        propertyNames.put("dateMedicalExamination", "Дата проверки");
        propertyNames.put("result", "Результат");
        propertyNames.put("description", "Описание");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("trainDrivers", "Сотрудник");
        sortPropertyNames.put("dateMedicalExamination", "Дата проверки");
        sortPropertyNames.put("result", "Результат");
        sortPropertyNames.put("description", "Описание");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
