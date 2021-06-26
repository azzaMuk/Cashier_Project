package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.status;
import com.example.cashier_app.Dao.roomDB;
import com.example.cashier_app.Dao.statusDAO;

import java.util.List;

public class statusRepository {
    private statusDAO status_DAO;
    private LiveData<List<status>> getAllStatus;

    public statusRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        status_DAO=db.statusDAO();
        getAllStatus=status_DAO.getAllStatus();
    }

    //Insert
    public void insert(status s){
        new statusRepository.InsertAsyncTask(status_DAO).execute(s);
    }

    //Delete
    public void delete(status s){
        new statusRepository.DeleteAsyncTask(status_DAO).execute(s);
    }

    //Update
    public void update(status s){
        new statusRepository.UpdateAsyncTask(status_DAO).execute(s);
    }

    //GetAll

    public LiveData<List<status>> getAllStatus(){
        return getAllStatus;
    }

    //DeleteAll
    public void deleteAll(){
        new statusRepository.DeleteAllAsyncTask(status_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<status,Void,Void>{
        private statusDAO status_DAO;
        public InsertAsyncTask(statusDAO s){
            status_DAO=s;
        }
        @Override
        protected Void doInBackground(status... s) {
            status_DAO.insert(s[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<status,Void,Void>{
        private statusDAO status_DAO;
        public DeleteAsyncTask(statusDAO s){
            status_DAO=s;
        }
        @Override
        protected Void doInBackground(status... s) {
            status_DAO.delete(s[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<status,Void,Void>{
        private statusDAO status_DAO;
        public UpdateAsyncTask(statusDAO s){
            status_DAO=s;
        }
        @Override
        protected Void doInBackground(status... s) {
            status_DAO.update(s[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void> {
        private statusDAO status_DAO;
        public DeleteAllAsyncTask(statusDAO s){
            status_DAO=s;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            status_DAO.deleteAll();
            return null;
        }
    }
}
