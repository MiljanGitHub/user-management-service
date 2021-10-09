package com.goopter.userservice.model;

import io.swagger.annotations.ApiModel;

@ApiModel
public enum Notification {

    SMS,
    EMAIL,
    WEB,
    MOBILE
}
