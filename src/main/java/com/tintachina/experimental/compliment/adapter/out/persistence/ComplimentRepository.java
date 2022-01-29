package com.tintachina.experimental.compliment.adapter.out.persistence;

import com.tintachina.experimental.compliment.domain.Compliment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplimentRepository extends JpaRepository<ComplimentEntity, Long> {
    
}
