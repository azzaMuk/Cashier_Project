package com.example.cashier_app.repository;


import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.status;
import com.example.cashier_app.DB_entities.till;
import com.example.cashier_app.dao.roomDB;
import com.example.cashier_app.dao.statusDAO;
import com.example.cashier_app.dao.tillDAO;

import java.util.List;

public class tillRepository {
    private tillDAO till_DAO;
    private LiveData<List<till>> getAllTills;

    public tillRepository(Application App) {
        roomDB db = roomDB.getInstance(App);
        till_DAO = db.tillDAO();
        getAllTills = till_DAO.getAllTills();
    }
    //Insert
    public void insert(till t){
        new tillRepository.InsertAsyncTask(till_DAO).execute(t);
    }

    //Delete
    public void delete(till t){
        new tillRepository.DeleteAsyncTask(till_DAO).execute(t);
    }

    //Update
    public void update(till t){
        new tillRepository.UpdateAsyncTask(till_DAO).execute(t);
    }

    //GetAll

    public LiveData<List<till>> getAllTills(till t){
        return getAllTills;
    }

    //DeleteAll
    public void deleteAll(){
        new tillRepository.DeleteAllAsyncTask(till_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<till ,Void,Void> {
        private tillDAO till_DAO;
        public InsertAsyncTask(tillDAO t){
            till_DAO=t;
        }
        @Override
        protected Void doInBackground(till... t) {
            till_DAO.insert(t[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<till ,Void,Void> {
        private tillDAO till_DAO;
        public DeleteAsyncTask(tillDAO t){
            till_DAO=t;
        }
        @Override
        protected Void doInBackground(till... t) {
            till_DAO.delete(t[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<till ,Void,Void> {
        private tillDAO till_DAO;
        public UpdateAsyncTask(tillDAO t){
            till_DAO=t;
        }
        @Override
        protected Void doInBackground(till... t) {
            till_DAO.update(t[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void> {
        private tillDAO till_DAO;
        public DeleteAllAsyncTask(tillDAO t){
            till_DAO=t;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            till_DAO.deleteAll();
            return null;
        }
    }


}
