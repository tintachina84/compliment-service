package com.tintachina.experimental.compliment.adapter.out.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Entity
@Table(name = "compliment_like")
public class ComplimentLikeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likeSeq;

    @Column(nullable = false)
    private String complimentSeq;

    @Column(nullable = false)
    private String userId;
}
