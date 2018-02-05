package com.example.dbservice.repository;

import com.example.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findByUserName(String username);
}
