package com.tintachina.experimental.compliment.adapter.out;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "compliment_like")
public class ComplimentLikeEntity {
    
    @Id
    @GeneratedValue
    private Long likeSeq;

    @Column
    private String complimentSeq;

    @Column
    private String userId;
}
