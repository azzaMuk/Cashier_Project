package com.example.cashier_app.UI;

import android.os.Bundle;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cashier_app.R;

public class Timedialog extends AppCompatActivity {
    private TimePicker timePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepicker);

        TimePicker picker=(TimePicker)findViewById(R.id.timePicker);
        picker.setIs24HourView(false);



    }


}
