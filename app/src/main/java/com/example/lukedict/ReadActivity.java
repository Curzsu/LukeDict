package com.example.lukedict;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

    }
    public class Tx {
        private String name;
        private int imageId;//两个成员变量

        public Tx(String name, int imageId) {//构造方法，用以赋值
            this.name = name;
            this.imageId = imageId;//赋予变量值
        }

        public String getName() {//获得Name的值
            return name;
        }

        public int getImageId() {//用以获得图片ID的值
            return imageId;
        }
    }
}