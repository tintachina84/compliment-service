package com.tintachina.experimental.compliment.adapter.out.persistence;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tintachina.experimental.compliment.domain.UserStatus;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "user")
public class UserEntity {
    @Id
    private String userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userPassword;

    @Column
    @Enumerated(EnumType.STRING)
    private UserStatus state;

    @Column(nullable = false)
    private BigInteger point;

    @Column(nullable = false)
    private BigInteger sentPoint;

    @Column(nullable = false)
    private BigInteger receivedPoint;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
}
