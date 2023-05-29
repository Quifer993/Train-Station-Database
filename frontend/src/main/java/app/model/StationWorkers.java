package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter @Setter
public class StationWorkers extends Entity {
    private String sex;
    private Integer amountChildren;
    private Date birthday;
    private Integer salary;
    private String firstName;
    private String lastName;
    private String surname;
    private Date hireDate;
    private Work work = new Work();
    private String workName;

    @Override
    public StationWorkers clone() {
        var clone = (StationWorkers) super.clone();
        if (work != null) clone.setWork(work.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (work != null) workName = work.getWorkName();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("lastName", "Фамилия");
        propertyNames.put("firstName", "Имя");
        propertyNames.put("surname", "Отчество");
        propertyNames.put("workName", "Профессия");
        propertyNames.put("salary", "Зарплата");
        propertyNames.put("amountChildren", "Количество детей");
        propertyNames.put("birthday", "День рождения");
        propertyNames.put("hireDate", "Дата найма");
        propertyNames.put("sex", "Пол");


        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("sex", "Пол");
        sortPropertyNames.put("amountChildren", "Количество детей");
        sortPropertyNames.put("salary", "Зарплата");
        sortPropertyNames.put("birthday", "День рождения");
        sortPropertyNames.put("lastName", "Фамилия");
        sortPropertyNames.put("firstName", "Имя");
        sortPropertyNames.put("surname", "Отчество");
        sortPropertyNames.put("hireDate", "Дата найма");
        sortPropertyNames.put("work", "Профессия");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
