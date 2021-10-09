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
public class UpdateRequest {

    private String cardNo;
    private String ccn;
    private String address;
    private double longitude;
    private double latitude;
    private String phone;

}
