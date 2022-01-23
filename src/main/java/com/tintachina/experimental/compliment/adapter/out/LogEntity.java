package com.tintachina.experimental.compliment.adapter.out;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "log")
public class LogEntity {
    @Id
    @GeneratedValue
    private Long logSeq;

    @Column
    private String log;

    @Column
    private String userId;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @Column
    private LocalDateTime deletedAt;
}
