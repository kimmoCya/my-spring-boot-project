package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.answer.Answer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private AnswerRepository AnswerRepository;

    @Test
    void testJpa() {
        AnswerRepository.deleteAll();
    }
}
