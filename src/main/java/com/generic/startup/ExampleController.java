package com.generic.startup;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joco on 4/20/16.
 */
@RestController
@RequestMapping("/example")
public class ExampleController {
    class ExampleResp {
        private String message;

        public ExampleResp(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @RequestMapping("")
    public ExampleResp index() {
        return new ExampleResp("hello");
    }
    @RequestMapping("/secured")
    @Secured("ROLE_ADMIN")
    public ExampleResp securedResource() {
        return new ExampleResp("secured");
    }
}
