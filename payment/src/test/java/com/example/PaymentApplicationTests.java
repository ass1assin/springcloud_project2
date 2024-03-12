package com.example;


import com.example.controller.StuInfoController;
import com.example.mapper.StuInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PaymentApplicationTests {

    @Autowired
    private StuInfoController stuInfoController;
    @Autowired
    public StuInfoMapper stuInfoMapper;


    @Test
    public void testGetAll() {
        System.out.println(stuInfoMapper.getAll());
    }
}
