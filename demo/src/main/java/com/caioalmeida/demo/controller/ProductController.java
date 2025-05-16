package com.caioalmeida.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.caioalmeida.demo.entities.Department;
import com.caioalmeida.demo.entities.Product;
import com.caioalmeida.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getObjects(){

        List<Product> list = productRepository.findAll();

        return list;
    }
}
