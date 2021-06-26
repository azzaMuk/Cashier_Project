package com.example.cashier_app.Repository;


import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.itemOptions;
import com.example.cashier_app.Dao.itemOptionDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class itemOptionsRepository {

    private itemOptionDAO itemOption_DAO;
    private LiveData<List<itemOptions>> getAllOtp;

    public itemOptionsRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        itemOption_DAO=db.itemOptionDAO();
        getAllOtp=itemOption_DAO.getAllOpt();
    }

    //Insert
    public void insert(itemOptions otp){
        new itemOptionsRepository.InsertAsyncTask(itemOption_DAO).execute(otp);
    }

    //Delete
    public void delete(itemOptions otp){
        new itemOptionsRepository.DeleteAsyncTask(itemOption_DAO).execute(otp);
    }

    //Update
    public void update(itemOptions otp){
        new itemOptionsRepository.UpdateAsyncTask(itemOption_DAO).execute(otp);
    }

    //GetAll

    public LiveData<List<itemOptions>> getAllOTP(){
        return getAllOtp;
    }

    //DeleteAll
    public void deleteAll(){
        new itemOptionsRepository.DeleteAllAsyncTask(itemOption_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<itemOptions,Void,Void> {
        private itemOptionDAO itemOption_DAO;
        public InsertAsyncTask(itemOptionDAO otp){
            itemOption_DAO=otp;
        }
        @Override
        protected Void doInBackground(itemOptions... otp) {
            itemOption_DAO.insert(otp[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<itemOptions,Void,Void> {
        private itemOptionDAO itemOption_DAO;
        public DeleteAsyncTask(itemOptionDAO otp){
            itemOption_DAO=otp;
        }
        @Override
        protected Void doInBackground(itemOptions... otp) {
            itemOption_DAO.delete(otp[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<itemOptions,Void,Void> {
        private itemOptionDAO itemOption_DAO;
        public UpdateAsyncTask(itemOptionDAO otp){
            itemOption_DAO=otp;
        }
        @Override
        protected Void doInBackground(itemOptions... otp) {
            itemOption_DAO.update(otp[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private itemOptionDAO itemOption_DAO;
        public DeleteAllAsyncTask(itemOptionDAO otp){
            itemOption_DAO=otp;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            itemOption_DAO.deleteAll();
            return null;
        }
    }
}

