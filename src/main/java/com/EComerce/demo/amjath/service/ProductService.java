package com.EComerce.demo.amjath.service;

import com.EComerce.demo.amjath.Repositories.ProductRepository;
import com.EComerce.demo.amjath.models.product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor //Lombok constructor ij
public class ProductService {
    private final ProductRepository productRepository;


    public List<product> getAllProducts() {
        return productRepository.findAll();
    }
}
