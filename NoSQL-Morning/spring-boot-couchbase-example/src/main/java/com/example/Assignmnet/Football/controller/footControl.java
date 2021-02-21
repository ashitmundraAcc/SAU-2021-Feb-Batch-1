package com.example.Assignmnet.Football.controller;
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

import com.example.Assignmnet.Football.models.football;
import com.example.Assignmnet.Football.repository.footRepo;

@RestController
public class footControl {

	@Autowired
	footRepo footRepos;
	
    @PostMapping("/football")
    public football addPlayer(@RequestBody football newFootball) {
        return footRepos.save(newFootball);
    }
    
    @GetMapping("/football/{id}")
    public Optional<football> getPlayerById(@PathVariable String id) {
        if (footRepos.existsById(id)) {
            return footRepos.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/football/allTop/top")
    public ArrayList<String> getFootballer() {
    	ArrayList<String> footData=new ArrayList<String>();
    	footRepos.findAll().forEach(footballer -> {
        	int goals = footballer.getGoals();
        	if(goals>10)
        		footData.add(footballer.getName());
        });
        return footData;
    }
}
