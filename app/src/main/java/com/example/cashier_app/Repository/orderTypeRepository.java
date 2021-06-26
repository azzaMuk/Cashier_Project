package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.orderType;
import com.example.cashier_app.Dao.orderTypeDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class orderTypeRepository {
    private orderTypeDAO orderType_DAO;
    private LiveData<List<orderType>> getAllTypes;

    public orderTypeRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        orderType_DAO=db.orderTypeDAO();
        getAllTypes=orderType_DAO.getAllOrderType();
    }
    //Insert
    public void insert(orderType ot){
        new orderTypeRepository.InsertAsyncTask(orderType_DAO).execute(ot);
    }

    //Delete
    public void delete(orderType ot){
        new orderTypeRepository.DeleteAsyncTask(orderType_DAO).execute(ot);
    }

    //Update
    public void update(orderType ot){
        new orderTypeRepository.UpdateAsyncTask(orderType_DAO).execute(ot);
    }

    //GetAll

    public LiveData<List<orderType>> getAllTypes(){
        return getAllTypes;
    }

    //DeleteAll
    public void deleteAll(){
        new orderTypeRepository.DeleteAllAsyncTask(orderType_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<orderType,Void,Void> {
        private orderTypeDAO orderType_DAO;
        public InsertAsyncTask(orderTypeDAO ot){
            orderType_DAO=ot;
        }
        @Override
        protected Void doInBackground(orderType... op) {
            orderType_DAO.insert(op[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<orderType,Void,Void> {
        private orderTypeDAO orderType_DAO;
        public DeleteAsyncTask(orderTypeDAO ot){
            orderType_DAO=ot;
        }
        @Override
        protected Void doInBackground(orderType... op) {
            orderType_DAO.delete(op[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<orderType,Void,Void> {
        private orderTypeDAO orderType_DAO;
        public UpdateAsyncTask(orderTypeDAO ot){
            orderType_DAO=ot;
        }
        @Override
        protected Void doInBackground(orderType... op) {
            orderType_DAO.update(op[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private orderTypeDAO orderType_DAO;
        public DeleteAllAsyncTask(orderTypeDAO ot){
            orderType_DAO=ot;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            orderType_DAO.deleteAll();
            return null;
        }
    }

}
