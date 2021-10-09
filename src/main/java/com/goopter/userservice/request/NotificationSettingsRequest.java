package com.goopter.userservice.request;

import com.goopter.userservice.model.Notification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
public class NotificationSettingsRequest {

    @ApiModelProperty
    private Notification notification;
    private boolean enable;
}
