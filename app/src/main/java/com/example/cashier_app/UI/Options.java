package com.example.cashier_app.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.List;

public class Options  extends AppCompatActivity {
    List<String> Options;
    RecyclerView OptionRv,BillRV;
   OptionAdaptor optionAdaptor;
   BillAdaptor billAdaptor ;
    List<String> ItemsNames= MainActivity.ItemsNames;
    List<String> ItemsOptions= MainActivity.ItemsOptions;
    List<String> ItemsQuantity= MainActivity.ItemsQuantity;
    List<String> ItemPrice= MainActivity.ItemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_screen_activity);

        BillRV = findViewById(R.id.billRv);
        OptionRv=findViewById(R.id.OptionRv);
        Options= new ArrayList<>();
        Options.add("Tomatos");
        Options.add("Cheese +3 SAR");
        Options.add("Double +9 SAR");
        Options.add("Spicy");
        Options.add("Welldone");

        optionAdaptor= new OptionAdaptor(this,Options);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        OptionRv.setLayoutManager(gridLayoutManager);
        OptionRv.setAdapter(optionAdaptor);

        billAdaptor = new BillAdaptor(this,ItemsNames,ItemsOptions,ItemsQuantity,ItemPrice );
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        BillRV.setLayoutManager(gridLayoutManager1);
        BillRV.setAdapter(billAdaptor);
    }
}