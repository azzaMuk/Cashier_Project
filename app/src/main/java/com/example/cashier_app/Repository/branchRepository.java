package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.Dao.branchDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class branchRepository {

    private branchDAO branch_DAO;
    private LiveData<List<branch>> getAllBranches;

    public branchRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        branch_DAO=db.branchDAO();
        getAllBranches=branch_DAO.getAllBranch();
    }

    //Insert
    public void insert(branch b){
        new InsertAsyncTask(branch_DAO).execute(b);
    }

    //Delete
    public void delete(branch b){
        new DeleteAsyncTask(branch_DAO).execute(b);
    }

    //Update
    public void update(branch b){
        new UpdateAsyncTask(branch_DAO).execute(b);
    }

    //GetAll

    public LiveData<List<branch>> getAllBranch(){
       return getAllBranches;
    }

    //DeleteAll
    public void deleteAll(){
        new DeleteAllAsyncTask(branch_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<branch,Void,Void>{
        private branchDAO branch_DAO;
        public InsertAsyncTask(branchDAO b){
            branch_DAO=b;
        }
        @Override
        protected Void doInBackground(branch... branches) {
            branch_DAO.insert(branches[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<branch,Void,Void>{
        private branchDAO branch_DAO;
        public DeleteAsyncTask(branchDAO b){
            branch_DAO=b;
        }
        @Override
        protected Void doInBackground(branch... branches) {
            branch_DAO.delete(branches[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<branch,Void,Void>{
        private branchDAO branch_DAO;
        public UpdateAsyncTask(branchDAO b){
            branch_DAO=b;
        }
        @Override
        protected Void doInBackground(branch... branches) {
            branch_DAO.update(branches[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private branchDAO branch_DAO;
        public DeleteAllAsyncTask(branchDAO b){
            branch_DAO=b;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            branch_DAO.deleteAll();
            return null;
        }
    }
}
