package com.test.account.entity;

import java.time.ZonedDateTime;
import java.util.Properties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String belongs;
    private ZonedDateTime recentLogin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBelongs() {
        return belongs;
    }

    public void setBelongs(String belongs) {
        this.belongs = belongs;
    }

    public ZonedDateTime getRecentLogin() {
        return recentLogin;
    }

    public void setRecentLogin(ZonedDateTime recentLogin) {
        this.recentLogin = recentLogin;
    }
}