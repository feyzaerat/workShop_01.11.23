package com.tobeto.spring.b;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductsController {
   @GetMapping
    public String getProducts(){
       return "Product List";
   }
    @PostMapping
    public String postProduct(){
        return "Add New Product";
    }

    @PutMapping
    public String putProduct(){
       return "Update Product";
    }

    @DeleteMapping
    public String deleteProduct(){
       return "Delete Product";
    }

}
