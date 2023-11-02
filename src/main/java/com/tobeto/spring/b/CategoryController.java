package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")

public class CategoryController {

    @GetMapping
    public String get() {
        return "Category";
    }

    @PostMapping
    public String post() {
        return "Add Category";
    }

    @PutMapping
    public String put() {
        return "Update Category";
    }

    @DeleteMapping
    public String delete() {
        return "Delete Category";
    }
}



