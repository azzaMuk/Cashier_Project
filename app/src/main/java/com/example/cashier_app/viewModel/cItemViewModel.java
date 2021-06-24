package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.comboItems;
import com.example.cashier_app.repository.comboItemsRepository;

import java.util.List;

public class cItemViewModel extends AndroidViewModel {
    private comboItemsRepository comboItems_Repository;
    private LiveData<List<comboItems>> getAllCombo;

    public cItemViewModel(@NonNull Application application) {
        super(application);
        comboItems_Repository = new comboItemsRepository(application);
        getAllCombo = comboItems_Repository.getAllCombo();
    }

    public void insert(comboItems c) {
        comboItems_Repository.insert(c);
    }

    public void update(comboItems c) {
        comboItems_Repository.update(c);
    }

    public void delete(comboItems c) {
        comboItems_Repository.delete(c);
    }

    public void deleteAll() {
        comboItems_Repository.deleteAll();
    }

    public LiveData<List<comboItems>> getAllCombo() {
        return comboItems_Repository.getAllCombo();
    }
}

