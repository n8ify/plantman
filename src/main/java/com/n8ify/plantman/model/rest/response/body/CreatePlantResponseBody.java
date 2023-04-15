package com.n8ify.plantman.model.rest.response.body;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CreatePlantResponseBody {

    private Long registerId;
    private String plantName;

}
