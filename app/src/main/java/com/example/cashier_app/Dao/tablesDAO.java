package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.restaurantTables;

import java.util.List;

@Dao
public interface tablesDAO {


    @Insert
    void insert(restaurantTables table);

    @Update
    void update(restaurantTables table);

    @Delete
    void delete(restaurantTables table);

    @Query("DELETE From restaurantTables")
    void deleteAll();

    @Query("SELECT * From restaurantTables")
    LiveData<List<restaurantTables>> getAllTables();
}
