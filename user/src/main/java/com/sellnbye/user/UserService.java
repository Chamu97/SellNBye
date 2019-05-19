package com.sellnbye.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	 
	public List<register> listAll(){
		return repo.findAll();	
	}
	
	public void save(register name) {
		repo.save(name);
	}
	
	public register get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	}
	
	
		
	


