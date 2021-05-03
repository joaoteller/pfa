package com.fpa.fpaspringrestservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpa.fpaspringrestservice.domains.Module;
import com.fpa.fpaspringrestservice.repository.ModuleRepository;

@Service
public class ModuleService {

	@Autowired
	private ModuleRepository repository;

	public List<Module> findAll() {
		return this.repository.findAll();
	}

}
