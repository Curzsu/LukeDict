package com.example.lukedict;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    EditText searchEt;
    ImageView searchIv, flushIv;
    ListView showlv;

    //ListView内部数据源
    List<WordBean> mDatas;
    //全部的数据
    List<WordBean> allWordList;
    private InfoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        showactionbar();
        initview();

        //找到ListView对应的数据源
        mDatas = new ArrayList<>();
        allWordList = SearchUtils.getAllWordLists();
        mDatas.addAll(allWordList);

        //创建适配器  BaseAdapter的子类
        adapter = new InfoListAdapter(this,mDatas);
        showlv.setAdapter(adapter);      //设置适配器

        //设置单项点击监听功能
        setListener();
    }

    private void setListener() {
        showlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WordBean wordBean = mDatas.get(position);
                Intent intent = new Intent(SearchActivity.this,WordDescActivity.class);
                intent.putExtra("word",wordBean);
                startActivity(intent);
            }
        });
    }

    private void initview() {
        searchEt = findViewById(R.id.info_et_search);
        flushIv = findViewById(R.id.info_iv_flush);
        searchIv = findViewById(R.id.info_iv_search);
        showlv = findViewById(R.id.infolist_lv);
        searchIv.setOnClickListener(this);
        flushIv.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.info_iv_flush://刷新点击
                searchEt.setText("");
                mDatas.clear();
                mDatas.addAll(allWordList);
                adapter.notifyDataSetChanged();
                break;
            case R.id.info_iv_search:
                String msg = searchEt.getText().toString().trim();    //获取输入的信息
                if(TextUtils.isEmpty(msg)){
                    Toast.makeText(this,"输入内容不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                //查看输入内容是否在list当中存在，如果存在，就加到一个新的集合里
                List<WordBean>list = new ArrayList<>();
                for(int i = 0; i < allWordList.size(); i++){
                    String title = allWordList.get(i).getTitle();
                    if(title.startsWith(msg)){    //如果包含以msg作为开头，就添加到这个集合当中
                        list.add(allWordList.get(i));
                    }
                }
                mDatas.clear();      //清空listview的适配器数据源内容
                mDatas.addAll(list);     //添加新的数据到数据源中
                adapter.notifyDataSetChanged();   //提示适配器更新
                break;
        }
    }
}
