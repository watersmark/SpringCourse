package ru.otus.spring02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.otus.spring02.dao.PersonDao;
import ru.otus.spring02.service.PersonService;
import ru.otus.spring02.service.PersonServiceImpl;

@Configuration
@ComponentScan
public class ServicesConfig {

    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }

}
