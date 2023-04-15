package com.n8ify.plantman.model.rest.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public abstract class BaseRequest<T> {

    private String requestId;
    private T body;

}
