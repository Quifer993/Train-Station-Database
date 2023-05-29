package app.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter @Setter
public class Tickets extends Entity {
    private Integer price;
    private Integer placeRailwayCarriage;
    private Integer railwayCarriage;

    private String luggage;

    private String flightData;
    private Flight flight;

    private String passengersName;
    private Passengers passengers;

    private String statusPassengersName;
    private StatusPassengers statusPassengers;

    private Date timeBooking;
    private Date timeSale;
    private Date timeTicketReturn;

    private String startStationName;
    private Stations startStation;

    private String finishStationName;
    private Stations finishStation;

    @Override
    public Tickets clone() {
        var clone = (Tickets) super.clone();
        if (flight != null) clone.setFlight(flight.clone());
        if (passengers != null) clone.setPassengers(passengers.clone());
        if (statusPassengers != null) clone.setStatusPassengers(statusPassengers.clone());
        if (startStation != null) clone.setStartStation(startStation.clone());
        if (finishStation != null) clone.setFinishStation(finishStation.clone());
        return clone;
    }

    @Override
    public void calculateProperties() {
        super.calculateProperties();
        if (flight != null) flightData = flight.getId() + " " + flight.getRoutes().getNameRoute();
        if (passengers != null) passengersName = passengers.getLastName() + " " + passengers.getFirstName();
        if (statusPassengers != null) statusPassengersName = statusPassengers.getNameStatus();
        if (startStation != null) startStationName = startStation.getPlacement();
        if (finishStation != null) finishStationName = finishStation.getPlacement();
    }

    private static final Map<String, String> propertyNames = new LinkedHashMap<>();
    private static final Map<String, String> sortPropertyNames = new HashMap<>();

    static {
        propertyNames.putAll(Entity.getPropertyNames());
        propertyNames.put("flightData", "Рейс");
        propertyNames.put("passengersName", "Пассажир");
        propertyNames.put("statusPassengersName", "Статус пассажира");
        propertyNames.put("startStationName", "Начальная станция");
        propertyNames.put("finishStationName", "Конечная станция");
        propertyNames.put("placeRailwayCarriage", "Место в вагоне");
        propertyNames.put("luggage", "Багаж");
        propertyNames.put("timeBooking", "Время брони");
        propertyNames.put("timeSale", "Время продажи");
        propertyNames.put("timeTicketReturn", "Время возврата");
        propertyNames.put("price", "Цена");

        sortPropertyNames.putAll(Entity.getSortPropertyNames());
        sortPropertyNames.put("flight", "Рейс");
        sortPropertyNames.put("passengers", "Пассажир");
        sortPropertyNames.put("statusPassengers", "Статус пассажира");
        sortPropertyNames.put("startStation", "Начальная станция");
        sortPropertyNames.put("finishStation", "Конечная станция");
        sortPropertyNames.put("placeRailwayCarriage", "Место в вагоне");
        sortPropertyNames.put("luggage", "Багаж");
        sortPropertyNames.put("timeBooking", "Время брони");
        sortPropertyNames.put("timeSale", "Время продажи");
        sortPropertyNames.put("timeTicketReturn", "Время возврата");
        sortPropertyNames.put("price", "Цена");
    }

    public static Map<String, String> getPropertyNames() {
        return Collections.unmodifiableMap(propertyNames);
    }

    public static Map<String, String> getSortPropertyNames() {
        return Collections.unmodifiableMap(sortPropertyNames);
    }
}
