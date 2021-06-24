package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.repository.categoryRepository;

import java.util.List;

public class categoryViewModel extends AndroidViewModel {
    private categoryRepository category_Repository;
    private LiveData<List<category>> getAllCategory;
    public categoryViewModel(@NonNull Application application) {
        super(application);
        category_Repository=new categoryRepository(application);
        getAllCategory= category_Repository.getAllCategories();
    }
    public void insert(category c){
        category_Repository.insert(c);
    }
    public void update(category c){
        category_Repository.update(c);
    }
    public void delete(category c){
        category_Repository.delete(c);
    }
    public void deleteAll(){
        category_Repository.deleteAll();
    }
    public LiveData<List<category>> getAllCategory(){
        return category_Repository.getAllCategories();
    }

}
