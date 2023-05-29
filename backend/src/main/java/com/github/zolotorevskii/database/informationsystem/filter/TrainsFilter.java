package com.github.zolotorevskii.database.informationsystem.filter;

import com.github.zolotorevskii.database.informationsystem.entity.Routes;
import com.github.zolotorevskii.database.informationsystem.filter.type.LuggageEnum;
import com.github.zolotorevskii.database.informationsystem.filter.type.ResultEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TrainsFilter {
    Routes routes;
    LuggageEnum luggageEnum;
}
