package com.fpa.fpaspringrestservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpa.fpaspringrestservice.domains.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}
