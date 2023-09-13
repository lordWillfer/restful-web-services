package com.lordwillfer.rest.webservices.restfulwebservices.controller.basic.auth;

import com.lordwillfer.rest.webservices.restfulwebservices.bean.basic.auth.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public AuthenticationBean basicAuthenticationBean() {
        return new AuthenticationBean("You are authenticated");
    }
}
