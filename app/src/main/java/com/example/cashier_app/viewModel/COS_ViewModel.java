package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.DB_entities.centerOfSale;
import com.example.cashier_app.repository.COSRepository;
import com.example.cashier_app.repository.categoryRepository;

import java.util.List;

public class COS_ViewModel extends AndroidViewModel {
    private COSRepository COS_Repository;
    private LiveData<List<centerOfSale>> getAllCOS ;
    public COS_ViewModel(@NonNull Application application) {
        super(application);
        COS_Repository=new COSRepository(application);
        getAllCOS= COS_Repository.getAllCOS();
    }
    public void insert(centerOfSale c){
        COS_Repository.insert(c);
    }
    public void update(centerOfSale c){
        COS_Repository.update(c);
    }
    public void delete(centerOfSale c){
        COS_Repository.delete(c);
    }
    public void deleteAll(){
        COS_Repository.deleteAll();
    }
    public LiveData<List<centerOfSale>> getAllCategory(){
        return COS_Repository.getAllCOS();
    }
}
