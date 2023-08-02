package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	// business rules

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isIdExist(programmingLanguage.getId())) {
			throw new Exception("Current id value!");
		}

		if (isNameExist(programmingLanguage)) {
			throw new Exception("Program name cannot be repeated or empty!");
		}

		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		if (!isIdExist(programmingLanguage.getId())) {
			throw new Exception("Invalid id!");
		}
		if (isNameExist(programmingLanguage)) {
			throw new Exception("Invalid language name!");
		}
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public void delete(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Language id is not valid!");
		}
		programmingLanguageRepository.delete(id);
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Language id is not valid.");
		}
		return programmingLanguageRepository.getById(id);

	}

	public boolean isNameExist(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage language : getAll()) {
			if (language.getName().equals(programmingLanguage.getName()) || programmingLanguage.getName().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public boolean isIdExist(int id) {
		for (ProgrammingLanguage language : getAll()) {
			if (language.getId() == id) {
				return true;
			}
		}
		return false;
	}
}