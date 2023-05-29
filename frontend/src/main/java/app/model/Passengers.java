package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter @Setter
public class Passengers extends Entity {
    private String sex;
    private Date birthday;
    private String firstName;
    private String lastName;
    private String surname;

    @Override
    public Passengers clone() {
        return (Passengers) super.clone();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("lastName", "Фамилия");
        propertyNames.put("firstName", "Имя");
        propertyNames.put("surname", "Отчество");
        propertyNames.put("birthday", "День рождения");
        propertyNames.put("sex", "Пол");


        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("sex", "Пол");
        sortPropertyNames.put("birthday", "День рождения");
        sortPropertyNames.put("lastName", "Фамилия");
        sortPropertyNames.put("firstName", "Имя");
        sortPropertyNames.put("surname", "Отчество");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
