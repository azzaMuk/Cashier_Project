package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.tableType;
import com.example.cashier_app.Dao.roomDB;
import com.example.cashier_app.Dao.tableTypeDAO;


import java.util.List;

public class tableTypeRepository {
    private tableTypeDAO tableType_DAO;
    private LiveData<List<tableType>> getAllTypes;

    public tableTypeRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        tableType_DAO=db.tableTypeDAO();
        getAllTypes=tableType_DAO.getAllTypes();
    }

    //Insert
    public void insert(tableType t){
        new tableTypeRepository.InsertAsyncTask(tableType_DAO).execute(t);
    }

    //Delete
    public void delete(tableType t){
        new tableTypeRepository.DeleteAsyncTask(tableType_DAO).execute(t);
    }

    //Update
    public void update(tableType t){
        new tableTypeRepository.UpdateAsyncTask(tableType_DAO).execute(t);
    }

    //GetAll

    public LiveData<List<tableType>> getAllType(){
        return getAllTypes;
    }
    //DeleteAll
    public void deleteAll(){
        new tableTypeRepository.DeleteAllAsyncTask(tableType_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<tableType,Void,Void> {
        private tableTypeDAO tableType_DAO;
        public InsertAsyncTask(tableTypeDAO t){
            tableType_DAO=t;
        }
        @Override
        protected Void doInBackground(tableType... type) {
            tableType_DAO.insert(type[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<tableType,Void,Void> {
        private tableTypeDAO tableType_DAO;
        public DeleteAsyncTask(tableTypeDAO t){
            tableType_DAO=t;
        }
        @Override
        protected Void doInBackground(tableType... type) {
            tableType_DAO.delete(type[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<tableType,Void,Void> {
        private tableTypeDAO tableType_DAO;
        public UpdateAsyncTask(tableTypeDAO t){
            tableType_DAO=t;
        }
        @Override
        protected Void doInBackground(tableType... type) {
            tableType_DAO.update(type[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private tableTypeDAO tableType_DAO;
        public DeleteAllAsyncTask(tableTypeDAO t){
            tableType_DAO=t;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            tableType_DAO.deleteAll();
            return null;
        }
    }
}
