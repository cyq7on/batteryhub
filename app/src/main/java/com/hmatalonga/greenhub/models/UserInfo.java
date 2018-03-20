package com.hmatalonga.greenhub.models;


import cn.bmob.v3.BmobObject;

/**
 * @Description: 
 * @author: cyq7on
 * @date: 18-3-20 下午4:05
 * @version: V1.0
 */

public class UserInfo extends BmobObject {

    /**
     * password : string
     * account : string
     */

    private String account;
    private String password;

    public UserInfo() {

    }

    public UserInfo(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }


    public void setAccount(String account) {
        this.account = account;


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
