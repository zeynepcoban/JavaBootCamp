package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.GetAllTechnologiesRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;

@RestController
@RequestMapping("/api/technologies")//http://localhost:8080/api/technologies
public class TechnologyController {
	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
	this.technologyService=technologyService;
	}

	@GetMapping("/getallTechnologiesByProgrammingLanguageId")
	public List<GetAllTechnologiesResponse> getAllByProgrammingLanguageId(
			GetAllTechnologiesRequest getAllTechnologiesRequest) {
		return technologyService.getAllByProgrammingLanguageId(getAllTechnologiesRequest);
	}
	@PostMapping("/addTechnologiesByProgrammingLanguageId")
	public void add( @RequestBody() CreateTechnologyRequest createTechnologyRequest) {
		technologyService.add(createTechnologyRequest);
	}
	@PutMapping("/updateTechnology")
	public void update( @RequestBody() UpdateTechnologyRequest UpdateTechnologyRequest) {
		technologyService.update(UpdateTechnologyRequest);
	}
	@DeleteMapping("/deleteTechnology")
	public void delete( @RequestBody() DeleteTechnologyRequest  deleteTechnologyRequest) {
		technologyService.delete(deleteTechnologyRequest);
	}
			

}
