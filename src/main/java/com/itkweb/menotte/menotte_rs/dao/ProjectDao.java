package com.itkweb.menotte.menotte_rs.dao;

import java.util.List;

import com.itkweb.menotte.menotte_rs.model.Project;

public interface ProjectDao {

	List<Project> getProjects();

	void create(Project projet);

	void delete(Integer id);

	Project getProject(Integer idProject);

}
