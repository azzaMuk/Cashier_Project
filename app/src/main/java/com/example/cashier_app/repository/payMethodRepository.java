package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.paymentMethodsDB;
import com.example.cashier_app.dao.paymentMethodsDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class payMethodRepository {
    private paymentMethodsDAO paymentMethods_DAO;
    private LiveData<List<paymentMethodsDB>> getAllMethods;

    public payMethodRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        paymentMethods_DAO=db.paymentMethodsDAO();
        getAllMethods=paymentMethods_DAO.getAllPayMethods();
    }

    //Insert
    public void insert(paymentMethodsDB method){
        new payMethodRepository.InsertAsyncTask(paymentMethods_DAO).execute(method);
    }

    //Delete
    public void delete(paymentMethodsDB method){
        new payMethodRepository.DeleteAsyncTask(paymentMethods_DAO).execute(method);
    }

    //Update
    public void update(paymentMethodsDB method){
        new payMethodRepository.UpdateAsyncTask(paymentMethods_DAO).execute(method);
    }

    //GetAll

    public LiveData<List<paymentMethodsDB>> getAllMethod(paymentMethodsDB method){
        return getAllMethods;
    }

    //DeleteAll
    public void deleteAll(){
        new payMethodRepository.DeleteAllAsyncTask(paymentMethods_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<paymentMethodsDB,Void,Void> {
        private paymentMethodsDAO paymentMethods_DAO;
        public InsertAsyncTask(paymentMethodsDAO m){
            paymentMethods_DAO=m;
        }
        @Override
        protected Void doInBackground(paymentMethodsDB... methods) {
            paymentMethods_DAO.insert(methods[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<paymentMethodsDB,Void,Void> {
        private paymentMethodsDAO paymentMethods_DAO;
        public DeleteAsyncTask(paymentMethodsDAO m){
            paymentMethods_DAO=m;
        }
        @Override
        protected Void doInBackground(paymentMethodsDB... methods) {
            paymentMethods_DAO.delete(methods[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<paymentMethodsDB,Void,Void> {
        private paymentMethodsDAO paymentMethods_DAO;
        public UpdateAsyncTask(paymentMethodsDAO m){
            paymentMethods_DAO=m;
        }
        @Override
        protected Void doInBackground(paymentMethodsDB... methods) {
            paymentMethods_DAO.update(methods[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private paymentMethodsDAO paymentMethods_DAO;
        public DeleteAllAsyncTask(paymentMethodsDAO m){
            paymentMethods_DAO=m;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            paymentMethods_DAO.deleteAll();
            return null;
        }
    }
}
