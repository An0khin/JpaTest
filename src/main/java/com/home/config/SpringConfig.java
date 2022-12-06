package com.home.config;

import com.home.model.Person;
import com.home.model.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;

public class SpringConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.home");
        applicationContext.refresh();

        PersonService personService = (PersonService) applicationContext.getBean("personService");
        personService.test();

        applicationContext.close();
    }
}
