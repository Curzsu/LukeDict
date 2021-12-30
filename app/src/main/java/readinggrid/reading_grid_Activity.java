package readinggrid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.lukedict.R;
import com.example.lukedict.ReadingBean;
import com.example.lukedict.ReadingUtils;

import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

public class reading_grid_Activity extends AppCompatActivity {
    GridView gv;
List<ReadingBean>mDatas;
private ReadingGridAdapter adapter;
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
        setContentView(R.layout.activity_reading_grid);
        ActionBar actionBar = this.getSupportActionBar();//定义actionbar上的返回箭头
        actionBar.setTitle("美文阅读");
        actionBar.setDisplayHomeAsUpEnabled(true);
        //hideActionBar();
        //setFullScreen();
        gv = findViewById(R.id.reading_grid_gv);
        //数据源
        mDatas = ReadingUtils.getAllReadingList();
        //创建适配器
adapter = new ReadingGridAdapter(this,mDatas);
//设置适配器
        gv.setAdapter(adapter);
        setListener();
    }
    public boolean onOptionsItemSelected(MenuItem item) {//定义actionbar上的返回箭头
        if(item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void setListener(){
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ReadingBean readingBean = mDatas.get(position);
                Intent intent = new Intent(reading_grid_Activity.this,ReadingDescActivity.class);
                intent.putExtra("reading",readingBean);    //注意，这里得先让ReadingBean实现Serializable接口
                //必须实现序列化才能使用，否则会报错
                startActivity(intent);
            }
        });

    }
   /* public boolean onOptionsItemSelected(MenuItem item) {//定义actionbar上的返回箭头
        if(item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}