package br.com.frederico;

import br.com.frederico.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {


    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id){
        logger.info("Finding One Person!");

        Person person = new Person();
        //vvv mock vvv
        person.setId(counter.incrementAndGet());
        person.setFirstName("Frederico");
        person.setLastName("Spiguel");
        person.setAdress("Rio de Janeiro - RJ - Brasil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){

        logger.info("Creating one Person!");

        return person;
    }

    public Person update(Person person){

        logger.info("Updating one Person!");

        return person;
    }

    public void delete(String id){

        logger.info("Deleting one Person!");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        //vvv mock vvv
        person.setId(counter.incrementAndGet());
        person.setFirstName("Firstname " + i);
        person.setLastName("Lastname " + i);
        person.setAdress("Some address in Brazil");
        person.setGender("Male");
        return person;
    }
}
