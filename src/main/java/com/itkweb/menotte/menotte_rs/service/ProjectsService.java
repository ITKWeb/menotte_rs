package com.itkweb.menotte.menotte_rs.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.itkweb.menotte.menotte_rs.dao.ProjectDao;
import com.itkweb.menotte.menotte_rs.model.Project;

@Controller
@RequestMapping("/projets")
public class ProjectsService {

	@Autowired
	private ProjectDao projectDao;

	@RequestMapping(method = RequestMethod.GET //, headers="Accept=application/json"
			//			, produces="application/json"
			)
	public @ResponseBody
	List<Project> getProjectsInJSON() {
		List<Project> projects = projectDao.getProjects();
		if(projects.size() == 0) {
			Project p = new Project();
			p.setNom("Test") ;
			p.setId(0);
			p.setCreated_at(new Date()) ;
			p.setUpdated_at(new Date());
			projectDao.create(p) ;
			projects = projectDao.getProjects();
		}

		System.out.println("=========== PROJETS :" + projects.size());
		return projects;

	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addProjectInJSON(@RequestBody final Project projet) {
		System.out.println("=========== CREATE :" + projet.getNom());

		projectDao.create(projet);
	}

	// @RequestMapping(method = RequestMethod.POST)
	// @ResponseStatus(HttpStatus.CREATED)
	// public void addProjectInXml(@RequestBody final String xml) {
	// System.out.println("=========== XML :" + xml);
	// // projects.add(project1);
	//
	// }

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void deleteProjectInJSON(@PathVariable Integer id) {

		System.out.println("=========== DELETE :" + id);
		projectDao.delete(id);

	}

}
