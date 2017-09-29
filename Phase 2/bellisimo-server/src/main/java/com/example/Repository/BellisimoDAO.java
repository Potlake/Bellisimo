package com.example.Repository;

import com.example.Model.Product;
import com.example.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BellisimoDAO extends CrudRepository<Product,Integer>{

}

