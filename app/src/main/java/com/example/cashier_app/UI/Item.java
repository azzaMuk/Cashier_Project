package com.example.cashier_app.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.List;

public class Item extends AppCompatActivity {
    Button homebtn;
    RecyclerView ItemsRv,BillRV;
    ItemsAdaptor itemsAdaptor;
    List<String> ItemName, ItemsDesc;
    List <Integer> ItemImg;
    BillAdaptor billAdaptor ;
    List<String> ItemsNames= MainActivity.ItemsNames;
    List<String> ItemsOptions= MainActivity.ItemsOptions;
    List<String> ItemsQuantity= MainActivity.ItemsQuantity;
    List<String> ItemPrice= MainActivity.ItemPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_screen_activity);
        homebtn = findViewById(R.id.homebtn);


//recycle view
        BillRV = findViewById(R.id.billRv);
        ItemsRv=findViewById(R.id.ItemsRv);
        ItemName = new ArrayList<>();
        ItemName.add("Classic Burger");
        ItemName.add("BBQ");
        ItemName.add("Mexi");
        ItemName.add("Fire");
        ItemName.add("Smoke Stack ");

        ItemsDesc = new ArrayList<>();
        ItemsDesc.add("Angus beef, lettuce, tomato, caramelized onions, bacon, onion rings, cheddar, BBQ sauce");
        ItemsDesc.add("Angus beef, lettuce, tomato, onions, pickles, mayo ");
        ItemsDesc.add("Lamb, lettuce, tomato, pickled onions, feta cheese, cucumber, tzatziki sauce");
        ItemsDesc.add("Angus beef, house-made chili, queso, onions, pickles");
        ItemsDesc.add("Red bean & mushrooms patty, lettuce, tomato, onions, pickles, mayo");

        ItemImg = new ArrayList<>();
        ItemImg.add(R.drawable.burger2);
        ItemImg.add(R.drawable.beefburger);
        ItemImg.add(R.drawable.beefburger2);
        ItemImg.add(R.drawable.chickenburger);
        ItemImg.add(R.drawable.crispychickenburger);
        ItemImg.add(R.drawable.beefburger);

        itemsAdaptor = new ItemsAdaptor(this, ItemName, ItemImg, ItemsDesc, new ItemsAdaptor.ItemClickListener() {
            @Override
            public void onItemClick(String items) {
                nextScreen();
            }
        });

        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 4,GridLayoutManager.VERTICAL, false);
        ItemsRv.setLayoutManager(gridLayoutManager);
        ItemsRv.setAdapter(itemsAdaptor);

        billAdaptor = new BillAdaptor(this,ItemsNames,ItemsOptions,ItemsQuantity ,ItemPrice);
        GridLayoutManager gridLayoutManager1= new GridLayoutManager(this, 1,GridLayoutManager.VERTICAL, false);
        BillRV.setLayoutManager(gridLayoutManager1);
        BillRV.setAdapter(billAdaptor);


        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Options.class);
                startActivity(i);
            }
        });


    }
    private void nextScreen(){
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,Options.class);
        startActivity(intent);

    }
}
