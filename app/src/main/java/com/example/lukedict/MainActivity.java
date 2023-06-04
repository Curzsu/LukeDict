package com.example.lukedict;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int time = 5;         //设置启动动画的时长
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideActionBar();
        setFullScreen();
        tv = findViewById(R.id.main_tv);
        handler.sendEmptyMessageDelayed(1,1000);
    }

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

    Handler handler = new Handler(){
    @Override
    public void handleMessage( Message msg) {
        if(msg.what == 1){
            time--;
            if(time == 0){
                //跳转界面
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,loginPage.class);
                startActivity(intent);
                finish();
            }else{
                tv.setText(time+"");
                handler.sendEmptyMessageDelayed(1,1000);
            }
        }
    }
};
}