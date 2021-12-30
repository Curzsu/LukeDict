package com.example.lukedict;

import java.io.Serializable;

public class WordBean implements Serializable {
    private String title;
    private String tran;
    private String desc;   //信息

    public String getTitle() {
        return title;
    }

    public String getTran() {
        return tran;
    }

    public void setTran(String tran) {
        this.tran = tran;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public WordBean(String title, String tran, String desc) {
        this.title = title;
        this.tran = tran;
        this.desc = desc;
    }

    public WordBean() {
    }
}
