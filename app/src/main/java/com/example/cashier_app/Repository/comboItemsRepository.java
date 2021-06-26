package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.comboItems;
import com.example.cashier_app.Dao.comboItemsDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class comboItemsRepository {
    private comboItemsDAO comboItems_DAO;
    private LiveData<List<comboItems>> getAllCombo;

    public comboItemsRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        comboItems_DAO=db.comboItemsDAO();
        getAllCombo=comboItems_DAO.getAllCombo();
    }

    //Insert
    public void insert(comboItems combo){
        new comboItemsRepository.InsertAsyncTask(comboItems_DAO).execute(combo);
    }

    //Delete
    public void delete(comboItems combo){
        new comboItemsRepository.DeleteAsyncTask(comboItems_DAO).execute(combo);
    }

    //Update
    public void update(comboItems combo){
        new comboItemsRepository.UpdateAsyncTask(comboItems_DAO).execute(combo);
    }

    //GetAll

    public LiveData<List<comboItems>> getAllCombo(){
        return getAllCombo;
    }

    //DeleteAll
    public void deleteAll(){
        new comboItemsRepository.DeleteAllAsyncTask(comboItems_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<comboItems,Void,Void> {
        private comboItemsDAO comboItems_DAO;
        public InsertAsyncTask(comboItemsDAO combo){
            comboItems_DAO=combo;
        }
        @Override
        protected Void doInBackground(comboItems... combo) {
            comboItems_DAO.insert(combo[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<comboItems,Void,Void> {
        private comboItemsDAO comboItems_DAO;
        public DeleteAsyncTask(comboItemsDAO combo){
            comboItems_DAO=combo;
        }
        @Override
        protected Void doInBackground(comboItems... combo) {
            comboItems_DAO.delete(combo[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<comboItems,Void,Void> {
        private comboItemsDAO comboItems_DAO;
        public UpdateAsyncTask(comboItemsDAO combo){
            comboItems_DAO=combo;
        }
        @Override
        protected Void doInBackground(comboItems... combo) {
            comboItems_DAO.update(combo[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private comboItemsDAO comboItems_DAO;
        public DeleteAllAsyncTask(comboItemsDAO combo){
            comboItems_DAO=combo;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            comboItems_DAO.deleteAll();
            return null;
        }
    }
}
