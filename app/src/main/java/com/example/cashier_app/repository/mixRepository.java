package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.mix_menu_options;
import com.example.cashier_app.dao.branchDAO;
import com.example.cashier_app.dao.mix_menu_optionsDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class mixRepository {
    private mix_menu_optionsDAO mixDAO;
    private LiveData<List<mix_menu_options>> getAllMIX;

    public mixRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        mixDAO=db.mix_menu_optionsDAO();
        getAllMIX=mixDAO.getAllMenuOtp();
    }

    //Insert
    public void insert(mix_menu_options mix){
        new mixRepository.InsertAsyncTask(mixDAO).execute(mix);
    }

    //Delete
    public void delete(mix_menu_options mix){
        new mixRepository.DeleteAsyncTask(mixDAO).execute(mix);
    }

    //Update
    public void update(mix_menu_options mix){
        new mixRepository.UpdateAsyncTask(mixDAO).execute(mix);
    }

    //GetAll

    public LiveData<List<mix_menu_options>> getAllMIX(mix_menu_options mix){
        return getAllMIX;
    }

    //DeleteAll
    public void deleteAll(){
        new mixRepository.DeleteAllAsyncTask(mixDAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<mix_menu_options,Void,Void> {
        private mix_menu_optionsDAO mixDAO;
        public InsertAsyncTask(mix_menu_optionsDAO m){
            mixDAO=m;
        }
        @Override
        protected Void doInBackground(mix_menu_options... mix) {
            mixDAO.insert(mix[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<mix_menu_options,Void,Void> {
        private mix_menu_optionsDAO mixDAO;
        public DeleteAsyncTask(mix_menu_optionsDAO m){
            mixDAO=m;
        }
        @Override
        protected Void doInBackground(mix_menu_options... mix) {
            mixDAO.delete(mix[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<mix_menu_options,Void,Void> {
        private mix_menu_optionsDAO mixDAO;
        public UpdateAsyncTask(mix_menu_optionsDAO m){
            mixDAO=m;
        }
        @Override
        protected Void doInBackground(mix_menu_options... mix) {
            mixDAO.update(mix[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private mix_menu_optionsDAO mixDAO;
        public DeleteAllAsyncTask(mix_menu_optionsDAO m){
            mixDAO=m;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            mixDAO.deleteAll();
            return null;
        }
    }
}
