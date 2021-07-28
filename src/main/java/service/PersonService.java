package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Person;
import repository.PersonRepository;

@Service
public class PersonService {

	public static PersonRepository personRepository;
	
	//Dependency Injection
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}
	
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
}
