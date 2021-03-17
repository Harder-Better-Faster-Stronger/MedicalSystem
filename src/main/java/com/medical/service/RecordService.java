package com.medical.service;

import com.medical.dao.RecordMapper;
import com.medical.entity.HealthData;
import com.medical.entity.Take_Drug_Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Component
@Transactional
public class RecordService {

    @Autowired
    RecordMapper recordMapper;

    public static RecordService recordService;


    @PostConstruct
    public void init(){
        recordService=this;
        recordService.recordMapper=this.recordMapper;
    }

    public List<Take_Drug_Record> drug_record(String uid, Date date){
        List<Take_Drug_Record> lst=recordService.recordMapper.drugs_need_to_take(uid);
        List<Integer> result=recordService.recordMapper.all_drugs(date);
        for(Take_Drug_Record t:lst){
            t.isTaken=(result.contains(t.id));
        }
        return lst;
    }

    public List<HealthData> recent_heart_rate(String uid){
        return recordService.recordMapper.heart_rates(uid);
    }

    public List<HealthData> recent_blood_pressure(String uid){
        return recordService.recordMapper.blood_pressures(uid);
    }

    public int setBloodPressure(String uid,HealthData healthData){
        return recordService.recordMapper.setBloodPressure(uid,healthData.date,healthData.number);
    }

    public int setHeartRate(String uid,HealthData healthData){
        return recordService.recordMapper.setHeartRate(uid,healthData.date,healthData.number);
    }

    public int addNewDrugRecord(String uid, Integer did, Time time,Integer number){
        return recordService.recordMapper.add_drug_record(uid,did,time,number);
    }

    public int removeDrugRecord(Integer id){
        return recordService.recordMapper.delete_drug_record(id);
    }

    public int setDrugTaken(Integer id){
        return recordService.recordMapper.setDrugTaken(id);
    }
}
