package readinggrid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lukedict.R;
import com.example.lukedict.ReadingBean;

public class ReadingDescActivity extends AppCompatActivity {
TextView titleTv2,descTv;
ImageView bigPicIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_desc);
        showactionbar();
        initView();
//结合搜上一级界面传来的数据
        Intent intent = getIntent();
        ReadingBean readingBean = (ReadingBean) intent.getSerializableExtra("reading");
        //设置显示控件
titleTv2.setText(readingBean.getTitle());
descTv.setText(readingBean.getDesc());
bigPicIv.setImageResource(readingBean.getPicId());
    }
    private void initView(){
        titleTv2 = findViewById(R.id.readingdesc_tv_title2);
        descTv = findViewById(R.id.readingdesc_tv_desc);
        bigPicIv = findViewById(R.id.readingdesc_iv_bigpic);
    }
    private void showactionbar() {
        ActionBar actionBar = this.getSupportActionBar();//定义actionbar上的返回箭头
        actionBar.setTitle("美文阅读");
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