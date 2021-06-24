package com.example.cashier_app.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.offers;
import com.example.cashier_app.repository.offersRepository;

import java.util.List;

public class offersViewModel extends AndroidViewModel {
    private offersRepository offers_Repository;
    private LiveData<List<offers>> getAllOffers;
    public offersViewModel(@NonNull Application application) {
        super(application);
        offers_Repository=new offersRepository(application);
        getAllOffers= offers_Repository.getAllOffer();
    }
    public void insert(offers c){
        offers_Repository.insert(c);
    }
    public void update(offers c){
        offers_Repository.update(c);
    }
    public void delete(offers c){
        offers_Repository.delete(c);
    }
    public void deleteAll(){
        offers_Repository.deleteAll();
    }
    public LiveData<List<offers>> getAllOffers(){
        return offers_Repository.getAllOffer();
    }

}