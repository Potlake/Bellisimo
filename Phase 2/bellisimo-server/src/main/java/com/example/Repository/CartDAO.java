package com.example.Repository;

import com.example.Model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CartDAO extends CrudRepository<Cart,Integer> {
}
