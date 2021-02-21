package com.example.Assignmnet.BMS.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.Assignmnet.BMS.models.bms;

public interface bmsRepo extends CrudRepository<bms, String> {	
	bms findByName(String name);
}


