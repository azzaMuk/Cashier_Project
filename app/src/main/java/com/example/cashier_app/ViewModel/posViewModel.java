package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POS;
import com.example.cashier_app.Repository.POSRepository;

import java.util.List;

public class posViewModel extends AndroidViewModel {
    private POSRepository POS_Repository;
    private LiveData<List<POS>> getAllPOS;
    public posViewModel(@NonNull Application application) {
        super(application);
        POS_Repository=new POSRepository(application);
        getAllPOS= POS_Repository.getAllPOS();
    }
    public void insert(POS p){
        POS_Repository.insert(p);
    }
    public void update(POS p){
        POS_Repository.update(p);
    }
    public void delete(POS p){
        POS_Repository.delete(p);
    }
    public void deleteAll(){
        POS_Repository.deleteAll();
    }
    public LiveData<List<POS>> getAllPOS(){
        return POS_Repository.getAllPOS();
    }

}