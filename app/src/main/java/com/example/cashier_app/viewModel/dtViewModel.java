package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSdetails;
import com.example.cashier_app.repository.dtRepository;

import java.util.List;

public class dtViewModel extends AndroidViewModel {
    private dtRepository dt_Repository;
    private LiveData<List<POSdetails>> getAllDetail;
    public dtViewModel(@NonNull Application application) {
        super(application);
        dt_Repository=new dtRepository(application);
        getAllDetail= dt_Repository.getAllDetail();
    }
    public void insert(POSdetails dt){
        dt_Repository.insert(dt);
    }
    public void update(POSdetails dt){
        dt_Repository.update(dt);
    }
    public void delete(POSdetails dt){
        dt_Repository.delete(dt);
    }
    public void deleteAll(){
        dt_Repository.deleteAll();
    }
    public LiveData<List<POSdetails>> getAllDetail(){
        return dt_Repository.getAllDetail();
    }

}
