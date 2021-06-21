package com.example.cashier_app.UI;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cashier_app.R;

public class MainScreenActivity extends AppCompatActivity {
    Button tillbtn, updatebtn,reportbtn,homebtn,discountbtn, percentbtn,amountbtn, ordersbtn ,itembtn, paymentbtn;
    Dialog dialog,dialogUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_activity);

        //assign vars
        tillbtn= findViewById(R.id.Tillbtn);
        updatebtn=findViewById(R.id.Updatebtn);
        discountbtn=findViewById(R.id.Discountbtn);
        percentbtn=findViewById(R.id.percentbtn);
        amountbtn=findViewById(R.id.amountbtn);
        reportbtn=findViewById(R.id.reportsbtn);
        ordersbtn=findViewById(R.id.ordersbtn);
        itembtn=findViewById(R.id.itembtn);
        paymentbtn=findViewById(R.id.paymentbtn);

        dialog=new Dialog(this);
        dialogUpdate= new Dialog(this);


      tillbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              openTillDialog();
          }
      });

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
                Intent i = new Intent(getApplicationContext(), Report.class);
                startActivity(i);
            }
        });

        itembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Item.class);
                startActivity(i);
            }
        });
        paymentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Payment.class);
                startActivity(i);
            }
        });
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
//        amountbtn=findViewById(R.id.amountbtn);
//        amountbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DisoucntnumDialog();
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

}
