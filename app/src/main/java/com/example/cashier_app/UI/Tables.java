package com.example.cashier_app.UI;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.List;

public class Tables extends AppCompatActivity {
    List<String> TablesNames;
    RecyclerView TablesRv,BillRV;
    TablesAdaptor tablesAdaptor;
   BillAdaptor billAdaptor ;
    TextView tablebtn;
    List<String> ItemsNames= MainActivity.ItemsNames;
    List<String> ItemsOptions= MainActivity.ItemsOptions;
    List<String> ItemsQuantity= MainActivity.ItemsQuantity;
    List<String> ItemPrice= MainActivity.ItemPrice;
    TimePickerDialog picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tables_screen_activity);

        BillRV = findViewById(R.id.billRv);
        TablesRv=findViewById(R.id.tablesRv);

        TablesNames= new ArrayList<>();
        TablesNames.add("Table 1");
        TablesNames.add("Table 2");
        TablesNames.add("Table 3");
        TablesNames.add("Table 4");
        TablesNames.add("Table 5");
        TablesNames.add("Table 6");
        TablesNames.add("Table 7");

        tablesAdaptor= new TablesAdaptor(this,TablesNames);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 5,GridLayoutManager.VERTICAL, false);
        TablesRv.setLayoutManager(gridLayoutManager);
        TablesRv.setAdapter(tablesAdaptor);

        billAdaptor = new BillAdaptor(this,ItemsNames,ItemsOptions,ItemsQuantity,ItemPrice );
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        BillRV.setLayoutManager(gridLayoutManager1);
        BillRV.setAdapter(billAdaptor);


    }
    }

