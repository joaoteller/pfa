package com.fpa.fpaspringrestservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpa.fpaspringrestservice.domains.Module;
import com.fpa.fpaspringrestservice.services.ModuleService;

@RestController
@RequestMapping("modules")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
	@GetMapping
	public List<Module> findAll() {
		return this.moduleService.findAll();
	}
	
}
