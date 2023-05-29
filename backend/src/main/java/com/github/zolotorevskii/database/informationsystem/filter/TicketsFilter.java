package com.github.zolotorevskii.database.informationsystem.filter;

import com.github.zolotorevskii.database.informationsystem.dto.FlightDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketsFilter {
    FlightDto flight;
}
