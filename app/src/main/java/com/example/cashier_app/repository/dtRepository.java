package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSdetails;
import com.example.cashier_app.dao.POSdetailsDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class dtRepository {
    private POSdetailsDAO POSdetails_DAO;
    private LiveData<List<POSdetails>> getAllDetails;

    public dtRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        POSdetails_DAO=db.POSdetailsDAO();
        getAllDetails=POSdetails_DAO.getAllPOSdetails();
    }
    //Insert
    public void insert(POSdetails dt){
        new dtRepository.InsertAsyncTask(POSdetails_DAO).execute(dt);
    }

    //Delete
    public void delete(POSdetails dt){
        new dtRepository.DeleteAsyncTask(POSdetails_DAO).execute(dt);
    }

    //Update
    public void update(POSdetails dt){
        new dtRepository.UpdateAsyncTask(POSdetails_DAO).execute(dt);
    }

    //GetAll

    public LiveData<List<POSdetails>> getAllDetail(POSdetails dt){
        return getAllDetails;
    }

    //DeleteAll
    public void deleteAll(){
        new dtRepository.DeleteAllAsyncTask(POSdetails_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<POSdetails,Void,Void> {
        private POSdetailsDAO POSdetails_DAO;
        public InsertAsyncTask(POSdetailsDAO dt){
            POSdetails_DAO=dt;
        }
        @Override
        protected Void doInBackground(POSdetails... dt) {
            POSdetails_DAO.insert(dt[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<POSdetails,Void,Void> {
        private POSdetailsDAO POSdetails_DAO;
        public DeleteAsyncTask(POSdetailsDAO dt){
            POSdetails_DAO=dt;
        }
        @Override
        protected Void doInBackground(POSdetails... dt) {
            POSdetails_DAO.delete(dt[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<POSdetails,Void,Void> {
        private POSdetailsDAO POSdetails_DAO;
        public UpdateAsyncTask(POSdetailsDAO dt){
            POSdetails_DAO=dt;
        }
        @Override
        protected Void doInBackground(POSdetails... dt) {
            POSdetails_DAO.update(dt[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private POSdetailsDAO POSdetails_DAO;
        public DeleteAllAsyncTask(POSdetailsDAO dt){
            POSdetails_DAO=dt;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            POSdetails_DAO.deleteAll();
            return null;
        }
    }
}
