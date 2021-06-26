package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.category;

import java.util.List;

@Dao
public interface categoryDAO {
    @Insert
    void insert(category ctg);

    @Update
    void update(category ctg);

    @Delete
    void delete(category ctg);

    @Query("DELETE From category")
    void deleteAll();

    @Query("SELECT * From category")
    LiveData<List<category>> getAllCategory();
}
