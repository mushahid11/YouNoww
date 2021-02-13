package com.eclairiose.younow.Model;

public class ModelMessagesFragment {

    private  int image;
    private  String name,Msgtime,msg;

    public ModelMessagesFragment(int image, String name, String msgtime, String msg) {
        this.image = image;
        this.name = name;
        Msgtime = msgtime;
        this.msg = msg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsgtime() {
        return Msgtime;
    }

    public void setMsgtime(String msgtime) {
        Msgtime = msgtime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
