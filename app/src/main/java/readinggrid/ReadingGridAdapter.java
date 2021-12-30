package readinggrid;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lukedict.R;
import com.example.lukedict.ReadingBean;
import com.example.lukedict.ReadingUtils;

import java.util.List;

public class ReadingGridAdapter extends BaseAdapter {
    Context context;
    List<ReadingBean> mDatas;

    public ReadingGridAdapter(Context context, List<ReadingBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {

        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //声明Viewholder
        ViewHolder holder = null;
if(convertView == null){//判断是否有复用的view,如果没有就创建
    convertView = LayoutInflater.from(context).inflate(R.layout.item_readinggrid,null);
    holder = new ViewHolder(convertView);
    convertView.setTag(holder);
}else{
    holder = (ViewHolder) convertView.getTag();
}
//获取指定位置数据
        ReadingBean readingBean = mDatas.get(position);
holder.iv.setImageResource(readingBean.getPicId());
holder.tv.setText(readingBean.getTitle());

        return convertView;
    }
    class ViewHolder{
        ImageView iv;
        TextView tv;
        public ViewHolder(View view){
            iv = view.findViewById(R.id.item_grid_iv);
            tv = view.findViewById(R.id.item_grid_tv);
        }
    }
}
