package com.krill.quickdraw2.dao;

import com.krill.quickdraw2.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
