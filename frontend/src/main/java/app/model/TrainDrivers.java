package app.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter @Setter
public class TrainDrivers extends StationWorkers {
    public TrainDrivers clone() {
        return (TrainDrivers) super.clone();
    }
}
