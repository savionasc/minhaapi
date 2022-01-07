package com.api.savio.minhaapi.repository;

import com.api.savio.minhaapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
