package com.api.savio.minhaapi.controller;

import com.api.savio.minhaapi.dto.request.PersonDTO;
import com.api.savio.minhaapi.dto.response.MessageResponseDTO;
import com.api.savio.minhaapi.exception.PersonNotFoundException;
import com.api.savio.minhaapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/people/all")
public class PersonAllController {
    private PersonService personService;

    @Autowired
    public PersonAllController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById() throws PersonNotFoundException {
        personService.deleteAll();
    }
}
