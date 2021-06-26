package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.menu;
import com.example.cashier_app.Repository.menuRepository;

import java.util.List;

public class menuViewModel extends AndroidViewModel {
    private menuRepository menu_Repository;
    private LiveData<List<menu>> getAllItems ;
    public menuViewModel(@NonNull Application application) {
        super(application);
        menu_Repository=new menuRepository(application);
        getAllItems= menu_Repository.getAllItems();
    }
    public void insert(menu m){
        menu_Repository.insert(m);
    }
    public void update(menu m){
        menu_Repository.update(m);
    }
    public void delete(menu m){
        menu_Repository.delete(m);
    }
    public void deleteAll(){
        menu_Repository.deleteAll();
    }
    public LiveData<List<menu>> getAllItems(){
        return menu_Repository.getAllItems();
    }
}

