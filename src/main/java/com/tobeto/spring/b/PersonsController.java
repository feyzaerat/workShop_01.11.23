package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")
public class PersonsController {
@GetMapping
    public String get(){
    return "Persons List";
}
@PostMapping
    public String post(){
    return "Add New Person";
}

@PutMapping
    public String put(){
    return "Update Person";
}
@DeleteMapping
    public String delete(){
    return "Delete Person";
}
}
