package com.itkweb.menotte.menotte_rs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.itkweb.menotte.menotte_rs.model.Project;

@Controller
@RequestMapping("/projets")
public class ProjectsService {

	List<Project> projects = new ArrayList<Project>();

	private final int id = 2;

	{
		Project project1 = new Project();
		project1.setNom("Nom projet");
		project1.setId(1);
		project1.setCreated_at(new Date());

		projects.add(project1);

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Project> getProjectsInJSON() {
		return projects;

	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void addProjectInJSON(@RequestBody final Project projet) {
		System.out.println("=========== CREATE :" + projet.getNom());

		projects.add(projet);
	}

	//	@RequestMapping(method = RequestMethod.POST)
	//	@ResponseStatus(HttpStatus.CREATED)
	//	public void addProjectInXml(@RequestBody final String xml) {
	//		System.out.println("=========== XML :" + xml);
	//		// projects.add(project1);
	//
	//	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void deleteProjectInJSON(@PathVariable Integer id) {


		System.out.println("=========== DELETE :" + id);
		// projects.add(project1);

	}

}
