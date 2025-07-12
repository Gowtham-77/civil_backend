package com.inspectorsunion.app.controller;

import com.inspectorsunion.app.domain.dto.request.*;
import com.inspectorsunion.app.domain.dto.response.AuthResponse;
import com.inspectorsunion.app.domain.dto.response.UserInfoResponse;
import com.inspectorsunion.app.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {

    private final AuthService authService;
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    //add
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        logger.debug("Register API hit");
        return ResponseEntity.ok(authService.register(request));
    }

    //login
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        logger.debug("Login API hit");
        return ResponseEntity.ok(authService.login(request));
    }

    //logout
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody LogoutRequest request) {
        logger.debug("Logout API hit");
        return ResponseEntity.ok(authService.logout(request));
    }

    //getByEmail
    @GetMapping("/user-info")
    public ResponseEntity<UserInfoResponse> getUserInfo(@RequestParam String email) {
        return ResponseEntity.ok(authService.getUserInfo(email));
    }

    //GetOtherUserButNotAdmins
    @GetMapping("/non-admin-users")
    public ResponseEntity<List<UserInfoResponse>> getNonAdminUsers() {
        return ResponseEntity.ok(authService.getAllNonAdminUsers());
    }

    //statusChange
    @PostMapping("/toggle-status")
    public ResponseEntity<String> toggleUserStatus(@RequestBody UpdateUserStatusRequest request) {
        return ResponseEntity.ok(authService.toggleUserStatus(request));
    }

    //updateUserData
    @PostMapping("/update-by-email")
    public ResponseEntity<String> updateUserByEmail(@RequestBody UpdateUserRequest request) {
        return ResponseEntity.ok(authService.updateUserDetailsByEmail(request));
    }
}
