package com.itkweb.menotte.menotte_rs.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itkweb.menotte.menotte_rs.dao.ProjectDao;
import com.itkweb.menotte.menotte_rs.model.Project;
import com.itkweb.menotte.menotte_rs.repositories.ProjectRepository;

@Service
public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public List<Project> getProjects() {
		return projectRepository.findAll();
	}

	@Override
	public void create(Project projet) {
		projectRepository.save(projet);
	}

	@Override
	public void delete(Integer id) {
		projectRepository.delete(id);

	}

	@Override
	public Project getProject(Integer idProject) {
		return projectRepository.findOne(idProject);
	}

}
