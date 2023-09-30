package Kodlama.io.Devs.webApi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.GetByIdProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguage")//http://localhost:8080/api/programminglanguage/getall

public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService=programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody() CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@DeleteMapping("/deleteById")
	public void delete(@PathVariable DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)	throws Exception {
		programmingLanguageService.delete(deleteProgrammingLanguageRequest);
	}
	@PutMapping("/update")
			public void update(@RequestBody() UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)throws Exception {
		programmingLanguageService.update(updateProgrammingLanguageRequest);
			}
	@GetMapping("getById")
	public GetByIdProgrammingLanguageResponse getById(GetByIdProgrammingLanguageRequest getByIdProgrammingLanguageRequest) {
		return programmingLanguageService.getById(getByIdProgrammingLanguageRequest);
		
	}
	

}
