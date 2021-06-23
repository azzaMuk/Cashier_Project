package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.POSdetails;

import java.util.List;
@Dao
public interface POSdetailsDAO {

    @Insert
    void insert(POSdetails dt);

    @Update
    void update(POSdetails dt);

    @Delete
    void delete(POSdetails dt);

    @Query("DELETE From POSdetails")
    void deleteAll();

    @Query("SELECT * From POSdetails")
    LiveData<List<POSdetails>> getAllPOSdetails();
}
