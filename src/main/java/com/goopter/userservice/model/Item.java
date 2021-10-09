package com.goopter.userservice.model;

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
public class Item {
    @ApiModelProperty(value = "www.amazon.com/s3/bucket/bucket-image-name-123", notes = "Url to main Item image on S3.")
    private String url;
    @ApiModelProperty(value = "12", notes = "Id from database.")
    private String id;
    @ApiModelProperty(value = "$124", notes = "Price for which Item was sold/bought.")
    private String price;
}
