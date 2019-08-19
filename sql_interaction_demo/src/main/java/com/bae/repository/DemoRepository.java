package com.bae.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Citizen;

@Repository
public interface DemoRepository extends JpaRepository<Citizen,Long> {

	Collection<Citizen> findBysurname(String surname);

}
