package com.n8ify.plantman.model.rest.request.body;

import com.n8ify.plantman.enums.PlantType;
import lombok.*;

import javax.validation.constraints.NotNull;
@Data
public class CreatePlantRequestBody {


    @NotNull
    private String name;
    private String remark;

    @NotNull
    private PlantType plantType;

    @NotNull
    private Integer growthDay;
    private String tag;

    @NotNull
    private Boolean availableToPlant;

}
