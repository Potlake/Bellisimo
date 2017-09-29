package com.example.Repository;

import com.example.Model.Special;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SpecialDAO extends CrudRepository<Special,Integer> {
}
