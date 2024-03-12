package com.example;

import com.example.mapper.ProomMapper;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class consumerApplicationTest {

    @Autowired
    private ProomMapper proomMapper;


    @Test
    public void testGetAll() {
        System.out.println(proomMapper.getAll());
    }
}
