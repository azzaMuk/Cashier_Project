package com.example.cashier_app.dao;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.cashier_app.DB_entities.POS;
import com.example.cashier_app.DB_entities.POSHeader;
import com.example.cashier_app.DB_entities.POSdetails;
import com.example.cashier_app.DB_entities.POSdtoption;
import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.DB_entities.centerOfSale;
import com.example.cashier_app.DB_entities.salesPerson;
import com.example.cashier_app.DB_entities.itemOptions;
import com.example.cashier_app.DB_entities.menu;
import com.example.cashier_app.DB_entities.mix_menu_options;
import com.example.cashier_app.DB_entities.offers;
import com.example.cashier_app.DB_entities.paymentDB;
import com.example.cashier_app.DB_entities.paymentMethodsDB;
import com.example.cashier_app.DB_entities.restaurantTables;
import com.example.cashier_app.DB_entities.role;
import com.example.cashier_app.DB_entities.status;

@Database(entities = {branch.class, category.class, centerOfSale.class, salesPerson.class, itemOptions.class, menu.class,
        mix_menu_options.class, offers.class, paymentDB.class, paymentMethodsDB.class, POS.class, POSdetails.class,
        POSdtoption.class, POSHeader.class, restaurantTables.class, role.class, status.class},version = 1)
public abstract class roomDB extends RoomDatabase {

    private static roomDB instance;
    //WE NEED HERE CREATE OBJECT FROM DAO
    //....
    //Singleton
    public static synchronized roomDB getInstance(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(),roomDB.class,"cashierDB")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract branchDAO branchDAO();
    public abstract menuDAO menuDAO();
    public abstract categoryDAO categoryDAO();
    public abstract centerOfSaleDAO centerOfSaleDAO();
    public abstract itemOptionDAO itemOptionDAO();
    public abstract mix_menu_optionsDAO mix_menu_optionsDAO();
    public abstract offersDAO offersDAO();
    public abstract paymentDAO paymentDAO();
    public abstract paymentMethodsDAO paymentMethodsDAO();
    public abstract posDAO posDAO();
    public abstract POSdetailsDAO POSdetailsDAO();
    public abstract POSHeaderDAO POSHeaderDAO();
    public abstract tablesDAO tablesDAO();
    public abstract roleDAO role_DAO();
    public abstract salesPersonDAO salesPersonDAO();
    public abstract statusDAO statusDAO();
    public abstract tableTypeDAO tableTypeDAO();
    public abstract POSdtoptionDAO POSdtoptionDAO();
    public abstract tillDAO tillDAO();
    public abstract orderTypeDAO orderTypeDAO();
    public abstract comboItemsDAO comboItemsDAO();
}

