package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.role;
import com.example.cashier_app.Repository.roleRepository;

import java.util.List;

public class roleViewModel extends AndroidViewModel {
    private roleRepository role_Repository;
    private LiveData<List<role>> getAllRoles;
    public roleViewModel(@NonNull Application application) {
        super(application);
        role_Repository=new roleRepository(application);
        getAllRoles= role_Repository.getAllRole();
    }
    public void insert(role r){
        role_Repository.insert(r);
    }
    public void update(role r){
        role_Repository.update(r);
    }
    public void delete(role r){
        role_Repository.delete(r);
    }
    public void deleteAll(){
        role_Repository.deleteAll();
    }
    public LiveData<List<role>> getAllRole(){
        return role_Repository.getAllRole();
    }
}