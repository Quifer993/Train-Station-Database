package app.model.type;

import app.gui.custom.ChoiceItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SexEnum {
    MALE,
    FEMALE;

    public static String toLocalizedString(SexEnum type) {
        return switch (type) {
            case MALE -> "Мужчина";
            case FEMALE -> "Женщина";
        };
    }

    public static List<ChoiceItem<SexEnum>> getChoiceItems() {
        return Arrays.stream(SexEnum.values())
                     .map(s -> new ChoiceItem<>(s, SexEnum.toLocalizedString(s)))
                     .collect(Collectors.toList());
    }
}
