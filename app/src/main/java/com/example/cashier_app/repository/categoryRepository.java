package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.category;
import com.example.cashier_app.dao.branchDAO;
import com.example.cashier_app.dao.categoryDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class categoryRepository {

    private categoryDAO category_DAO;
    private LiveData<List<category>> getAllCategory;

    public categoryRepository(Application App){
        roomDB db = roomDB.getInstance(App);
        category_DAO=db.categoryDAO();
        getAllCategory=category_DAO.getAllCategory();
    }

    //Insert
    public void insert(category c){
        new categoryRepository.InsertAsyncTask(category_DAO).execute(c);
    }

    //Delete
    public void delete(category c){
        new categoryRepository.DeleteAsyncTask(category_DAO).execute(c);
    }

    //Update
    public void update(category c){
        new categoryRepository.UpdateAsyncTask(category_DAO).execute(c);
    }

    //GetAll

    public LiveData<List<category>> getAllCategories (){
        return getAllCategory;
    }

    //DeleteAll
    public void deleteAll(){
        new categoryRepository.DeleteAllAsyncTask(category_DAO).execute();
    }


    private static class InsertAsyncTask extends AsyncTask<category,Void,Void>{
        private categoryDAO category_DAO;
        public InsertAsyncTask(categoryDAO c){
            category_DAO=c;
        }
        @Override
        protected Void doInBackground(category... categories) {
            category_DAO.insert(categories[0]);
            return null;
        }
    }
    private static class DeleteAsyncTask extends AsyncTask<category,Void,Void>{
        private categoryDAO category_DAO;
        public DeleteAsyncTask(categoryDAO c){
            category_DAO=c;
        }
        @Override
        protected Void doInBackground(category... categories) {
            category_DAO.delete(categories[0]);
            return null;
        }
    }
    private static class UpdateAsyncTask extends AsyncTask<category,Void,Void>{
        private categoryDAO category_DAO;
        public UpdateAsyncTask(categoryDAO c){
            category_DAO=c;
        }
        @Override
        protected Void doInBackground(category... categories) {
            category_DAO.update(categories[0]);
            return null;
        }
    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void,Void,Void>{
        private categoryDAO category_DAO;
        public DeleteAllAsyncTask(categoryDAO c){
            category_DAO=c;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            category_DAO.deleteAll();
            return null;
        }
    }


}
