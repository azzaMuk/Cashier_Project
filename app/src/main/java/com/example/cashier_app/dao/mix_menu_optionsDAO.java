package com.example.cashier_app.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.cashier_app.DB_entities.mix_menu_options;

import java.util.List;

@Dao
public interface mix_menu_optionsDAO {
    @Insert
    void insert(mix_menu_options opt);

    @Update
    void update(mix_menu_options opt);

    @Delete
    void delete(mix_menu_options opt);

    @Query("DELETE From mix_menu_options")
    void deleteAll();

    @Query("SELECT * From mix_menu_options")
    LiveData<List<mix_menu_options>> getAllMenuOtp();
}
