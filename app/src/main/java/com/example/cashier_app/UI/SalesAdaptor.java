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

public class SalesAdaptor extends RecyclerView.Adapter<SalesAdaptor.ViewHolder> {
    List<String> ItemsName, ItemCategory, ItemAvailableCount, ItemOrdersNum, ItemSales;
    List<Integer> ItemsImage;
    LayoutInflater inflater;

    public SalesAdaptor(Context context,List<String> itemName, List<String> itemCategory, List<String> itemAvailableCount, List<String> itemOrdersNum, List<String> itemSales, List<Integer> itemsImage) {
        ItemsName = itemName;
        ItemCategory = itemCategory;
        ItemAvailableCount = itemAvailableCount;
        ItemOrdersNum = itemOrdersNum;
        ItemSales = itemSales;
        ItemsImage = itemsImage;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.sales_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ItemName.setText(ItemsName.get(position));
        holder.ItemCategory.setText(ItemCategory.get(position));
        holder.ItemAvailableCount.setText(ItemAvailableCount.get(position));
        holder.ItemOrdersNum.setText(ItemOrdersNum.get(position));
        holder.ItemSales.setText(ItemSales.get(position));
        holder.img.setImageResource(ItemsImage.get(position));
    }

    @Override
    public int getItemCount() {
        return ItemsName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ItemName, ItemCategory, ItemAvailableCount, ItemOrdersNum, ItemSales;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemName = itemView.findViewById(R.id.itemname);
            ItemCategory = itemView.findViewById(R.id.itemcategory);
            ItemAvailableCount = itemView.findViewById(R.id.availableQuantity);
            ItemOrdersNum = itemView.findViewById(R.id.ordercount);
            ItemSales = itemView.findViewById(R.id.itemsales);
            img=itemView.findViewById(R.id.itemImg);
        }
    }
}
