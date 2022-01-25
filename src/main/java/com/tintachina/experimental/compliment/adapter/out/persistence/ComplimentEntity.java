package com.tintachina.experimental.compliment.adapter.out.persistence;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "compliment")
public class ComplimentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long complimentSeq;

    @Column(nullable = false)
    private String senderId;

    @Column(nullable = false)
    private String senderName;

    @Column(nullable = false)
    private String receiverId;

    @Column(nullable = false)
    private String receiverName;

    @Column(nullable = false)
    private BigInteger complimentPoint;

    @Column(nullable = false)
    private BigInteger rewardPoint;

    @Column(nullable = false)
    private String complimentMessage;

    @Column(nullable = false)
    private String state;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
