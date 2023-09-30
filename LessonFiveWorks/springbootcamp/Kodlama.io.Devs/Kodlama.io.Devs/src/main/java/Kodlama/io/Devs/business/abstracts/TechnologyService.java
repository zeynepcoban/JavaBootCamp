package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.GetAllTechnologiesRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;

public interface TechnologyService  {
	List<GetAllTechnologiesResponse> getAllByProgrammingLanguageId(GetAllTechnologiesRequest getAllTechnologiesRequest);
	
	void add(CreateTechnologyRequest createTechnologyRequest);
	
	void update(UpdateTechnologyRequest updateTechnologyRequest);
	
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);


}
