package app.services.filters;

import app.model.Flight;
import app.model.Routes;
import app.model.type.LuggageEnum;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TicketsFilter implements Filter {
    Flight flight;
}