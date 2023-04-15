package com.n8ify.plantman.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PlantType {

    LEAFY_GREEN("กลุ่มกินใบ"),
    CRUCIFEROUS("กลุ่มกะหล่ำ"),
    MARROW("กลุ่มแตง"),
    ROOT("กลุ่มกินราก"),
    EDIBLE_PLANT_STEM("กลุ่มกินต้น"),
    ALLIUM("กลุ่มกระเทียม");

    private final String descTh;

}
