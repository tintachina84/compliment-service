package com.tintachina.experimental.compliment.adapter.out.persistence;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.tintachina.experimental.compliment.domain.UserStatus;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComplimentRepositoryTest {
 
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ComplimentRepository complimentRepository;

    @Test
    @DisplayName("칭찬 생성 테스트")
    public void createComplimentTest() {
        UserEntity user = UserEntity.builder()
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

        ComplimentEntity compliment = ComplimentEntity.builder()
                                                .senderId("USER1")
                                                .senderName("USER1")
                                                .receiverId("USER2")
                                                .receiverName("USER2")
                                                .complimentMessage("MESSAGE")
                                                .complimentPoint(BigInteger.valueOf(1000L))
                                                .rewardPoint(BigInteger.valueOf(500L))
                                                .state("Y")
                                                .createdAt(LocalDateTime.now())
                                                .user(savedUser)
                                                .build();

        ComplimentEntity savedCompliment = this.complimentRepository.save(compliment);
        assertTrue(compliment.equals(savedCompliment));

        UserEntity nullableUser = this.userRepository.findById(1L).orElseThrow(IllegalArgumentException::new);
        assertTrue(nullableUser.getComplimentList().size() == 1);
    }
}
