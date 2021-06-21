package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.role;

import java.util.List;

@Dao
public interface roleDAO {

    @Insert
    void insert(role r);

    @Update
    void update(role r);

    @Delete
    void delete(role r);

    @Query("DELETE From role")
    void deleteAll();

    @Query("SELECT * From role")
    LiveData<List<role>> getAllRole();
}
