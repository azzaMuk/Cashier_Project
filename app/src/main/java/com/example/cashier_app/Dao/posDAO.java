package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.POS;

import java.util.List;

@Dao
public interface posDAO {

    @Insert
    void insert(POS pos);

    @Update
    void update(POS pos);

    @Delete
    void delete(POS pos);

    @Query("DELETE From POS")
    void deleteAll();

    @Query("SELECT * From POS")
    LiveData<List<POS>> getAllPOS();
}
