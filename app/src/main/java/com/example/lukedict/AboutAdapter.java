package com.example.lukedict;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class AboutAdapter extends PagerAdapter {    //实现viewpager专用的适配器
    List<View> viewList;

    public AboutAdapter(List<View> viewList) {
this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;       //这边返回的是滑动切换图片的次数，这边用integer.maxvalue为了实现无限滑动的效果
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view = viewList.get(position % viewList.size());   //保证集合长度不再发生变化
        container.removeView(view);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = viewList.get(position % viewList.size());
        container.addView(view);
        return view;
    }
}
