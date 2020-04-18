package com.ilazarev.testaws.controller;

import com.ilazarev.testaws.model.Person;
import com.ilazarev.testaws.util.ApplicationConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonRestController {

    @PostMapping(value = "/person")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Person> custom(
            @ModelAttribute(ApplicationConstants.PERSON_FORM_MODEL) @Valid Person person
    ) {
        return new ResponseEntity(person, HttpStatus.OK);
    }

}
