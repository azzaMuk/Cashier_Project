package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.salesPerson;
import com.example.cashier_app.Repository.spRepository;

import java.util.List;

public class spViewModel extends AndroidViewModel {
    private spRepository sp_Repository;
    private LiveData<List<salesPerson>> getAllPersons;
    public spViewModel(@NonNull Application application) {
        super(application);
        sp_Repository=new spRepository(application);
        getAllPersons= sp_Repository.getAllPersons();
    }
    public void insert(salesPerson sp){
        sp_Repository.insert(sp);
    }
    public void update(salesPerson sp){
        sp_Repository.update(sp);
    }
    public void delete(salesPerson sp){
        sp_Repository.delete(sp);
    }
    public void deleteAll(){
        sp_Repository.deleteAll();
    }
    public LiveData<List<salesPerson>> getAllPersons(){
        return sp_Repository.getAllPersons();
    }

}