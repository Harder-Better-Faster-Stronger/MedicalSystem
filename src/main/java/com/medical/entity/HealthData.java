package com.medical.entity;

import java.util.Date;

public class HealthData {


    public Date date;
    public Integer number;

    public HealthData(java.sql.Date date, Integer number) {
        this.date = new Date(date.getTime());
        this.number = number;
    }
}
