package ru.netology.data_storage_homework_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.data_storage_homework_3.repository.ProductRepository;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public String fetchProduct(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}