package com.goopter.userservice.controller;

import com.goopter.userservice.request.RegisterRequest;
import com.goopter.userservice.request.SettingsRequest;
import com.goopter.userservice.request.UpdateRequest;
import com.goopter.userservice.response.UserAccount;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @PostMapping("/register")
    @ApiOperation(value = "Register a new User entity")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully registered new User.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest registerRequest, @RequestHeader String language){
        //TODO Use REST API from Keycloak to register new User
        return ResponseEntity.ok().body("Successfully registered!");
    }

    @PostMapping("/update")
    @ApiOperation(value = "Update User data in profile.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully updated.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<Boolean> updateUser(@RequestBody UpdateRequest updateRequest, @RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(true);
    }

    @DeleteMapping("/delete/{account}")
    @ApiOperation(value = "Deletes User account.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully deleted.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<Boolean> deleteAccount(@PathVariable("account") String account, @RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(true);
    }

    @GetMapping("/account")
    @ApiOperation(value = "User account.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully fetched.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<UserAccount> getUserAccount(@RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(UserAccount.builder().build());
    }

    @PutMapping("/follow/{id}")
    @ApiOperation(value = "Follow or unfollow other particular User.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Changed follow status!.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<Boolean> changeFollowStatus(@PathVariable("id") String userId, @RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(true);
    }

    @PutMapping("/report/{id}")
    @ApiOperation(value = "Report bad seller to Admin.")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully reported bed seller. Admin will let you know about further status.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<Boolean> reportBadSeller(@PathVariable("id") String sellerId, @RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(true);
    }

    @PutMapping("/settings")
    @ApiOperation(value = "Set new settings (rules) when displaying Items to registered User")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Successfully updated rules for fetching Items.", response = ResponseEntity.class),
                    @ApiResponse(code = 401, message = "You are not authorized for this service."),
                    @ApiResponse(code = 403, message = "Service you are trying to reach is forbidden."),
                    @ApiResponse(code = 500, message = "Internal server error. Please report to the Engineering team.")
            }
    )

    public ResponseEntity<Boolean> updateSettingRules(@RequestBody SettingsRequest settingsRequest, @RequestHeader String language){
        //TODO
        return ResponseEntity.ok().body(true);
    }











}
