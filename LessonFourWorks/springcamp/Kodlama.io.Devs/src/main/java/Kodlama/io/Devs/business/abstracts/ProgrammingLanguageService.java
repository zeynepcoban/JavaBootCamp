package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void update(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(int id) throws Exception;

	ProgrammingLanguage getById(int id) throws Exception;

}
