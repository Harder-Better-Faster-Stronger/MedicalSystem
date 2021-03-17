package com.medical.controller;

import com.medical.entity.Drug;
import com.medical.entity.HealthData;
import com.medical.entity.RespBean;
import com.medical.entity.Take_Drug_Record;
import com.medical.service.DrugService;
import com.medical.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("health")
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    DrugService drugService;

    public static RecordController recordController;

    @PostConstruct
    public void init(){
        recordController=this;
        recordController.recordService=this.recordService;
        recordController.drugService=this.drugService;
    }

    @RequestMapping(value = "/heart_rates")
    public List<HealthData> getHeartRate(){
        try{
            HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session=request.getSession();
            // TODO: Need to be deleted
            //session.setAttribute("uid","abc");
            String uid= (String) session.getAttribute("uid");
            if(uid!=null){
                List<HealthData> result=recordController.recordService.recent_heart_rate(uid);
                return result;
            }
        }catch (Exception e){
            return null;
        }
        return new ArrayList<>();
    }

    @RequestMapping(value = "/blood_pressure")
    public List<HealthData> getBloodPressure(){
        try{
            HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session=request.getSession();
            // TODO: Need to be deleted
            //session.setAttribute("uid","abc");
            String uid= (String) session.getAttribute("uid");
            if(uid!=null){
                List<HealthData> result=recordController.recordService.recent_blood_pressure(uid);
                return result;
            }
        }catch (Exception e){
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }

    @RequestMapping(value="/today_drugs")
    public List<Take_Drug_Record> getTodayDrug(){
        try{
            HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session=request.getSession();
            // TODO: Need to be deleted
            //session.setAttribute("uid","abc");
            String uid= (String) session.getAttribute("uid");
            if(uid!=null){
                List<Take_Drug_Record> result=recordController.recordService.drug_record(uid,new Date());
                return result;
            }
        }catch (Exception e){
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }

    @RequestMapping(value="/set_heart_rate={hr}")
    public RespBean setHeartRate(@PathVariable int hr){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid!=null){
            // set heart rate
            Date date=new Date();
            HealthData healthData=new HealthData(new java.sql.Date(date.getTime()),hr);
            recordController.recordService.setHeartRate(uid,healthData);
            return new RespBean("success","操作成功");
        }
        else
            return new RespBean("failed","操作失败");
    }

    @RequestMapping(value="/set_blood_pressure={hr}")
    public RespBean setBloodPressure(@PathVariable int hr){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid!=null){
            // set heart rate
            Date date=new Date();
            HealthData healthData=new HealthData(new java.sql.Date(date.getTime()),hr);
            recordController.recordService.setBloodPressure(uid,healthData);
            return new RespBean("success","操作成功");
        }
        else
            return new RespBean("failed","操作失败");
    }

    @RequestMapping(value="/set_new_drug",method = RequestMethod.POST)
    public RespBean setNewDrug(@RequestBody Take_Drug_Record record){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid!=null){
            // set heart rate
            Drug d=recordController.drugService.getDrugByName(record.dname).get(0);
            recordController.recordService.addNewDrugRecord(uid,d.getDid(),record.take_drug_time,record.number);
            return new RespBean("success","操作成功");
        }
        else
            return new RespBean("failed","操作失败");
    }

    @RequestMapping(value="/remove_new_drug/{id}")
    public RespBean removeNewDrug(@PathVariable Integer id){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid!=null){
            // set heart rate
            recordController.recordService.removeDrugRecord(id);
            return new RespBean("success","操作成功");
        }
        else
            return new RespBean("failed","操作失败");
    }

    @RequestMapping(value="/set_drug_taken/{id}")
    public RespBean setDrugTaken(@PathVariable Integer id){
        HttpServletRequest request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        String uid= (String) session.getAttribute("uid");
        if(uid!=null){
            // set heart rate
            recordController.recordService.setDrugTaken(id);
            return new RespBean("success","操作成功");
        }
        else
            return new RespBean("failed","操作失败");
    }
}
