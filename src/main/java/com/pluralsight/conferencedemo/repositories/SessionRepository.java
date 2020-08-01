package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//long here refers to the primary key's data type
public interface SessionRepository extends JpaRepository<Session,Long> {
}
