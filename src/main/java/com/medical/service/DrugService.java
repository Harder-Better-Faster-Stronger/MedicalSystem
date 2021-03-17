package com.medical.service;


import com.medical.dao.DrugMapper;
import com.medical.entity.Drug;
import com.medical.entity.DrugExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Transactional
public class DrugService {
    @Autowired
    DrugMapper drugMapper;

    public static DrugService drugService;

    @PostConstruct
    public void init(){
        drugService=this;
        drugService.drugMapper=this.drugMapper;
    }

    public List<Drug> getDrugByName(String name){
        DrugExample ex=new DrugExample();
        ex.createCriteria().andNameLike(name);
        List<Drug> drugs= drugService.drugMapper.selectByExample(ex);
        return drugs;
    }

    public Drug getDrugByUid(Integer uid){
        DrugExample ex=new DrugExample();
        ex.createCriteria().andDidEqualTo(uid);
        List<Drug> drugs= drugService.drugMapper.selectByExample(ex);
        if(drugs.size()>0)
            return drugs.get(0);
        else
            return null;
    }

    public List<Drug> getDrugBySimilarName(String name){
        DrugExample ex=new DrugExample();
        ex.createCriteria().andNameLike('%'+name+'%');
        List<Drug> drugs= drugService.drugMapper.selectByExample(ex);
        return drugs;
    }

    public int addNewDrug(Drug drug){
        return drugService.drugMapper.insertSelective(drug);
    }

    public int updateDrug(Drug drug){
        return drugService.drugMapper.updateByPrimaryKey(drug);
    }
}
