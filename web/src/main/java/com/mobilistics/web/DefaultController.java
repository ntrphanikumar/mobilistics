package com.mobilistics.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mobilistics.service.DummyService;

@Controller
public class DefaultController {

    private final Logger logger = LoggerFactory.getLogger(DefaultController.class);
    
    private final DummyService dummyService;
    
    @Inject
    public DefaultController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(Model model) {
        logger.debug("To default index page");
        dummyService.dummyCall();
        return "index";
    }

}
