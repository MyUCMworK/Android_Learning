package com.example.fordermn.forder.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fordermn.forder.Interface.ItemClickListener;
import com.example.fordermn.forder.R;

/**
 * Created by sning on 3/22/18.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView foodName;
    public ImageView foodImage;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);
        foodName = (TextView) itemView.findViewById(R.id.foodName);
        foodImage = (ImageView) itemView.findViewById(R.id.foodImage);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);

    }
}
