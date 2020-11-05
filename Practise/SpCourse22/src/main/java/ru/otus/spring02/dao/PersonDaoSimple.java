package ru.otus.spring02.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.otus.spring02.domain.Person;

@Repository
public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
