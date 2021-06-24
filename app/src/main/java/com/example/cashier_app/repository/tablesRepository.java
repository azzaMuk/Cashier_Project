package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.restaurantTables;
import com.example.cashier_app.dao.roomDB;
import com.example.cashier_app.dao.tablesDAO;

import java.util.List;

public class tablesRepository {
    private tablesDAO tables_DAO;
    private LiveData<List<restaurantTables>> getAllTables;

    public tablesRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        tables_DAO=db.tablesDAO();
        getAllTables=tables_DAO.getAllTables();
    }

    //Insert
    public void insert(restaurantTables t){
        new tablesRepository.InsertAsyncTask(tables_DAO).execute(t);
    }

    //Delete
    public void delete(restaurantTables t){
        new tablesRepository.DeleteAsyncTask(tables_DAO).execute(t);
    }

    //Update
    public void update(restaurantTables t){
        new tablesRepository.UpdateAsyncTask(tables_DAO).execute(t);
    }

    //GetAll

    public LiveData<List<restaurantTables>> getAllTable (){
        return getAllTables;
    }

    //DeleteAll
    public void deleteAll(){
        new tablesRepository.DeleteAllAsyncTask(tables_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<restaurantTables,Void,Void> {
        private tablesDAO tables_DAO;
        public InsertAsyncTask(tablesDAO t){
            tables_DAO=t;
        }
        @Override
        protected Void doInBackground(restaurantTables... tables) {
            tables_DAO.insert(tables[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<restaurantTables,Void,Void> {
        private tablesDAO tables_DAO;
        public DeleteAsyncTask(tablesDAO t){
            tables_DAO=t;
        }
        @Override
        protected Void doInBackground(restaurantTables... tables) {
            tables_DAO.delete(tables[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<restaurantTables,Void,Void> {
        private tablesDAO tables_DAO;
        public UpdateAsyncTask(tablesDAO t){
            tables_DAO=t;
        }
        @Override
        protected Void doInBackground(restaurantTables... tables) {
            tables_DAO.update(tables[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private tablesDAO tables_DAO;
        public DeleteAllAsyncTask(tablesDAO t){
            tables_DAO=t;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            tables_DAO.deleteAll();
            return null;
        }
    }
}
