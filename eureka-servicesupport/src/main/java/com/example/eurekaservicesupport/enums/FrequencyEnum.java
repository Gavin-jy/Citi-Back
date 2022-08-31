package com.example.eurekaservicesupport.enums;

import java.util.Calendar;

public enum FrequencyEnum {
    _1D(Calendar.DATE, 0),
    _1W(Calendar.DATE, -6),
    _2W(Calendar.DATE, -13),
    _1M(Calendar.MONTH, -1),
    _3M(Calendar.MONTH, -3),
    _6M(Calendar.MONTH, -6),
    _1Y(Calendar.YEAR, -1),
    _YTD(Calendar.DATE, +1);

    private final Integer unit;
    private final Integer duration;

    private FrequencyEnum(Integer unit, Integer duration){
        this.unit = unit;
        this.duration = duration;
    }

    public Integer getUnit(){
        return unit;
    }

    public Integer getDuration(){
        return duration;
    }
}
