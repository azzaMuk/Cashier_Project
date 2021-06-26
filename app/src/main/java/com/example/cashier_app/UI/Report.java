package com.example.cashier_app.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.List;

public class Report extends AppCompatActivity {
    RecyclerView ItemsSalesRv;
    SalesAdaptor salesAdaptor;
    List<String> ItemName, ItemCategory, ItemAvailableCount, ItemOrdersNum, ItemSales;
    List<Integer> ItemImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sales_screen_activity);
        ItemsSalesRv = findViewById(R.id.ItemsSalesRv);

        ItemName = new ArrayList<>();
        ItemName.add("Classic Burger");
        ItemName.add("BBQ");
        ItemName.add("Mexi");
        ItemName.add("Fire");
        ItemName.add("Smoke Stack ");

        ItemCategory = new ArrayList<>();
        ItemCategory.add("Burgers");
        ItemCategory.add("Sandwich");
        ItemCategory.add("Burgers");
        ItemCategory.add("Burgers");
        ItemCategory.add("Pizza");

        ItemImg = new ArrayList<>();
        ItemImg.add(R.drawable.burger2);
        ItemImg.add(R.drawable.beefburger);
        ItemImg.add(R.drawable.beefburger2);
        ItemImg.add(R.drawable.chickenburger);
        ItemImg.add(R.drawable.crispychickenburger);
        ItemImg.add(R.drawable.beefburger);

        ItemAvailableCount = new ArrayList<>();
        ItemAvailableCount.add("0");
        ItemAvailableCount.add("50 ");
        ItemAvailableCount.add("2");
        ItemAvailableCount.add("7");
        ItemAvailableCount.add("47");

        ItemOrdersNum = new ArrayList<>();
        ItemOrdersNum.add("14");
        ItemOrdersNum.add("453 ");
        ItemOrdersNum.add("32");
        ItemOrdersNum.add("17");
        ItemOrdersNum.add("47");

        ItemSales = new ArrayList<>();
        ItemSales.add("100");
        ItemSales.add("453 ");
        ItemSales.add("32");
        ItemSales.add("17");
        ItemSales.add("47");


        salesAdaptor = new SalesAdaptor(this,ItemName,  ItemCategory, ItemAvailableCount, ItemOrdersNum, ItemSales, ItemImg);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        ItemsSalesRv.setLayoutManager(gridLayoutManager);
        ItemsSalesRv.setAdapter(salesAdaptor);


    }
}
