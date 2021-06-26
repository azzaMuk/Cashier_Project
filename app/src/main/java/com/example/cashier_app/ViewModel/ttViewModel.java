package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.cashier_app.DB_entities.tableType;
import com.example.cashier_app.Repository.tableTypeRepository;

import java.util.List;

public class ttViewModel extends AndroidViewModel {
    private tableTypeRepository tableType_Repository;
    private LiveData<List<tableType>> getAllType;
    public ttViewModel(@NonNull Application application) {
        super(application);
        tableType_Repository=new tableTypeRepository(application);
        getAllType= tableType_Repository.getAllType();
    }
    public void insert(tableType tt){
        tableType_Repository.insert(tt);
    }
    public void update(tableType tt){
        tableType_Repository.update(tt);
    }
    public void delete(tableType tt){
        tableType_Repository.delete(tt);
    }
    public void deleteAll(){
        tableType_Repository.deleteAll();
    }
    public LiveData<List<tableType>> getAllType(){
        return tableType_Repository.getAllType();
    }

}
