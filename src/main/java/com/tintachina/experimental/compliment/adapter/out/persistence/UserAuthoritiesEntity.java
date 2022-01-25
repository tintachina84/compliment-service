package com.tintachina.experimental.compliment.adapter.out.persistence;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "user_authority")
public class UserAuthoritiesEntity {
    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String authority;
}
