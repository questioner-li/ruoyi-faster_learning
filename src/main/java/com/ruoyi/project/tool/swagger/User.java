package com.ruoyi.project.tool.swagger;

public class User {
    private int uid;
    private String uname;
    private String fav;

    public User(int uid, String uname, String fav) {
        this.uid = uid;
        this.uname = uname;
        this.fav = fav;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", fav='" + fav + '\'' +
                '}';
    }
}
