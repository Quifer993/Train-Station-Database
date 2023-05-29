package app.model.type;

import app.gui.custom.ChoiceItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum LuggageEnum {
    HAVE,
    NOT;

    public static String toLocalizedString(LuggageEnum type) {
        return switch (type) {
            case HAVE -> "Есть";
            case NOT -> "Отсутсвует";
        };
    }

    public static List<ChoiceItem<LuggageEnum>> getChoiceItems() {
        return Arrays.stream(LuggageEnum.values())
                     .map(s -> new ChoiceItem<>(s, LuggageEnum.toLocalizedString(s)))
                     .collect(Collectors.toList());
    }
}
