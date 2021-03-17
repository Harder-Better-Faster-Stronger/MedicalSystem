package com.medical.entity;

import java.util.Date;

public class User {
    private String uid;

    private String name;

    private Integer age;

    private Byte gender;

    private String phone;

    private String password;

    private Date birth;

    private Float height;

    private Float weight;

    private String avatar;

    private Integer point;

    private Date lastLogin;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public User(){

    }

    public User(String uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public User(String uid, String name, Integer age, Byte gender, String phone, String password, Date birth, Float height, Float weight, String avatar, Integer point, Date lastLogin) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.password = password;
        this.birth = birth;
        this.height = height;
        this.weight = weight;
        this.avatar = avatar;
        this.point = point;
        this.lastLogin = lastLogin;
    }
}