package com.example.focus3.Dao;

import cn.bmob.v3.BmobObject;

public class Friends extends BmobObject {
    String user_id;
    String friend_id;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(String friend_id) {
        this.friend_id = friend_id;
    }
}
