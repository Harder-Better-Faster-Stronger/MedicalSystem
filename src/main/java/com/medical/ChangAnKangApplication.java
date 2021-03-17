package com.medical;

import com.medical.entity.Take_Drug_Record;
import com.medical.service.RecordService;
import com.medical.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ChangAnKangApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangAnKangApplication.class, args);
		RecordService recordService=new RecordService();
		List<Take_Drug_Record> lst=recordService.drug_record("abc",new Date());
		System.out.println(lst);

	}

}
