package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POSdtoption;
import com.example.cashier_app.dao.POSdtoptionDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class dtOptionRepository {
    private POSdtoptionDAO POSdtoption_DAO;
    private LiveData<List<POSdtoption>> getAllDtOptions;

    public dtOptionRepository(Application App) {
        roomDB db = roomDB.getInstance(App);
        POSdtoption_DAO = db.POSdtoptionDAO();
        getAllDtOptions = POSdtoption_DAO.getAllDtOptions();
    }

    //Insert
    public void insert(POSdtoption dtOption) {
        new dtOptionRepository.InsertAsyncTask(POSdtoption_DAO).execute(dtOption);
    }

    //Delete
    public void delete(POSdtoption dtOption) {
        new dtOptionRepository.DeleteAsyncTask(POSdtoption_DAO).execute(dtOption);
    }

    //Update
    public void update(POSdtoption dtOption) {
        new dtOptionRepository.UpdateAsyncTask(POSdtoption_DAO).execute(dtOption);
    }

    //GetAll

    public LiveData<List<POSdtoption>> getAllDtOptions(POSdtoption dtOption) {
        return getAllDtOptions;
    }

    //DeleteAll
    public void deleteAll() {
        new dtOptionRepository.DeleteAllAsyncTask(POSdtoption_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<POSdtoption, Void, Void> {
        private POSdtoptionDAO POSdtoption_DAO;

        public InsertAsyncTask(POSdtoptionDAO o) {
            POSdtoption_DAO = o;
        }

        @Override
        protected Void doInBackground(POSdtoption... options) {
            POSdtoption_DAO.insert(options[0]);
            return null;
        }
    }

    private static class DeleteAsyncTask extends AsyncTask<POSdtoption, Void, Void> {
        private POSdtoptionDAO POSdtoption_DAO;

        public DeleteAsyncTask(POSdtoptionDAO o) {
            POSdtoption_DAO = o;
        }

        @Override
        protected Void doInBackground(POSdtoption... options) {
            POSdtoption_DAO.delete(options[0]);
            return null;
        }
    }

    private static class UpdateAsyncTask extends AsyncTask<POSdtoption, Void, Void> {
        private POSdtoptionDAO POSdtoption_DAO;

        public UpdateAsyncTask(POSdtoptionDAO o) {
            POSdtoption_DAO = o;
        }

        @Override
        protected Void doInBackground(POSdtoption... options) {
            POSdtoption_DAO.update(options[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void, Void, Void> {
        private POSdtoptionDAO POSdtoption_DAO;

        public DeleteAllAsyncTask(POSdtoptionDAO option) {
            POSdtoption_DAO = option;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            POSdtoption_DAO.deleteAll();
            return null;
        }
    }
}
