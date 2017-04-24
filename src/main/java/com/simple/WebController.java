package com.simple;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alan Jeon on 24/04/2017.
 */
@RestController
@RequestMapping("/hello")
public class WebController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getItem() {
        return "Hello world!";
    }
}
