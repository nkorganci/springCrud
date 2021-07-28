package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Person;

// if a class take parameter , it is called generic
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
