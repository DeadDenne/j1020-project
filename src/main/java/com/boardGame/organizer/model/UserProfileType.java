package com.boardGame.organizer.model;

import java.io.Serializable;

public enum UserProfileType implements Serializable {
    USER("USER"),
    ADMIN("ADMIN"),
    CONTENT_MANAGER("ContentManager"),
    SHOP_MANAGER("ShopManager"),
    CUSTOMER("CUSTOMER");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}
