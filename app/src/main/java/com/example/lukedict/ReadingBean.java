package com.example.lukedict;

import java.io.Serializable;

public class ReadingBean implements Serializable {
private String title;
private String desc;
private int picId;


    public ReadingBean() {
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public ReadingBean(String title, String desc, int picId) {
        this.title = title;
        this.desc = desc;
        this.picId = picId;
    }
}
