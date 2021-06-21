package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.POSdtoption;

import java.util.List;

@Dao
public interface POSdtoptionDAO {

    @Insert
    void insert(POSdtoption dtOption);

    @Update
    void update(POSdtoption dtOption);

    @Delete
    void delete(POSdtoption brn);

    @Query("DELETE From POSdtoption")
    void deleteAll();

    @Query("SELECT * From POSdtoption")
    LiveData<List<POSdtoption>> getAllDtOptions();
}
