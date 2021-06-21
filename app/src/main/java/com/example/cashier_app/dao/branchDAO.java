package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.branch;

import java.util.List;

@Dao
public interface branchDAO {

    @Insert
    void insert(branch brn);

    @Update
    void update(branch brn);

    @Delete
    void delete(branch brn);

    @Query("DELETE From branch")
    void deleteAll();

    @Query("SELECT * From branch")
    LiveData<List<branch>> getAllBranch();
}
