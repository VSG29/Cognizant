package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.AuthenticationResponse;
import com.cognizant.spring_learn.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("START");

        // Remove "Basic "
        String encodedCredentials = authHeader.substring(6);

        // Decode username:password
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);

        LOGGER.debug("Decoded Credentials: {}", decodedCredentials);

        String username = decodedCredentials.split(":")[0];

        String token = JwtUtil.generateToken(username);

        LOGGER.info("END");

        return new AuthenticationResponse(token);
    }
}