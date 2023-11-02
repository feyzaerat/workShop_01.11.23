package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")

public class ProductController {
    @GetMapping
    public String getProducts(){
        return "Products";
    }
   @PostMapping
    public String postProducts(){
        return "Add Product";
   }
   @PutMapping
    public String putProducts(){
        return "Update Product";
   }
   @DeleteMapping
    public String deleteProducts(){
        return "Delete Product";
   }
}
