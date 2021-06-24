package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSdtoption;
import com.example.cashier_app.repository.dtOptionRepository;

import java.util.List;

public class dtOptionViewModel extends AndroidViewModel {
    private dtOptionRepository dtOption_Repository;
    private LiveData<List<POSdtoption>> getAllDtOptions;

    public dtOptionViewModel(@NonNull Application application) {
        super(application);
        dtOption_Repository = new dtOptionRepository(application);
        getAllDtOptions = dtOption_Repository.getAllDtOptions();
    }

    public void insert(POSdtoption c) {
        dtOption_Repository.insert(c);
    }

    public void update(POSdtoption c) {
        dtOption_Repository.update(c);
    }

    public void delete(POSdtoption c) {
        dtOption_Repository.delete(c);
    }

    public void deleteAll() {
        dtOption_Repository.deleteAll();
    }

    public LiveData<List<POSdtoption>> getAllDtOptions() {
        return dtOption_Repository.getAllDtOptions();
    }
}