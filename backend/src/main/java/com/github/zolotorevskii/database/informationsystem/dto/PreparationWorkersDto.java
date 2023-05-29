package com.github.zolotorevskii.database.informationsystem.dto;

import com.github.zolotorevskii.database.informationsystem.entity.TrainComplexes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreparationWorkersDto extends StationWorkersDto {
    TrainComplexesDto trainComplexes;
}
