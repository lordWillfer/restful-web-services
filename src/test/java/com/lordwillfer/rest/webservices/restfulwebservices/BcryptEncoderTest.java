package com.lordwillfer.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String encodedString = "";
        for (int i = 1; i <= 10; i++) {
            encodedString = encoder.encode("pass12345");
            System.out.println(encodedString);
        }
    }
}
