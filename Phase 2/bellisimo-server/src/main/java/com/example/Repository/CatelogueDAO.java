package com.example.Repository;

import com.example.Model.Catelogue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CatelogueDAO extends CrudRepository<Catelogue,Integer>{
}
