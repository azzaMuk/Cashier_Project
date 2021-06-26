package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.centerOfSale;
import com.example.cashier_app.Dao.centerOfSaleDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class COSRepository {
    private centerOfSaleDAO centerOfSale_DAO;
    private LiveData<List<centerOfSale>> getAllCOS;

    public COSRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        centerOfSale_DAO=db.centerOfSaleDAO();
        getAllCOS=centerOfSale_DAO.getAllCOF();
    }
    //Insert
    public void insert(centerOfSale cos){
        new COSRepository.InsertAsyncTask(centerOfSale_DAO).execute(cos);
    }

    //Delete
    public void delete(centerOfSale cos){
        new COSRepository.DeleteAsyncTask(centerOfSale_DAO).execute(cos);
    }

    //Update
    public void update(centerOfSale cos){
        new COSRepository.UpdateAsyncTask(centerOfSale_DAO).execute(cos);
    }

    //GetAll

    public LiveData<List<centerOfSale>> getAllCOS(){
        return getAllCOS;
    }

    //DeleteAll
    public void deleteAll(){
        new COSRepository.DeleteAllAsyncTask(centerOfSale_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<centerOfSale,Void,Void> {
        private centerOfSaleDAO centerOfSale_DAO;
        public InsertAsyncTask(centerOfSaleDAO cos){
            centerOfSale_DAO=cos;
        }
        @Override
        protected Void doInBackground(centerOfSale... cos) {
            centerOfSale_DAO.insert(cos[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<centerOfSale,Void,Void> {
        private centerOfSaleDAO centerOfSale_DAO;
        public DeleteAsyncTask(centerOfSaleDAO cos){
            centerOfSale_DAO=cos;
        }
        @Override
        protected Void doInBackground(centerOfSale... cos) {
            centerOfSale_DAO.delete(cos[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<centerOfSale,Void,Void> {
        private centerOfSaleDAO centerOfSale_DAO;
        public UpdateAsyncTask(centerOfSaleDAO cos){
            centerOfSale_DAO=cos;
        }
        @Override
        protected Void doInBackground(centerOfSale... cos) {
            centerOfSale_DAO.update(cos[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private centerOfSaleDAO centerOfSale_DAO;
        public DeleteAllAsyncTask(centerOfSaleDAO cos){
            centerOfSale_DAO=cos;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            centerOfSale_DAO.deleteAll();
            return null;
        }
    }


}
