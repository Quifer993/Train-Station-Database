package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class Brigades extends Entity {
    private Department department = new Department();
    private String departmentName;

    @Override
    public Brigades clone() {
        var clone = (Brigades) super.clone();
        if (department != null) clone.setDepartment(department.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (department != null) departmentName = department.getDepartmentName();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("departmentName", "Название отдела");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("department", "Название отдела");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
