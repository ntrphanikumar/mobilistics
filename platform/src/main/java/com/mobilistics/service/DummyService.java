package com.mobilistics.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DummyService.class);

    public void dummyCall() {
        LOGGER.info("dummy called");
    }
}
