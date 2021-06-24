package com.example.cashier_app.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.branch;
import com.example.cashier_app.DB_entities.role;
import com.example.cashier_app.dao.branchDAO;
import com.example.cashier_app.dao.roleDAO;
import com.example.cashier_app.dao.roomDB;

import java.util.List;

public class roleRepository {
    private roleDAO role_DAO;
    private LiveData<List<role>> getAllRoles;

    public roleRepository(Application App) {
        roomDB db = roomDB.getInstance(App);
        role_DAO = db.role_DAO();
        getAllRoles = role_DAO.getAllRole();
    }

    //Insert
    public void insert(role r) {
        new roleRepository.InsertAsyncTask(role_DAO).execute(r);
    }

    //Delete
    public void delete(role r) {
        new roleRepository.DeleteAsyncTask(role_DAO).execute(r);
    }

    //Update
    public void update(role r) {
        new roleRepository.UpdateAsyncTask(role_DAO).execute(r);
    }

    //GetAll

    public LiveData<List<role>> getAllRole() {
        return getAllRoles;
    }

    //DeleteAll
    public void deleteAll() {
        new roleRepository.DeleteAllAsyncTask(role_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<role, Void, Void> {
        private roleDAO role_DAO;

        public InsertAsyncTask(roleDAO r) {
            role_DAO = r;
        }

        @Override
        protected Void doInBackground(role... r) {
            role_DAO.insert(r[0]);
            return null;
        }
    }

    private static class DeleteAsyncTask extends AsyncTask<role, Void, Void> {
        private roleDAO role_DAO;

        public DeleteAsyncTask(roleDAO r) {
            role_DAO = r;
        }

        @Override
        protected Void doInBackground(role... r) {
            role_DAO.delete(r[0]);
            return null;
        }
    }

    private static class UpdateAsyncTask extends AsyncTask<role, Void, Void> {
        private roleDAO role_DAO;

        public UpdateAsyncTask(roleDAO r) {
            role_DAO = r;
        }

        @Override
        protected Void doInBackground(role... r) {
            role_DAO.update(r[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void, Void, Void> {
        private roleDAO role_DAO;

        public DeleteAllAsyncTask(roleDAO r) {
            role_DAO = r;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            role_DAO.deleteAll();
            return null;
        }
    }
}
