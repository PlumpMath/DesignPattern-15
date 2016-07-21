package com.adapter.example;

import com.adapter.example.IUserInfo;

/**
 * Created by toryang on 7/18/16.
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("user name");

        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("home address");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("mobile number");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("office tel number");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("job position");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("home tel number");
        return null;
    }
}
