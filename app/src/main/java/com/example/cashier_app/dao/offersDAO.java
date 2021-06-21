package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.offers;

import java.util.List;

@Dao
public interface offersDAO {
    @Insert
    void insert(offers ofr);

    @Update
    void update(offers ofr);

    @Delete
    void delete(offers ofr);

    @Query("DELETE From offers")
    void deleteAll();

    @Query("SELECT * From offers")
    LiveData<List<offers>> getAllOffers();
}
