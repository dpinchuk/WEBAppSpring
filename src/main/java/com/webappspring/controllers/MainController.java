package com.webappspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class {@link MainController}
 *
 * @author Pavlo Kozub
 * @since April 13, 2016
 */
@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMainPage(){
        return "index";
    }
}
