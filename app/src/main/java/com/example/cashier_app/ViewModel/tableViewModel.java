package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.restaurantTables;
import com.example.cashier_app.Repository.tablesRepository;

import java.util.List;

public class tableViewModel extends AndroidViewModel {
    private tablesRepository tables_Repository;
    private LiveData<List<restaurantTables>> getAllTable;
    public tableViewModel(@NonNull Application application) {
        super(application);
        tables_Repository=new tablesRepository(application);
        getAllTable= tables_Repository.getAllTable();
    }
    public void insert(restaurantTables t){
        tables_Repository.insert(t);
    }
    public void update(restaurantTables t){
        tables_Repository.update(t);
    }
    public void delete(restaurantTables t){
        tables_Repository.delete(t);
    }
    public void deleteAll(){
        tables_Repository.deleteAll();
    }
    public LiveData<List<restaurantTables>> getAllTable(){
        return tables_Repository.getAllTable();
    }

}
