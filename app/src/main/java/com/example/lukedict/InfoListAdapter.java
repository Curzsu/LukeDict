package com.example.lukedict;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class InfoListAdapter extends BaseAdapter {

    Context context;
    List<WordBean> mDatas;

    public InfoListAdapter(Context context, List<WordBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    //决定了ListView列表展示的行数
    @Override
    public int getCount() {
        return mDatas.size();//集合的长度就是ListView展示的行数
    }

    @Override
    public Object getItem(int position) {     //返回指定位置所对应的数据是什么
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {    //返回这个位置所对应的id是什么
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //返回指定位置对应的view
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_infolist_lv, null);
            //以上是将布局转换成view对象的方法
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        } else {      //复用
            holder = (ViewHolder) convertView.getTag();
        }
        //加载控件显示的内容
        //获取集合指定位置的数据
        WordBean wordBean = mDatas.get(position);
        holder.titleTv.setText(wordBean.getTitle());
        holder.transTv.setText(wordBean.getTran());
        return convertView;
    }

    class ViewHolder {           //内部类
        TextView titleTv;
        TextView transTv;

        public ViewHolder(View view) {
            titleTv = view.findViewById(R.id.item_info_tv_title);
            transTv = view.findViewById(R.id.item_info_tv_translation);
        }
    }
}
