package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.offers;
import com.example.cashier_app.Dao.offersDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class offersRepository {
    private offersDAO offers_DAO;
    private LiveData<List<offers>> getAllOffers;

    public offersRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        offers_DAO=db.offersDAO();
        getAllOffers=offers_DAO.getAllOffers();
    }

    //Insert
    public void insert(offers o){
        new offersRepository.InsertAsyncTask(offers_DAO).execute(o);
    }

    //Delete
    public void delete(offers o){
        new offersRepository.DeleteAsyncTask(offers_DAO).execute(o);
    }

    //Update
    public void update(offers o){
        new offersRepository.UpdateAsyncTask(offers_DAO).execute(o);
    }

    //GetAll

    public LiveData<List<offers>> getAllOffer(){
        return getAllOffers;
    }

    //DeleteAll
    public void deleteAll(){
        new offersRepository.DeleteAllAsyncTask(offers_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<offers,Void,Void> {
        private offersDAO offers_DAO;
        public InsertAsyncTask(offersDAO o){
            offers_DAO=o;
        }
        @Override
        protected Void doInBackground(offers... offer) {
            offers_DAO.insert(offer[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<offers,Void,Void> {
        private offersDAO offers_DAO;
        public DeleteAsyncTask(offersDAO o){
            offers_DAO=o;
        }
        @Override
        protected Void doInBackground(offers... offer) {
            offers_DAO.delete(offer[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<offers,Void,Void> {
        private offersDAO offers_DAO;
        public UpdateAsyncTask(offersDAO o){
            offers_DAO=o;
        }
        @Override
        protected Void doInBackground(offers... offer) {
            offers_DAO.update(offer[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private offersDAO offers_DAO;
        public DeleteAllAsyncTask(offersDAO o){
            offers_DAO=o;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            offers_DAO.deleteAll();
            return null;
        }
    }
}
