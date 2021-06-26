package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.cashier_app.DB_entities.till;

import java.util.List;
@Dao
public interface tillDAO {
    @Insert
    void insert(till t);

    @Update
    void update(till t);

    @Delete
    void delete(till t);

    @Query("DELETE From till")
    void deleteAll();

    @Query("SELECT * From till")
    LiveData<List<till>> getAllTills();
}
