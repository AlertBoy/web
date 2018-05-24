package com.cly.model;

import java.util.Date;

public class YellowMan {
    private Integer id;

    private String username;

    private String userpass;

    private Date createdate;

    private Integer iskeyuser;

    private String keycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getIskeyuser() {
        return iskeyuser;
    }

    public void setIskeyuser(Integer iskeyuser) {
        this.iskeyuser = iskeyuser;
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode == null ? null : keycode.trim();
    }
}