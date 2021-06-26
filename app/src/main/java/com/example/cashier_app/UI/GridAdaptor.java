package com.example.cashier_app.UI;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.List;

public class GridAdaptor extends RecyclerView.Adapter<GridAdaptor.ViewHolder> {

    List<String> ItemsNames;
    List<Integer> ItemsImg;
    LayoutInflater inflater;
    private ItemClickListener itemClickListener;


    public GridAdaptor(Context context, List<String> itemsNames, List<Integer> itemsImg,ItemClickListener itemClickListener) {
        ItemsNames = itemsNames;
        ItemsImg = itemsImg;
        this.itemClickListener=itemClickListener;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.category_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemName.setText(ItemsNames.get(position));
        holder.itemimg.setImageResource(ItemsImg.get(position));

        holder.itemView.setOnClickListener(view -> {
            //it will get the position of the items
           itemClickListener.onItemClick(ItemsNames.get(position));
        });


    }

    @Override
    public int getItemCount() {
        return ItemsNames.size();
    }
    public interface ItemClickListener{
        void onItemClick(String items);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        ImageView itemimg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.itembtn);
            itemimg= itemView.findViewById(R.id.ItemImg);

        }
    }
}
