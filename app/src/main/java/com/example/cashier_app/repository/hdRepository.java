package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSHeader;
import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.dao.POSHeaderDAO;
import com.example.cashier_app.dao.branchDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class hdRepository {

    private POSHeaderDAO POSHeader_DAO;
    private LiveData<List<POSHeader>> getAllHeaders;

    public hdRepository(Application App) {
        roomDB db = roomDB.getInstance(App);
        POSHeader_DAO = db.POSHeaderDAO();
        getAllHeaders = POSHeader_DAO.getAllHeader();
    }


    //Insert
    public void insert(POSHeader h) {
        new hdRepository.InsertAsyncTask(POSHeader_DAO).execute(h);
    }

    //Delete
    public void delete(POSHeader h) {
        new hdRepository.DeleteAsyncTask(POSHeader_DAO).execute(h);
    }

    //Update
    public void update(POSHeader h) {
        new hdRepository.UpdateAsyncTask(POSHeader_DAO).execute(h);
    }

    //GetAll

    public LiveData<List<POSHeader>> getAllHeader() {
        return getAllHeaders;
    }

    //DeleteAll
    public void deleteAll() {
        new hdRepository.DeleteAllAsyncTask(POSHeader_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<POSHeader, Void, Void> {
        private POSHeaderDAO POSHeader_DAO;

        public InsertAsyncTask(POSHeaderDAO hd) {
            POSHeader_DAO = hd;
        }

        @Override
        protected Void doInBackground(POSHeader... hd) {
            POSHeader_DAO.insert(hd[0]);
            return null;
        }
    }

    private static class DeleteAsyncTask extends AsyncTask<POSHeader, Void, Void> {
        private POSHeaderDAO POSHeader_DAO;

        public DeleteAsyncTask(POSHeaderDAO hd) {
            POSHeader_DAO = hd;
        }

        @Override
        protected Void doInBackground(POSHeader... hd) {
            POSHeader_DAO.delete(hd[0]);
            return null;
        }
    }

    private static class UpdateAsyncTask extends AsyncTask<POSHeader, Void, Void> {
        private POSHeaderDAO POSHeader_DAO;

        public UpdateAsyncTask(POSHeaderDAO hd) {
            POSHeader_DAO = hd;
        }

        @Override
        protected Void doInBackground(POSHeader... hd) {
            POSHeader_DAO.update(hd[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void, Void, Void> {
        private POSHeaderDAO POSHeader_DAO;

        public DeleteAllAsyncTask(POSHeaderDAO hd) {
            POSHeader_DAO = hd;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            POSHeader_DAO.deleteAll();
            return null;
        }
    }
}
