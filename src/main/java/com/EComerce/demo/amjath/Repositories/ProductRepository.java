package com.EComerce.demo.amjath.Repositories;

import com.EComerce.demo.amjath.models.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product,Long> {

}
