package com.goopter.userservice.response;

import com.goopter.userservice.model.Item;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
public class UserAccount {
    @ApiModelProperty(value = "1231-213-2123", notes = "User id (primary key) from database.")
    private String id;
    private String username;
    @ApiModelProperty(value = "17", notes = "Amount of bought products on OfferUp at this point.")
    private int amountBought;
    @ApiModelProperty(value = "5", notes = "Amount of sold products on OfferUp at this point.")
    private int amountSold;
    @ApiModelProperty(notes = "List of bought Items DTO.")
    private List<Item> bought;
    @ApiModelProperty(notes = "List of sold Items DTO.")
    private List<Item> sold;
    @ApiModelProperty(notes = "List of blacklisted Users.")
    private List<String> blacklist;


}
