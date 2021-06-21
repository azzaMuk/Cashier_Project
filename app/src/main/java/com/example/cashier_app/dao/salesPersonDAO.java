package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.salesPerson;

import java.util.List;

@Dao
public interface salesPersonDAO {
    @Insert
    void insert(com.example.cashier_app.DB_entities.salesPerson emp);

    @Update
    void update(com.example.cashier_app.DB_entities.salesPerson emp);

    @Delete
    void delete(com.example.cashier_app.DB_entities.salesPerson emp);

    @Query("DELETE From salesPerson")
    void deleteAll();

    @Query("SELECT * From salesPerson")
    LiveData<List<com.example.cashier_app.DB_entities.salesPerson>> getAllEmp();
}
