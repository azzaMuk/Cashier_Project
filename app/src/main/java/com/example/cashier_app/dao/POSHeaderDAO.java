package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.POSHeader;
import com.example.cashier_app.DB_entities.branch;

import java.util.List;

@Dao
public interface POSHeaderDAO {


    @Insert
    void insert(POSHeader hd);

    @Update
    void update(POSHeader hd);

    @Delete
    void delete(POSHeader hd);

    @Query("DELETE From POSHeader")
    void deleteAll();

    @Query("SELECT * From POSHeader")
    LiveData<List<POSHeader>> getAllHeader();


}
