package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.cashier_app.DB_entities.orderType;
import com.example.cashier_app.Repository.orderTypeRepository;

import java.util.List;

public class otViewModel extends AndroidViewModel {
    private orderTypeRepository orderType_Repository;
    private LiveData<List<orderType>> getAllTypes;
    public otViewModel(@NonNull Application application) {
        super(application);
        orderType_Repository=new orderTypeRepository(application);
        getAllTypes= orderType_Repository.getAllTypes();
    }
    public void insert(orderType o){
        orderType_Repository.insert(o);
    }
    public void update(orderType o){
        orderType_Repository.update(o);
    }
    public void delete(orderType o){
        orderType_Repository.delete(o);
    }
    public void deleteAll(){
        orderType_Repository.deleteAll();
    }
    public LiveData<List<orderType>> getAllTypes(){
        return orderType_Repository.getAllTypes();
    }

}