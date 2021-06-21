package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.paymentDB;
import com.example.cashier_app.dao.paymentDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class paymentDBRepository {
    private paymentDAO payment_DAO;
    private LiveData<List<paymentDB>> getAllPayment;

    public paymentDBRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        payment_DAO=db.paymentDAO();
        getAllPayment=payment_DAO.getAllPayment();
    }
    //Insert
    public void insert(paymentDB payment){
        new paymentDBRepository.InsertAsyncTask(payment_DAO).execute(payment);
    }

    //Delete
    public void delete(paymentDB payment){
        new paymentDBRepository.DeleteAsyncTask(payment_DAO).execute(payment);
    }

    //Update
    public void update(paymentDB payment){
        new paymentDBRepository.UpdateAsyncTask(payment_DAO).execute(payment);
    }

    //GetAll

    public LiveData<List<paymentDB>> getAllPayment(paymentDB payment){
        return getAllPayment;
    }

    //DeleteAll
    public void deleteAll(){
        new paymentDBRepository.DeleteAllAsyncTask(payment_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<paymentDB,Void,Void> {
        private paymentDAO payment_DAO;
        public InsertAsyncTask(paymentDAO payment){
            payment_DAO=payment;
        }
        @Override
        protected Void doInBackground(paymentDB... payment) {
            payment_DAO.insert(payment[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<paymentDB,Void,Void> {
        private paymentDAO payment_DAO;
        public DeleteAsyncTask(paymentDAO payment){
            payment_DAO=payment;
        }
        @Override
        protected Void doInBackground(paymentDB... payment) {
            payment_DAO.delete(payment[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<paymentDB,Void,Void> {
        private paymentDAO payment_DAO;
        public UpdateAsyncTask(paymentDAO payment){
            payment_DAO=payment;
        }
        @Override
        protected Void doInBackground(paymentDB... payment) {
            payment_DAO.update(payment[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private paymentDAO payment_DAO;
        public DeleteAllAsyncTask(paymentDAO payment){
            payment_DAO=payment;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            payment_DAO.deleteAll();
            return null;
        }
    }

}
