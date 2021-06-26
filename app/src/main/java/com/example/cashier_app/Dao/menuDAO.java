package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.menu;

import java.util.List;

@Dao
public interface menuDAO {
    @Insert
    void insert(menu m);

    @Update
    void update(menu m);

    @Delete
    void delete(menu m);

    @Query("DELETE From menu")
    void deleteAll();

    @Query("SELECT * From menu")
    LiveData<List<menu>> getAllMenu();
}
