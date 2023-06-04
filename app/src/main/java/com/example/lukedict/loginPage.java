package com.example.lukedict;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity implements View.OnClickListener{
    ObjectAnimator objectAnimator;
    private EditText et_name;
    private EditText et_pwd;
    private ImageView title;
    private ImageView titledragon;
    private CheckBox rememberpassward;
    private ImageView clickimage;
    private ImageView bar1;
    private ImageView bar2;
    private ImageView arrow;
    Animation animation;
    SharedPreferences sp;
    boolean flag = true;
    private static final int NOTIFICATION_ID = 1001;

    /**
     * hide action bar
     */
    private void hideActionBar() {
        // Hide UI
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    /**
     * set the activity display in full screen
     */
    private void setFullScreen() {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        hideActionBar();
        setFullScreen();
        startView();
        sp = getSharedPreferences("config", Context.MODE_PRIVATE);
        //initView();//第二次或以后打开的时候，从SP获取之前保存的数据并进行画面同步
        boolean rememberpwd = sp.getBoolean("rememberpwd", false);
        if (rememberpwd) {
            //获取SP里的name和pwd,并保存到EditText
            String name = sp.getString("name", "");//如果获取为空，就会返回默认值
            String pwd = sp.getString("pwd", "");//如果获取为空，就会返回默认值
            et_name.setText(name);
            et_pwd.setText(pwd);
            rememberpassward.setChecked(true);       //打上钩，表示打钩的状态不变
        }
    }
    private void sendNotification(){
        //1、NotificationManager
        NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        /** 2、Builder->Notification
         *  必要属性有三项
         *  小图标，通过 setSmallIcon() 方法设置
         *  标题，通过 setContentTitle() 方法设置
         *  内容，通过 setContentText() 方法设置*/
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentInfo("Content info")
                .setContentText("好好学习，天天向上！")//设置通知内容
                .setContentTitle("欢迎使用Luke English!")//设置通知标题
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                .setSmallIcon(R.mipmap.arrowicon)//不能缺少的一个属性
                .setSubText("Subtext")
                .setTicker("滚动消息......")
                .setPriority(Notification.PRIORITY_MAX)   //书上讲这段代码可以弹出横幅
                .setWhen(System.currentTimeMillis());//设置通知时间，默认为系统发出通知的时间，通常不用设置
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("001","my_channel",NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(true); //是否在桌面icon右上角展示小红点
            channel.setLightColor(Color.RED); //小红点颜色
            channel.setShowBadge(true); //是否在久按桌面图标时显示此渠道的通知
            manager.createNotificationChannel(channel);
            builder.setChannelId("001");
        }
        Notification n = builder.build();
        //3、manager.notify()
        manager.notify(NOTIFICATION_ID,n);
    }

    private void startView() {
        et_name = (EditText) findViewById(R.id.et_username);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        clickimage = (ImageView)findViewById(R.id.black_bg);
        titledragon = (ImageView)findViewById(R.id.title_dragon);
        title = (ImageView) findViewById(R.id.title);
        bar1 = (ImageView)findViewById(R.id.bar1);
        bar2 = (ImageView)findViewById(R.id.bar2);
        arrow = (ImageView)findViewById(R.id.enter_imagebt);
        rememberpassward = (CheckBox)findViewById(R.id.cb_rememberpwd);
        arrow.setOnClickListener(this);
        clickimage.setOnClickListener(this);
        animation = AnimationUtils.loadAnimation(this,R.anim.movement);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.black_bg:
                    if (flag == true) {
                        flag = false;
                    objectAnimator = ObjectAnimator.ofFloat(title, "alpha", 0f, 1f);
                    objectAnimator.setDuration(2000);
                    objectAnimator.start();
                    objectAnimator = ObjectAnimator.ofFloat(bar1, "alpha", 0f, 1f);
                    objectAnimator.setDuration(2000);
                    objectAnimator.start();
                    objectAnimator = ObjectAnimator.ofFloat(bar2, "alpha", 0f, 1f);
                    objectAnimator.setDuration(2000);
                    objectAnimator.start();
                    objectAnimator = ObjectAnimator.ofFloat(arrow, "alpha", 0f, 1f);
                    objectAnimator.setDuration(2000);
                    objectAnimator.start();
                    objectAnimator = ObjectAnimator.ofFloat(rememberpassward, "alpha", 0f, 1f);
                    objectAnimator.setDuration(2000);
                    objectAnimator.start();
                    titledragon.startAnimation(animation);}
                    break;
                case R.id.enter_imagebt:
                    String name = et_name.getText().toString().trim();
                    String pwd = et_pwd.getText().toString().trim();
                    if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pwd)) {
                        Toast.makeText(loginPage.this, "用户名或密码为空", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent=new Intent(loginPage.this,Main_menu.class);
                        intent.putExtra("message",name);
                        startActivity(intent);
                        //是否已经勾选记住密码
                        if (rememberpassward.isChecked()) {
                            //将勾选记住的用户名和密码用sharedpreference保存
                            //这里是保存记住密码的状态
                            SharedPreferences.Editor editor = sp.edit();
                            editor.putString("name", name);
                            editor.putString("pwd", pwd);
                            editor.putBoolean("rememberpassward", true);//true代表打钩，false则没有打钩
                            editor.apply();
                        }
                        sendNotification();
                    }
            }
    }
}
