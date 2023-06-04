package com.example.lukedict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    SharedPreferences sp;
    private CheckBox cb_remember;
    private CheckBox cb_autologin;
    private EditText et_pwd;
    private EditText et_username;
    private TextView registeraccount;
    private  ImageView arrowicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_username = findViewById(R.id.et_username);
        ImageView imageView = findViewById(R.id.arrowicon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = et_username.getText().toString();
                //Intent intent = new Intent(LoginActivity.this,);
                //intent.putExtra("username",data);
               // startActivity(intent);
            }
        });
        //回显数据
        //获取首选项
       /* sp = getSharedPreferences("config", Context.MODE_PRIVATE);
        initView();//第二次或以后打开的时候，从SP获取之前保存的数据并进行画面同步
        boolean rememberpwd = sp.getBoolean("rememberpwd",false);
        boolean autologin = sp.getBoolean("autologin",false);
        if(rememberpwd){
            //获取SP里的name和pwd,并保存到EditText
            String name = sp.getString("name","");//如果获取为空，就会返回默认值
            String pwd = sp.getString("pwd","");//如果获取为空，就会返回默认值
            et_username.setText(name);
            et_pwd.setText(pwd);
            cb_remember.setChecked(true);       //打上钩，表示打钩的状态不变
        }
        if(autologin){
            cb_autologin.setChecked(true);//打上钩，表示打钩的状态不变
            Toast.makeText(this,"自动登录成功！",Toast.LENGTH_SHORT).show();
        }
    }
    private void initView()   //初始化
    {
        //找到控件
        registeraccount.findViewById(R.id.registeraccount);
        et_username = findViewById(R.id.et_username);
        et_pwd = findViewById(R.id.et_pwd);
        cb_remember = findViewById(R.id.cb_rememberpwd);
        cb_autologin = findViewById(R.id.cb_autologin);
        arrowicon = findViewById(R.id.arrowicon);
        MyOnClickListener l = new MyOnClickListener();
        registeraccount.setOnClickListener(l);
        arrowicon.setOnClickListener(l);
    }
    private class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.registeraccount:
                    break;
//进行register的操作
                case R.id.arrowicon:
                    String name = et_username.getText().toString().trim();
                    String pwd = et_pwd.getText().toString().trim();
                    if(TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)){
                        Toast.makeText(LoginActivity.this,"用户名或密码为空",Toast.LENGTH_SHORT).show();
                    }else{
                        //是否已经勾选记住密码
                        if(cb_remember.isChecked()){
                            //将勾选记住的用户名和密码用sharedpreference保存
                            //这里是保存记住密码的状态
                            SharedPreferences.Editor editor = sp.edit();
                            editor.putString("name",name);
                            editor.putString("pwd",pwd);
                            editor.putBoolean("rememberpwd",true);//true代表打钩，false则没有打钩
                            editor.apply();
                        }
                        if(cb_autologin.isChecked()){
                            //这里是保存自动登录的状态
                            SharedPreferences.Editor editor = sp.edit();
                            editor.putBoolean("autologin",true);//true代表打钩，false则没有打钩
                            editor.apply();
                        }

                    }
                    break;
            }
        }*/

    }
}