package com.eclairiose.younow.Model;

public class ModelFriendFregment {

  private  int friend_image;
  private  String friend_name,friend_Msgtime,friend_msg;

    public ModelFriendFregment(int friend_image, String friend_name, String friend_Msgtime, String friend_msg) {
        this.friend_image = friend_image;
        this.friend_name = friend_name;
        this.friend_Msgtime = friend_Msgtime;
        this.friend_msg = friend_msg;
    }

    public int getFriend_image() {
        return friend_image;
    }

    public void setFriend_image(int friend_image) {
        this.friend_image = friend_image;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public String getFriend_Msgtime() {
        return friend_Msgtime;
    }

    public void setFriend_Msgtime(String friend_Msgtime) {
        this.friend_Msgtime = friend_Msgtime;
    }

    public String getFriend_msg() {
        return friend_msg;
    }

    public void setFriend_msg(String friend_msg) {
        this.friend_msg = friend_msg;
    }
}
