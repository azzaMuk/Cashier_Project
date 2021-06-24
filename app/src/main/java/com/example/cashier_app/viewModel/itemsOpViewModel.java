package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.itemOptions;
import com.example.cashier_app.repository.itemOptionsRepository;

import java.util.List;

public class itemsOpViewModel extends AndroidViewModel {
    private itemOptionsRepository itemOptions_Repository;
    private LiveData<List<itemOptions>> getAllOptions;
    public itemsOpViewModel(@NonNull Application application) {
        super(application);
        itemOptions_Repository=new itemOptionsRepository(application);
        getAllOptions= itemOptions_Repository.getAllOTP();
    }
    public void insert(itemOptions c){
        itemOptions_Repository.insert(c);
    }
    public void update(itemOptions c){
        itemOptions_Repository.update(c);
    }
    public void delete(itemOptions c){
        itemOptions_Repository.delete(c);
    }
    public void deleteAll(){
        itemOptions_Repository.deleteAll();
    }
    public LiveData<List<itemOptions>> getAllOptions(){
        return itemOptions_Repository.getAllOTP();
    }

}
