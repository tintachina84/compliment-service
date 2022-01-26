package com.tintachina.experimental.compliment.adapter.out.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Entity
@Table(name = "authority")
public class AuthoritiesEntity {

    @Id
    private Long id;

    @Column(nullable = false)
    private String authority;
}
