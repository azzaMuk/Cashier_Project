package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.paymentMethodsDB;
import com.example.cashier_app.Repository.branchRepository;
import com.example.cashier_app.Repository.payMethodRepository;

import java.util.List;

public class payMethodViewModel extends AndroidViewModel {
    private payMethodRepository payMethod_Repository;
    private LiveData<List<paymentMethodsDB>> getAllMethod;
    public payMethodViewModel(@NonNull Application application) {
        super(application);
        payMethod_Repository=new payMethodRepository(application);
        getAllMethod= payMethod_Repository.getAllMethod();
    }
    public void insert(paymentMethodsDB p){
        payMethod_Repository.insert(p);
    }
    public void update(paymentMethodsDB p){
        payMethod_Repository.update(p);
    }
    public void delete(paymentMethodsDB p){
        payMethod_Repository.delete(p);
    }
    public void deleteAll(){
        payMethod_Repository.deleteAll();
    }
    public LiveData<List<paymentMethodsDB>> getAllMethod(){
        return payMethod_Repository.getAllMethod();
    }

}