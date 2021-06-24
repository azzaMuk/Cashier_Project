package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.POS;
import com.example.cashier_app.dao.posDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class POSRepository {
    private posDAO pos_DAO;
    private LiveData<List<POS>> getAllPOS;

    public POSRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        pos_DAO=db.posDAO();
        getAllPOS=pos_DAO.getAllPOS();
    }
    //Insert
    public void insert(POS p){
        new POSRepository.InsertAsyncTask(pos_DAO).execute(p);
    }

    //Delete
    public void delete(POS p){
        new POSRepository.DeleteAsyncTask(pos_DAO).execute(p);
    }

    //Update
    public void update(POS p){
        new POSRepository.UpdateAsyncTask(pos_DAO).execute(p);
    }

    //GetAll

    public LiveData<List<POS>> getAllPOS(){
        return getAllPOS;
    }

    //DeleteAll
    public void deleteAll(){
        new POSRepository.DeleteAllAsyncTask(pos_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<POS,Void,Void> {
        private posDAO pos_DAO;
        public InsertAsyncTask(posDAO p){
            pos_DAO=p;
        }
        @Override
        protected Void doInBackground(POS... pos) {
            pos_DAO.insert(pos[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<POS,Void,Void> {
        private posDAO pos_DAO;
        public DeleteAsyncTask(posDAO p){
            pos_DAO=p;
        }
        @Override
        protected Void doInBackground(POS... pos) {
            pos_DAO.delete(pos[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<POS,Void,Void> {
        private posDAO pos_DAO;
        public UpdateAsyncTask(posDAO p){
            pos_DAO=p;
        }
        @Override
        protected Void doInBackground(POS... pos) {
            pos_DAO.update(pos[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private posDAO pos_DAO;
        public DeleteAllAsyncTask(posDAO p){
            pos_DAO=p;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            pos_DAO.deleteAll();
            return null;
        }
    }
}
