package com.bae.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Citizen;

@Repository
public interface DemoRepository extends CrudRepository<Citizen,Long> {

	Collection<Citizen> findBysurname(String surname);

}
