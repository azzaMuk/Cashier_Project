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

public class ItemsAdaptor extends RecyclerView.Adapter<ItemsAdaptor.ViewHolder> {

    List<String> ItemsNames;
    List<String> ItemsDesc;
    List<Integer> ItemsImg;
    LayoutInflater inflater;
    private ItemClickListener itemClickListener;



    public ItemsAdaptor(Context context, List<String> itemsNames, List<Integer> itemsImg, List<String> itemsDesc,ItemClickListener itemClickListener) {
        ItemsNames = itemsNames;
        ItemsImg = itemsImg;
        ItemsDesc= itemsDesc;
        this.inflater = LayoutInflater.from(context);
        this.itemClickListener=itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.items_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemName.setText(ItemsNames.get(position));
        holder.itemimg.setImageResource(ItemsImg.get(position));
        holder.itemsDesc.setText(ItemsDesc.get(position));

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
        TextView itemName, itemsDesc;
        ImageView itemimg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.itemName);
            itemsDesc= itemView.findViewById(R.id.itemDesc);
            itemimg= itemView.findViewById(R.id.ItemImg);

        }
    }
}
