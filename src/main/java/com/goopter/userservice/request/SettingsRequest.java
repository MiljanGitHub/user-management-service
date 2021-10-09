package com.goopter.userservice.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ApiModel
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SettingsRequest {

    private boolean currentLocation;
    private double longitude;
    private double latitude;
    private List<Integer> categories;
    private List<String> whitelistUsers;
    private List<String> blacklistUsers;
    private boolean latest;
}
