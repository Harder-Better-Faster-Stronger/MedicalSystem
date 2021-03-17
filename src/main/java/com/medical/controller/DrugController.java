package com.medical.controller;


import com.medical.entity.Drug;
import com.medical.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/drugs")
public class DrugController {
    @Autowired
    DrugService drugService;

    public static DrugController drugController;

    @PostConstruct
    public void init(){
        drugController=this;
        drugController.drugService=this.drugService;
    }

    @RequestMapping("/search/{key}")
    public List<Drug> searchDrug(@PathVariable String key){
        return drugController.drugService.getDrugBySimilarName(key);
    }

    @RequestMapping("/get_info/{did}")
    public Drug getDrugInfo(@PathVariable Integer did){
        return drugController.drugService.getDrugByUid(did);
    }

}
