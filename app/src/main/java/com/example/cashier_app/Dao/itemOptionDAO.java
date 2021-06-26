package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.itemOptions;

import java.util.List;

@Dao
public interface itemOptionDAO {
    @Insert
    void insert(itemOptions opt);

    @Update
    void update(itemOptions opt);

    @Delete
    void delete(itemOptions opt);

    @Query("DELETE From options")
    void deleteAll();

    @Query("SELECT * From options")
    LiveData<List<itemOptions>> getAllOpt();
}
