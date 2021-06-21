package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.DB_entities.orderType;

import java.util.List;

@Dao
public interface orderTypeDAO {
    @Insert
    void insert(orderType ot);

    @Update
    void update(orderType ot);

    @Delete
    void delete(orderType ot);

    @Query("DELETE From orderType")
    void deleteAll();

    @Query("SELECT * From orderType")
    LiveData<List<orderType>> getAllOrderType();
}
