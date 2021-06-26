package com.example.cashier_app.UI;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TimePickerDialog.OnTimeSetListener setListener;

    Button tillbtn, updatebtn, reportbtn, tablebtn, homebtn, discountbtn, percentbtn, amountbtn, ordersbtn, itembtn, paymentbtn, splitbtn,loginbtn;
    Dialog dialog, dialogUpdate;
    RecyclerView BillRV, GridRV;
    public static List<String> ItemsNames, ItemsOptions, ItemsQuantity, ItemTitle, ItemPrice;
    List<Integer> ItemImg;
    public BillAdaptor billAdaptor;
    GridAdaptor gridAdaptor;
    TimePickerDialog picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_activity1);

        //assign vars
        tillbtn = findViewById(R.id.Tillbtn);
        splitbtn = findViewById(R.id.splitbtn);
        homebtn = findViewById(R.id.homebtn);
        updatebtn = findViewById(R.id.Updatebtn);
        discountbtn = findViewById(R.id.Discountbtn);
        percentbtn = findViewById(R.id.percentbtn);
        amountbtn = findViewById(R.id.amountbtn);
        reportbtn = findViewById(R.id.reportsbtn);
        ordersbtn = findViewById(R.id.ordersbtn);
        paymentbtn = findViewById(R.id.paymentbtn);
        tablebtn = findViewById(R.id.tablebtn);
        loginbtn=findViewById(R.id.Loginbtn);

        dialog = new Dialog(this);
        dialogUpdate = new Dialog(this);


        //recycle view
        BillRV = findViewById(R.id.billRv);
        GridRV = findViewById(R.id.GridRv);

        ItemsNames = new ArrayList<>();
        ItemsNames.add("Beef Burger");
        ItemsNames.add("chicken Burger");
        ItemsNames.add("Pizza");
        ItemsNames.add("Beef Burger");
        ItemsNames.add("Coka Cola ");

        ItemsOptions = new ArrayList<>();
        ItemsOptions.add("Tomatos");
        ItemsOptions.add("Tomatos, Lettuce, Spicy ");
        ItemsOptions.add("Spicy");
        ItemsOptions.add("Tomatos , Lettuce");
        ItemsOptions.add("");

        ItemsQuantity = new ArrayList<>();
        ItemsQuantity.add("x 1");
        ItemsQuantity.add("x 1");
        ItemsQuantity.add("x 2");
        ItemsQuantity.add("x 1");
        ItemsQuantity.add("x 3");

        ItemPrice = new ArrayList<>();
        ItemPrice.add("40 SAR");
        ItemPrice.add("30 SAR");
        ItemPrice.add("45 SAR");
        ItemPrice.add("23 SAR");
        ItemPrice.add("54 SAR");

        //for grid category
        ItemTitle = new ArrayList<>();
        ItemTitle.add("Burger");
        ItemTitle.add("Sandwich");
        ItemTitle.add("Pizza");
        ItemTitle.add("Meals");
        ItemTitle.add("Dessert");
        ItemTitle.add("Soda");

        ItemImg = new ArrayList<>();
        ItemImg.add(R.drawable.burger2);
        ItemImg.add(R.drawable.sandwaiches);
        ItemImg.add(R.drawable.pizza);
        ItemImg.add(R.drawable.beefburger);
        ItemImg.add(R.drawable.desert);
        ItemImg.add(R.drawable.soda);

        billAdaptor = new BillAdaptor(this, ItemsNames, ItemsOptions, ItemsQuantity, ItemPrice);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        BillRV.setLayoutManager(gridLayoutManager);
        BillRV.setAdapter(billAdaptor);

        gridAdaptor = new GridAdaptor(this, ItemTitle, ItemImg, new GridAdaptor.ItemClickListener() {
            @Override
            public void onItemClick(String items) {
                nextScreen();
            }
        });
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false);
        GridRV.setLayoutManager(gridLayoutManager1);
        GridRV.setAdapter(gridAdaptor);

        tillbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTillDialog();
            }
        });
        splitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.split_dialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //here where  put the yes or no button activity

                dialog.show();
            }
        });
        tablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                TimePickerDialog dialog = new TimePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, setListener, hour, minutes, false);
               
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        setListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Log.d(TAG, "onDateSet: date" + hourOfDay + "/" + minute);
            }
        };

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUpdateDialog();
            }
        });
        discountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendicountDialog();
            }
        });

        ordersbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Orders.class);
                startActivity(i);
            }
        });
        reportbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Report.class);
                startActivity(i);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Item.class);
                startActivity(i);
            }
        });

//        paymentbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), Payment.class);
//                startActivity(i);
//            }
//        });
    }

    private void DisoucntnumDialog() {
        dialogUpdate.setContentView(R.layout.discountmount_dialog);
        dialogUpdate.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //here where  put the yes or no button activity


        dialogUpdate.show();
    }

    public void opendicountDialog() {
        dialogUpdate.setContentView(R.layout.discount_dialog);
        dialogUpdate.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //here where  put the yes or no button activity

        dialogUpdate.show();
//        amountbtn = findViewById(R.id.amountbtn);
//        amountbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DisoucntnumDialog();
//
//            }
//        });
    }

    public void openUpdateDialog() {
        dialogUpdate.setContentView(R.layout.update_dialog);
        dialogUpdate.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //here where  put the yes or no button activity

        dialogUpdate.show();
    }

    public void openTillDialog() {
        dialog.setContentView(R.layout.till_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //here where  put the yes or no button activity

        dialog.show();
    }

    private void nextScreen() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Item.class);
        startActivity(intent);

    }
}


