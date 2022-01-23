package com.tintachina.experimental.compliment.adapter.out;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "user")
public class UserEntity {
    @Id
    private String userId;

    @Column
    private String userName;

    @Column
    private String userPassword;

    @Column
    private String state;

    @Column
    private BigInteger point;

    @Column
    private BigInteger sentPoint;

    @Column
    private BigInteger receivedPoint;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;
    
    @Column
    private LocalDateTime deletedAt;
}
