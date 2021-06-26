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

public class OrderAdaptor extends RecyclerView.Adapter<OrderAdaptor.ViewHolder> {

    List<String> OrdersId, OrdersDate, OrdersPrice, OrdersType, OrdersStatus;
    LayoutInflater inflater;

    public OrderAdaptor(Context context, List<String> ordersId, List<String> ordersDate, List<String> ordersPrice, List<String> OrdersType, List<String> ordersStatus) {
        OrdersId = ordersId;
        OrdersDate = ordersDate;
        OrdersPrice = ordersPrice;
        this.OrdersType = OrdersType;
        OrdersStatus = ordersStatus;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.order_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.OrdersId.setText(OrdersId.get(position));
        holder.OrdersDate.setText(OrdersDate.get(position));
        holder.OrdersPrice.setText(OrdersPrice.get(position));
        holder.OrdersPrice.setText(OrdersPrice.get(position));
        holder.OrdersType.setText(OrdersType.get(position));
        holder.OrdersStatus.setText(OrdersStatus.get(position));
    }

    @Override
    public int getItemCount() {
        return OrdersId.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView OrdersId, OrdersDate, OrdersPrice, OrdersType, OrdersStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            OrdersId = itemView.findViewById(R.id.orderid);
            OrdersDate = itemView.findViewById(R.id.orderdate);
            OrdersPrice = itemView.findViewById(R.id.orderprice);
            OrdersType = itemView.findViewById(R.id.ordertype);
            OrdersStatus = itemView.findViewById(R.id.orderStatus);
        }
    }
}
