package com.tintachina.experimental.compliment.adapter.out.persistence;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.tintachina.experimental.compliment.domain.UserStatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    
    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("유저 생성 테스트")
    public void createUserTest() {
        UserEntity user = UserEntity.builder()
                            .id(1L)
                            .userId("USER1")
                            .userName("USER1")
                            .userPassword("password")
                            .point(BigInteger.valueOf(100000L))
                            .sentPoint(BigInteger.valueOf(0L))
                            .receivedPoint(BigInteger.valueOf(0L))
                            .state(UserStatus.REGISTERED)
                            .createdAt(LocalDateTime.now())
                            .build();
        
        UserEntity savedUser = this.userRepository.save(user);
        assertTrue(user.equals(savedUser));
    }
}
