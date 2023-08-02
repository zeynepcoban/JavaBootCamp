package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

//add,update,delete methods

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Javascript"));
		programmingLanguages.add(new ProgrammingLanguage(3, "React"));
		programmingLanguages.add(new ProgrammingLanguage(4, "Node.js"));
		programmingLanguages.add(new ProgrammingLanguage(5, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(6, "Swift"));
		programmingLanguages.add(new ProgrammingLanguage(7, "Php"));
		programmingLanguages.add(new ProgrammingLanguage(8, "C#"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage programmingLanguage2 = getById(programmingLanguage.getId());
		programmingLanguage2.setName(programmingLanguage.getName());

	}

	@Override
	public void delete(int id) {
		programmingLanguages.remove(getById(id));

	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}
}