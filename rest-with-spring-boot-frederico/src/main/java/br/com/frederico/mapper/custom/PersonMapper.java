package br.com.frederico.mapper.custom;

import br.com.frederico.data.dto.v2.PersonDTOV2;
import br.com.frederico.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person){
        PersonDTOV2 dto = new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTOV2 person){
        Person dto = new Person();
        dto.setId(dto.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        // dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
        return dto;
    }
}
