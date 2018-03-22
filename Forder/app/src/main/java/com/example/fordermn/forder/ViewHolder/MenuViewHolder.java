package com.example.fordermn.forder.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fordermn.forder.Interface.ItemClickListener;
import com.example.fordermn.forder.R;

/**
 * Created by sning on 3/21/18.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;


    public MenuViewHolder (View itemView) {
        super (itemView);
        textMenuName = (TextView) itemView.findViewById(R.id.menu_name);
        imageView = (ImageView) itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick (View view){
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }
}
