package com.example.nichol.multimodule;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nichol on 2017/5/20.
 */

public class User {
    private String name;
    private int age;
    private String mobile;

    public User(String name, int age, String mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
