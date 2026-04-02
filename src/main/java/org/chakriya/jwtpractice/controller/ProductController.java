package org.chakriya.jwtpractice.controller;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
@SecurityRequirement(name = "bearerAuth")
public class ProductController {
    @GetMapping
    public String getAllProduct(){
        return "Return Product";
    }
}
