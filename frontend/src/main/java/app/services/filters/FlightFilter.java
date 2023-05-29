package app.services.filters;

import app.model.Routes;
import app.model.StatusFlights;
import app.model.StatusTrains;
import app.model.type.LuggageEnum;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlightFilter implements Filter {
    Routes routes;
    StatusFlights statusFlights;
    StatusTrains statusTrains;
}