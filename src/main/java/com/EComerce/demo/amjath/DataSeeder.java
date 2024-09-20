package com.EComerce.demo.amjath;

import com.EComerce.demo.amjath.Repositories.ProductRepository;
import com.EComerce.demo.amjath.models.product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
@AllArgsConstructor
public class DataSeeder  implements CommandLineRunner {


    private ProductRepository productRepository;

    @Override
    public void run(String...args) throws Exception {
        //check if the table is empty
        if(productRepository.count() ==0)
        {
            //Seed demo data
            List<product> products = Arrays.asList
                    (new product("OPPO F21s Pro 5G", 245.67,
                    "Affordable 5G smartphone with 8GB RAM and 128GB storage.",
                    4.3, "Mobile Phones", "OPPO Store", 120, 456),

            new product("Sony WH-1000XM4", 349.99,
                    "Wireless noise-canceling headphones with 30-hour battery life.",
                    4.7, "Electronics", "Sony Official", 75, 3890),
                     new product("Dyson V11 Cord-Free Vacuum", 599.99,
                    "High-power cordless vacuum with intelligent cleaning modes.",
                    4.8, "Home Appliances", "Dyson Store", 50, 925)
                    );

            productRepository.saveAll(products); // Save all products to the repository
            System.out.println("Demo dataseeded");
        }
    }
}
