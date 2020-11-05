package ru.otus.spring02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import ru.otus.spring02.dao.PersonDao;
import ru.otus.spring02.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    @Autowired
    public PersonServiceImpl(@Qualifier("personDaoSimple") PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
