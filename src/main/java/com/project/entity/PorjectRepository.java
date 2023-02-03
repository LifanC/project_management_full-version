package com.project.entity;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PorjectRepository extends JpaRepository<Project, Integer> {
	@Query(value = "select * from product_object.project where product_object.project.number=?", nativeQuery = true)
	List<Project> queryByNumber(String number);

}
