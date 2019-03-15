package com.service;

import com.dao.PersonDao;
import com.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PersonService {
    @Autowired
    public PersonDao personDao;

    public void addPerson(Person person){
        personDao.addPerson(person);
    }
    public Person getPersonById(Integer id){
        return personDao.getPersonById(id);
    }
    public void updatePerson(Person person){
        personDao.updatePerson(person);
    }
    public void deleterPersonById(Integer id){
        personDao.deletePersonById(id);
    }
    public List<Person> getPersons(){
        return personDao.getPersons();
    }

}
