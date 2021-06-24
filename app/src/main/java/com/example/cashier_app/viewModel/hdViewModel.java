package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSHeader;
import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.repository.hdRepository;

import java.util.List;

public class hdViewModel extends AndroidViewModel {
    private hdRepository hd_Repository;
    private LiveData<List<POSHeader>> getAllHeader;
    public hdViewModel(@NonNull Application application) {
        super(application);
        hd_Repository=new hdRepository(application);
        getAllHeader= hd_Repository.getAllHeader();
    }
    public void insert(POSHeader h){
        hd_Repository.insert(h);
    }
    public void update(POSHeader h){
        hd_Repository.update(h);
    }
    public void delete(POSHeader h){
        hd_Repository.delete(h);
    }
    public void deleteAll(){
        hd_Repository.deleteAll();
    }
    public LiveData<List<POSHeader>> getAllHeader(){
        return hd_Repository.getAllHeader();
    }

}