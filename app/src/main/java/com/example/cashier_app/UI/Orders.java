package com.example.cashier_app.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.List;

public class Orders extends AppCompatActivity {
    RecyclerView OrdersRv, BillRV;
    OrderAdaptor ordersAdaptor;
    BillAdaptor billAdaptor ;
    List<String> OrdersId, OrdersDate, OrdersPrice, OrdersType, OrdersStatus;
    List<String> ItemsNames= MainActivity.ItemsNames;
    List<String> ItemsOptions= MainActivity.ItemsOptions;
    List<String> ItemsQuantity= MainActivity.ItemsQuantity;
    List<String> ItemPrice= MainActivity.ItemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportpage_screen_activity);

        OrdersRv = findViewById(R.id.OrdersRv);
        BillRV = findViewById(R.id.billRv);
        OrdersId=new ArrayList<>();
        OrdersDate=new ArrayList<>();
        OrdersPrice=new ArrayList<>();
        OrdersType=new ArrayList<>();
        OrdersStatus=new ArrayList<>();

        OrdersId.add("198327298");
        OrdersId.add("198327298");
        OrdersId.add("198327298");
        OrdersId.add("198327298");
        OrdersId.add("198327298");
        OrdersDate.add("12/21/2021 10:00 AM");
        OrdersDate.add("12/21/2021 9:00 AM");
        OrdersDate.add("12/21/2021 8:00 AM");
        OrdersDate.add("12/21/2021 12:00 PM");
        OrdersDate.add("12/21/2021 10:30 AM");
        OrdersPrice.add("120 SAR");
        OrdersPrice.add("160 SAR");
        OrdersPrice.add("50 SAR");
        OrdersPrice.add("200 SAR");
        OrdersPrice.add("66 SAR");
        OrdersType.add("Delivery");
        OrdersType.add("Dine in");
        OrdersType.add("Dine in");
        OrdersType.add("Delivery");
        OrdersType.add("Pick Up");
        OrdersStatus.add("Waiting");
        OrdersStatus.add("Complete");
        OrdersStatus.add("In Process");
        OrdersStatus.add("Complete");
        OrdersStatus.add("Returned");


        ordersAdaptor = new OrderAdaptor(this,OrdersId,OrdersDate,OrdersPrice,OrdersType,OrdersStatus);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        OrdersRv.setLayoutManager(gridLayoutManager);
        OrdersRv.setAdapter(ordersAdaptor);

        billAdaptor = new BillAdaptor(this,ItemsNames,ItemsOptions,ItemsQuantity, ItemPrice );
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        BillRV.setLayoutManager(gridLayoutManager1);
        BillRV.setAdapter(billAdaptor);



    }
}