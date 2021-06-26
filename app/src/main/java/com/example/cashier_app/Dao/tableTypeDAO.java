package com.example.cashier_app.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.tableType;

import java.util.List;
@Dao
public interface tableTypeDAO {


        @Insert
        void insert(tableType type);

        @Update
        void update(tableType type);

        @Delete
        void delete(tableType type);

        @Query("DELETE From tableType")
        void deleteAll();

        @Query("SELECT * From tableType")
        LiveData<List<tableType>> getAllTypes();
}
