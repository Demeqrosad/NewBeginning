package com.example.hibernate.manytomany.dao;

import com.example.hibernate.manytomany.Company ;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

}

