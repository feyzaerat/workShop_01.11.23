package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")

public class PersonsController {
    @GetMapping
    public String get() {
        return "Persons";
    }

    @PostMapping
    public String post() {
        return "Add Person";
    }

    @PutMapping
    public String put() {
        return "Update Person";
    }

    @DeleteMapping
    public String delete() {
        return "Delete Person";
    }
}
