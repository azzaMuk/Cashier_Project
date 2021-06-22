package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.comboItems;

import java.util.List;

@Dao
public interface comboItemsDAO {
    @Insert
    void insert(comboItems combo);

    @Update
    void update(comboItems combo);

    @Delete
    void delete(comboItems combo);

    @Query("DELETE From comboItems")
    void deleteAll();

    @Query("SELECT * From comboItems")
    LiveData<List<comboItems>> getAllCombo();
}
