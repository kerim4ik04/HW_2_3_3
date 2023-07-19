package com.example.hw_2_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IphoneAdapter extends RecyclerView.Adapter <IphoneViewHolder> {

    private ArrayList<String> IphoneList;

    public IphoneAdapter(ArrayList<String> iphoneList) {
        this.IphoneList = iphoneList;
    }

    @NonNull
    @Override
    public IphoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IphoneViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_iphone,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull IphoneViewHolder holder, int position) {

        holder.bind(IphoneList.get(position));

    }

    @Override
    public int getItemCount() {
        return IphoneList.size();
    }
}