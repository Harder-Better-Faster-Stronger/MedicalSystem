package com.medical.entity;

import java.sql.Time;
import java.util.Date;

public class Take_Drug_Record {
    public Integer id;
    public String uid;
    public String dname;
    public Time take_drug_time;
    public Integer number;
    public Boolean isTaken;

    public Take_Drug_Record(){

    }

    public Take_Drug_Record(Integer id, String uid, String dname, Time take_drug_time, Integer number) {
        this.id=id;
        this.uid=uid;
        this.dname = dname;
        this.take_drug_time = take_drug_time;
        this.number = number;
        this.isTaken = false;
    }

    public Take_Drug_Record(String dname,Time take_drug_time,Integer number){
        this.dname=dname;
        this.take_drug_time=take_drug_time;
        this.number=number;
    }
}
