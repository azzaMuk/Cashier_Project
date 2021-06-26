package com.example.cashier_app.UI;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.List;

public class
BillAdaptor extends RecyclerView.Adapter<BillAdaptor.ViewHolder> {

    List<String> ItemsNames, ItemsOptions, ItemsQuantity,ItemPrice;
    Context context;
    LayoutInflater inflater;

    public BillAdaptor( Context context,List<String> itemsNames, List<String> itemsOptions, List<String> itemsQuantity,List<String> itemPrice) {
        ItemsNames = itemsNames;
        ItemsOptions = itemsOptions;
        ItemsQuantity = itemsQuantity;
        ItemPrice=itemPrice;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.bill_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemName.setText(ItemsNames.get(position));
        holder.itemOpt.setText(ItemsOptions.get(position));
        holder.itemQun.setText(ItemsQuantity.get(position));
        holder.itemprice.setText(ItemPrice.get(position));

    }

    @Override
    public int getItemCount() {
        return ItemsNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName , itemOpt, itemQun, itemprice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName= itemView.findViewById(R.id.itemName);
            itemOpt= itemView.findViewById(R.id.itemOption);
            itemQun= itemView.findViewById(R.id.itemQuantity);
            itemprice= itemView.findViewById(R.id.price);

        }
    }
}
