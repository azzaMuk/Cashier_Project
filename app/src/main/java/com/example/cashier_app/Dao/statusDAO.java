package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.status;

import java.util.List;

@Dao
public interface statusDAO {

    @Insert
    void insert(status stu);

    @Update
    void update(status stu);

    @Delete
    void delete(status stu);

    @Query("DELETE From status")
    void deleteAll();

    @Query("SELECT * From status")
    LiveData<List<status>> getAllStatus();
}
