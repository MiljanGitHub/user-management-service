package com.goopter.userservice.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ApiModel
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String email;
    private String username;
    private String password;
}
