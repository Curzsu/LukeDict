package com.example.lukedict;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener{
    RatingBar rating;
    Button sendbtn;
    Button resetbtn;
    EditText qq;
    EditText age;
    RadioButton male;
    RadioButton female;
    CheckBox feedback1;
    CheckBox feedback2;
    CheckBox feedback3;
    EditText tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        showactionbar();
        initRating();
        initWidget();
    }

    private void initWidget() {
        sendbtn = findViewById(R.id.btn_send);
        resetbtn = findViewById(R.id.btn_reset);
        qq = findViewById(R.id.et_qqnumber);
        age = findViewById(R.id.et_age);
        male = findViewById(R.id.rb_sex_male);
        female = findViewById(R.id.rb_sex_female);
        feedback1 = findViewById(R.id.box1);
        feedback2 = findViewById(R.id.box2);
        feedback3 = findViewById(R.id.box3);
        tel = findViewById(R.id.et_phone);
        sendbtn.setOnClickListener(this);
        resetbtn.setOnClickListener(this);
        qq.setOnClickListener(this);
        age.setOnClickListener(this);
        male.setOnClickListener(this);
        female.setOnClickListener(this);
        feedback1.setOnClickListener(this);
        feedback2.setOnClickListener(this);
        feedback3.setOnClickListener(this);
        tel.setOnClickListener(this);
    }

    private void initRating() {
        rating = findViewById(R.id.rating_bar);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //当发生改变时输出评分
                Toast.makeText(FeedbackActivity.this,"获得评分：" + String.valueOf(rating),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showactionbar() {
        ActionBar actionBar = this.getSupportActionBar();//定义actionbar上的返回箭头
        actionBar.setTitle("问卷调查");
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_reset:
                resetEverything();
            break;
            case R.id.btn_send:
                showAlert();
                //showAlert2();
                 break;
        }
    }

  //  private void showNotification() {}

    private void resetEverything() {
        qq.setText("");
        age.setText("");
        male.setChecked(false);
        female.setChecked(false);
        feedback1.setChecked(false);
        feedback2.setChecked(false);
        feedback3.setChecked(false);
        tel.setText("");
    }

    private void showAlert() {
        AlertDialog alertDlg = new AlertDialog.Builder(FeedbackActivity.this).create();
        alertDlg.setTitle("友情提示");
        alertDlg.setMessage(Html.fromHtml("<font color=\"red\">确认提交问卷？</font>"));
        //alertDlg.setMessage("确认提交问卷？");
        alertDlg.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FeedbackActivity.this,"你已取消提交",Toast.LENGTH_SHORT).show();
            }
        });
        alertDlg.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FeedbackActivity.this,"你已成功提交问卷",Toast.LENGTH_SHORT).show();
            }
        });
        alertDlg.show();
        alertDlg.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.BLUE);
        alertDlg.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(Color.BLACK);
    }

    private void showAlert2() {
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(this);
        alertdialogbuilder.setMessage("您确认要退出程序");
        alertdialogbuilder.setPositiveButton("确定", null);
        alertdialogbuilder.setNeutralButton("取消", null);
        final AlertDialog alertdialog1 = alertdialogbuilder.create();
        alertdialog1.show();
    }
}