package com.bighouse.api_locales.User;


import com.bighouse.api_locales.Security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private AuthenticationManager authenticationManager;

    private UserService userService;

    private TokenService tokenService;

    @Autowired
    public AuthenticationController(TokenService tokenService, AuthenticationManager authenticationManager, UserService userService) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){

        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new TokenResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
        if (userService.loadUserByUsername(data.login()) != null) return ResponseEntity.status(HttpStatus.CONFLICT).body("Login already exists.");
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());

        userService.InsertNewUser(new User(data.login(), encryptedPassword, data.role(), data.dateCreated(), data.date_updated()));

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
