package com.example.cashier_app.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.Repository.branchRepository;

import java.util.List;

public class branchViewModel extends AndroidViewModel {
    private branchRepository branch_Repository;
    private LiveData<List<branch>> AllBranches;
    public branchViewModel(@NonNull Application application) {
        super(application);
        branch_Repository=new branchRepository(application);
        AllBranches= branch_Repository.getAllBranch();
    }
    public void insert(branch b){
        branch_Repository.insert(b);
    }
    public void update(branch b){
        branch_Repository.update(b);
    }
    public void delete(branch b){
        branch_Repository.delete(b);
    }
    public void deleteAll(){
        branch_Repository.deleteAll();
    }
    public LiveData<List<branch>> getAllBranches(){
         return branch_Repository.getAllBranch();
    }

}
