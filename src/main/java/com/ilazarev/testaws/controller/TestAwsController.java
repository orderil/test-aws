package com.ilazarev.testaws.controller;

import com.ilazarev.testaws.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

/**
 * A test controller.
 */
@RestController
public class TestAwsController {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping(value = "/getTestData")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getTestData(
            @RequestParam(value = "param1") Long param1
    ) {
        log.debug("param1 = {}", param1);
        return new ResponseEntity("This is a response from /getTestData: param1=" + param1, HttpStatus.OK);
    }

    @GetMapping(value = "/getPersonData")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> getPersonData(
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "age") int age
    ) {
        log.debug("firstName = {}", firstName);
        log.debug("lastName = {}", lastName);
        log.debug("age = {}", age);
        Person person = new Person(firstName, lastName, age);
        return new ResponseEntity(person, HttpStatus.OK);
    }

}
