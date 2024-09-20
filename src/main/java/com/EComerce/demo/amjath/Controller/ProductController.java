package com.EComerce.demo.amjath.Controller;


import com.EComerce.demo.amjath.models.product;
import com.EComerce.demo.amjath.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping
    public List<product> getAllProduct()
    {
        return productService.getAllProducts();
    }


}
