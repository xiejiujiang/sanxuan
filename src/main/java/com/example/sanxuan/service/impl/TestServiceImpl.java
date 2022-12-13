package com.example.sanxuan.service.impl;

import com.example.sanxuan.mapper.orderMapper;
import com.example.sanxuan.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.example.sanxuan.service.impl.TestServiceImpl.class);

    @Autowired
    private orderMapper orderMapper;


    @Override
    public void testService(String str) {
        LOGGER.error("--------------------------- str == " + str + " ---------------------------");
    }
}
