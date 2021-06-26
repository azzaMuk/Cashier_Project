package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.cashier_app.DB_entities.paymentDB;
import com.example.cashier_app.Repository.paymentDBRepository;

import java.util.List;

public class payViewModel extends AndroidViewModel {
    private paymentDBRepository paymentDB_Repository;
    private LiveData<List<paymentDB>> getAllPayment;
    public payViewModel(@NonNull Application application) {
        super(application);
        paymentDB_Repository=new paymentDBRepository(application);
        getAllPayment= paymentDB_Repository.getAllPayment();
    }
    public void insert(paymentDB p){
        paymentDB_Repository.insert(p);
    }
    public void update(paymentDB p){
        paymentDB_Repository.update(p);
    }
    public void delete(paymentDB p){
        paymentDB_Repository.delete(p);
    }
    public void deleteAll(){
        paymentDB_Repository.deleteAll();
    }
    public LiveData<List<paymentDB>> getAllPayment(){
        return paymentDB_Repository.getAllPayment();
    }

}