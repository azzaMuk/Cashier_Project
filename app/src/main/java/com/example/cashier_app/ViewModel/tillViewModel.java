package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.till;
import com.example.cashier_app.Repository.tillRepository;

import java.util.List;

public class tillViewModel extends AndroidViewModel {
    private tillRepository till_Repository;
    private LiveData<List<till>> AllTills;
    public tillViewModel(@NonNull Application application) {
        super(application);
        till_Repository=new tillRepository(application);
        AllTills= till_Repository.getAllTills();
    }
    public void insert(till t){
        till_Repository.insert(t);
    }
    public void update(till t){
        till_Repository.update(t);
    }
    public void delete(till t){
        till_Repository.delete(t);
    }
    public void deleteAll(){
        till_Repository.deleteAll();
    }
    public LiveData<List<till>> AllTills(){
        return till_Repository.getAllTills();
    }
}
