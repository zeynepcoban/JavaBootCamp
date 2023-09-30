package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.GetAllTechnologiesRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.Technology;
@Service
public class TechnologyManager implements TechnologyService{
	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
		this.technologyRepository=technologyRepository;
		this.programmingLanguageRepository=programmingLanguageRepository;
		
	}

	@Override
	public List<GetAllTechnologiesResponse> getAllByProgrammingLanguageId(
			GetAllTechnologiesRequest getAllTechnologiesRequest) {
	List<Technology> technologies=technologyRepository.findAll();
	List<GetAllTechnologiesResponse> technologiesResponses=new ArrayList<GetAllTechnologiesResponse>();
	for(Technology technology:technologies) {
		GetAllTechnologiesResponse responseItem=new GetAllTechnologiesResponse();
		if(getAllTechnologiesRequest.getId()==technology.getProgrammingLanguage().getId()) {
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			technologiesResponses.add(responseItem);
		}
	}
		return technologiesResponses;
	}

	
	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
	 
	    Technology technology = new Technology();
	    technology.setName(createTechnologyRequest.getName());

	 
	    ProgrammingLanguage language = programmingLanguageRepository.findById(createTechnologyRequest.getLanguageid()).orElse(null);
	    technology.setProgrammingLanguage(language);

	
	    this.technologyRepository.save(technology);
	}


	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
	  Technology technology=technologyRepository.findById(updateTechnologyRequest.getTechnologyId()).get();
	  technology.setName(updateTechnologyRequest.getTechnologyName());
	  this.technologyRepository.save(technology);
		
	}

	
	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
	    Optional<Technology> technologyOptional = technologyRepository.findById(deleteTechnologyRequest.getId());
	    
	    technologyOptional.ifPresent(technology -> {
	        ProgrammingLanguage language = technology.getProgrammingLanguage();
	        if (language != null) {
	            language.getTechnologies().remove(technology);
	            technology.setProgrammingLanguage(null);
	        }
	        technologyRepository.delete(technology);
	    });
	}

	

}
