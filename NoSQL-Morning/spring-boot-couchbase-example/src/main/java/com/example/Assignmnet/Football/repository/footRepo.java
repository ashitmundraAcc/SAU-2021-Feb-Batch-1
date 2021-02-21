package com.example.Assignmnet.Football.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Assignmnet.Football.models.football;


public interface footRepo extends CrudRepository<football, String> {
	football findByName(String name);
}