package com.example.Assignmnet.BMS.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignmnet.BMS.models.bms;
import com.example.Assignmnet.BMS.repository.bmsRepo;

@RestController
public class bmsControl {
	@Autowired
    bmsRepo bmsRepos;
	
    @PostMapping("/bms")
    public bms addMovie(@RequestBody bms newMovie) {
        return bmsRepos.save(newMovie);
    }
    
    @GetMapping("/bms/movie/{name}")
    public bms getMovieByName(@PathVariable String name) {
        return bmsRepos.findByName(name);
    }
    
    @GetMapping("/bms/city/{cityPin}")
    public ArrayList<String> getMovieByCityPin(@PathVariable String cityPin) {
    	ArrayList<String> bmsAll = new ArrayList<>();
        bmsRepos.findAll().forEach(bms -> {
        	ArrayList<String> city = bms.getCity();
            if (city!=null && city.contains(cityPin)) {
            	bmsAll.add(bms.getName()); 
            }});
        return bmsAll;
    }
    
    @DeleteMapping("/bms/{id}")
    public String deleteBmsById(@PathVariable String id) {
    	bmsRepos.deleteById(id);
    	return "deleted";
    }
    
}
