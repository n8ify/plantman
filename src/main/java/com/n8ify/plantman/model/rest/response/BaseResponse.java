package com.n8ify.plantman.model.rest.response;

import com.n8ify.plantman.enums.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class BaseResponse<T> {

    private String requestId;
    private ResponseStatus responseStatus;
    private T body;

}
