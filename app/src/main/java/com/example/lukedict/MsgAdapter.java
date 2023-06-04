package com.example.lukedict;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.logging.Handler;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
    private List<ChatActivity.Msg> mMsgList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout leftlayout;
        LinearLayout rightlayout;
        TextView leftMsg;
        TextView rightMsg;

        public ViewHolder(View view) {
            super(view);
            leftlayout = (LinearLayout) view.findViewById(R.id.left_layout);
            rightlayout = (LinearLayout) view.findViewById(R.id.right_layout);
            leftMsg = (TextView) view.findViewById(R.id.left_msg);
            rightMsg = (TextView) view.findViewById(R.id.right_msg);
        }
    }

    public MsgAdapter(List<ChatActivity.Msg> msgList) {
        mMsgList = msgList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.msg_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChatActivity.Msg msg = mMsgList.get(position);
        if(msg.getType() == ChatActivity.Msg.TYPE_RECEIVED){
        //如果是收到消息，则显示左边的消息布局，将右边的消息布局隐藏
        holder.leftlayout.setVisibility(View.VISIBLE);
        holder.rightlayout.setVisibility(View.GONE);
        holder.leftMsg.setText(msg.getContent());
        }
        else if(msg.getType() == ChatActivity.Msg.TYPE_SENT){
        //如果是发出的消息，则显示右边的消息布局，将左边的的消息布局隐藏
        holder.rightlayout.setVisibility(View.VISIBLE);
        holder.leftlayout.setVisibility(View.GONE);
        holder.rightMsg.setText(msg.getContent());
      }

    }

    @Override
    public int getItemCount() {
        return mMsgList.size();
    }
}
