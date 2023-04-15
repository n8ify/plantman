package com.n8ify.plantman.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {

    SUCCESS("00000"), ERROR_UNKNOWN("99999");

    private final String errorCode;

}
