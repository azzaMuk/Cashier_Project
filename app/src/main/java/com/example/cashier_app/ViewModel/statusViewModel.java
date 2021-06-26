package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.cashier_app.DB_entities.status;
import com.example.cashier_app.Repository.statusRepository;

import java.util.List;

public class statusViewModel extends AndroidViewModel {
    private statusRepository status_Repository;
    private LiveData<List<status>> getAllStatus;
    public statusViewModel(@NonNull Application application) {
        super(application);
        status_Repository=new statusRepository(application);
        getAllStatus= status_Repository.getAllStatus();
    }
    public void insert(status s){
        status_Repository.insert(s);
    }
    public void update(status s){
        status_Repository.update(s);
    }
    public void delete(status s){
        status_Repository.delete(s);
    }
    public void deleteAll(){
        status_Repository.deleteAll();
    }
    public LiveData<List<status>> getAllStatus(){
        return status_Repository.getAllStatus();
    }

}