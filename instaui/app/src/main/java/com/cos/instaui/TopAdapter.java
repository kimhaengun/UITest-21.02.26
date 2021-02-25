package com.cos.instaui;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.MyViewHolder> {

    private List<Top> tops = new ArrayList<>();

    public TopAdapter(List<Top> tops) {
        this.tops = tops;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.top_item, parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setItem(tops.get(position));
    }

    @Override
    public int getItemCount() {
        return tops.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTopUserName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTopUserName = itemView.findViewById(R.id.tv_top_username);
        }
        public void setItem(Top top){
            tvTopUserName.setText(top.getTopUserName());
        }
    }
}
