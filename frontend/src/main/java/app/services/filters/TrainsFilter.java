package app.services.filters;

import app.model.Routes;
import app.model.type.LuggageEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TrainsFilter implements Filter {
    Routes routes;
    LuggageEnum luggageEnum;
}