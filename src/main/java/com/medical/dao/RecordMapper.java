package com.medical.dao;

import com.medical.entity.HealthData;
import com.medical.entity.Take_Drug_Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Mapper
public interface RecordMapper {
    List<Take_Drug_Record> drugs_need_to_take(String uid);

    List<Integer> all_drugs(Date date);

    int check_is_taken(@Param("id") Integer id, @Param("day") Date date);

    List<HealthData> heart_rates(String uid);

    List<HealthData> blood_pressures(String uid);

    int setBloodPressure(@Param("uid") String uid,@Param("date") Date date,@Param("number") Integer number);

    int setHeartRate(@Param("uid") String uid,@Param("date") Date date,@Param("number") Integer number);

    int add_drug_record(@Param("uid") String uid, @Param("did") Integer did, @Param("time")Time time, @Param("number") Integer number);

    int delete_drug_record(Integer id);

    int setDrugTaken(Integer id);
}
