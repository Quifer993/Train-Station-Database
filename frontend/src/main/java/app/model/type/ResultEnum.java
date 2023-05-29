package app.model.type;

import app.gui.custom.ChoiceItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ResultEnum {
    OK,
    NEGATIVE;

    public static String toLocalizedString(ResultEnum type) {
        return switch (type) {
            case OK -> "ОК";
            case NEGATIVE -> "Не годен";
        };
    }

    public static List<ChoiceItem<ResultEnum>> getChoiceItems() {
        return Arrays.stream(ResultEnum.values())
                     .map(s -> new ChoiceItem<>(s, ResultEnum.toLocalizedString(s)))
                     .collect(Collectors.toList());
    }
}
