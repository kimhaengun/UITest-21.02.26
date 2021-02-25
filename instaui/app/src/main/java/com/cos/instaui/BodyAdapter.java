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

public class BodyAdapter extends RecyclerView.Adapter<BodyAdapter.MyViewHolder> {

    private List<Body> bodys = new ArrayList<>();

    public BodyAdapter(List<Body> bodys) {
        this.bodys = bodys;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.main_container, parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setItem(bodys.get(position));
    }

    @Override
    public int getItemCount() {
        return bodys.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvContainerUserName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContainerUserName = itemView.findViewById(R.id.tv_container_username);
        }
        public void setItem(Body top){
            tvContainerUserName.setText(top.getBodyUserName());
        }
    }
}