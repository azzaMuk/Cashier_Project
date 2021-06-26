package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.mix_menu_options;
import com.example.cashier_app.Repository.mixRepository;

import java.util.List;

public class mixViewModel extends AndroidViewModel {
    private mixRepository mix_Repository;
    private LiveData<List<mix_menu_options>> getAllMIX;
    public mixViewModel(@NonNull Application application) {
        super(application);
        mix_Repository=new mixRepository(application);
        getAllMIX= mix_Repository.getAllMIX();
    }
    public void insert(mix_menu_options m){
        mix_Repository.insert(m);
    }
    public void update(mix_menu_options m){
        mix_Repository.update(m);
    }
    public void delete(mix_menu_options m){
        mix_Repository.delete(m);
    }
    public void deleteAll(){
        mix_Repository.deleteAll();
    }
    public LiveData<List<mix_menu_options>> getAllMIX(){
        return mix_Repository.getAllMIX();
    }

}