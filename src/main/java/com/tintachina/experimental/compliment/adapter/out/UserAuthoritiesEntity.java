package com.tintachina.experimental.compliment.adapter.out;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "user_authority")
public class UserAuthoritiesEntity {
    @Column
    private String userId;

    @Column
    private String authority;
}
