package ru.otus.spring02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring02.dao.PersonDao;
import ru.otus.spring02.dao.PersonDaoSimple;

@Configuration
@ComponentScan(basePackages = "ru.otus.spring02.dao")
public class DaoConfig {

    @Bean
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }
}
