package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;


import com.example.cashier_app.DB_entities.salesPerson;
import com.example.cashier_app.dao.roomDB;
import com.example.cashier_app.dao.salesPersonDAO;

import java.util.List;

public class spRepository {
    private salesPersonDAO salesPerson_DAO;
    private LiveData<List<salesPerson>> getAllPerson;

    public spRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        salesPerson_DAO=db.salesPersonDAO();
        getAllPerson=salesPerson_DAO.getAllEmp();
    }

    //Insert
    public void insert(salesPerson s){
        new spRepository.InsertAsyncTask(salesPerson_DAO).execute(s);
    }

    //Delete
    public void delete(salesPerson s){
        new spRepository.DeleteAsyncTask(salesPerson_DAO).execute(s);
    }

    //Update
    public void update(salesPerson s){
        new spRepository.UpdateAsyncTask(salesPerson_DAO).execute(s);
    }

    //GetAll

    public LiveData<List<salesPerson>> getAllPersons(){
        return getAllPerson;
    }

    //DeleteAll
    public void deleteAll(){
        new spRepository.DeleteAllAsyncTask(salesPerson_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<salesPerson,Void,Void> {
        private salesPersonDAO salesPerson_DAO;
        public InsertAsyncTask(salesPersonDAO s){
            salesPerson_DAO=s;
        }
        @Override
        protected Void doInBackground(salesPerson... s) {
            salesPerson_DAO.insert(s[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<salesPerson,Void,Void> {
        private salesPersonDAO salesPerson_DAO;
        public DeleteAsyncTask(salesPersonDAO s){
            salesPerson_DAO=s;
        }
        @Override
        protected Void doInBackground(salesPerson... s) {
            salesPerson_DAO.delete(s[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<salesPerson,Void,Void> {
        private salesPersonDAO salesPerson_DAO;
        public UpdateAsyncTask(salesPersonDAO s){ salesPerson_DAO=s; }
        @Override
        protected Void doInBackground(salesPerson... s) {
            salesPerson_DAO.update(s[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private salesPersonDAO salesPerson_DAO;
        public DeleteAllAsyncTask(salesPersonDAO s){ salesPerson_DAO=s; }

        @Override
        protected Void doInBackground(Void... voids) {
            salesPerson_DAO.deleteAll();
            return null;
        }
    }
}
