package com.example.Assignmnet.BMS.models;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class bms {
	@Id
    String id;
    
	@NotNull
    @Field
    String name;
    
	@NotNull
    @Field
    ArrayList<String> cityPin;
	
	public String getId() {
		return id;
		
	}
	public void setId(String id) {
		this.id=id;
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getCity() {
		return cityPin;
	}

	public void setCity(ArrayList<String> cityPin) {
		this.cityPin = cityPin;
	}

	public bms(String id, String name, ArrayList<String> cityPin) {
		super();
		this.id = id;
		this.name = name;
		this.cityPin = cityPin;
	}
}