package com.example.hw_2_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class IphoneViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFood;

    public IphoneViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFood = itemView.findViewById(R.id.tv_iphone);
    }

    public void bind(String iphone) {
        tvFood.setText(iphone);
    }
}
