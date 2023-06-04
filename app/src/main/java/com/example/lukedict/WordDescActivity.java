package com.example.lukedict;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class WordDescActivity extends AppCompatActivity {
    TextView titleTv1,descTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_desc);
        showactionbar();
        initView();
        //接受上一界面传来的数据
        Intent intent = getIntent();
        WordBean wordBean = (WordBean) intent.getSerializableExtra("word");
        //设置显示控件
        titleTv1.setText(wordBean.getTitle());
        descTv.setText(wordBean.getDesc());
    }

    private void initView() {
        titleTv1 = findViewById(R.id.worddesc_tv_title);
        descTv = findViewById(R.id.worddesc_tv_desc);
    }

    private void showactionbar() {
        ActionBar actionBar = this.getSupportActionBar();//定义actionbar上的返回箭头
        actionBar.setTitle("单词搜索");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {//定义actionbar上的返回箭头
        if(item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}