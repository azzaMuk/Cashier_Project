package com.example.cashier_app.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.cashier_app.DB_entities.menu;
import com.example.cashier_app.Dao.menuDAO;
import com.example.cashier_app.Dao.roomDB;

import java.util.List;

public class menuRepository {

    private menuDAO menu_DAO;
    private LiveData<List<menu>> getAllItems;

    public menuRepository(Application App) {
        roomDB db = roomDB.getInstance(App);
        menu_DAO = db.menuDAO();
        getAllItems = menu_DAO.getAllMenu();
    }

    //Insert
    public void insert(menu m) {
        new menuRepository.InsertAsyncTask(menu_DAO).execute(m);
    }

    //Delete
    public void delete(menu m) {
        new menuRepository.DeleteAsyncTask(menu_DAO).execute(m);
    }

    //Update
    public void update(menu m) {
        new menuRepository.UpdateAsyncTask(menu_DAO).execute(m);
    }

    //GetAll

    public LiveData<List<menu>> getAllItems() {
        return getAllItems;
    }

    //DeleteAll
    public void deleteAll() {
        new menuRepository.InsertAsyncTask(menu_DAO).execute();
    }

    private static class InsertAsyncTask extends AsyncTask<menu, Void, Void> {
        private menuDAO menu_DAO;

        public InsertAsyncTask(menuDAO m) {
            menu_DAO = m;
        }

        @Override
        protected Void doInBackground(menu... m) {
            menu_DAO.insert(m[0]);
            return null;
        }

    }

    private static class DeleteAsyncTask extends AsyncTask<menu, Void, Void> {
        private menuDAO menu_DAO;

        public DeleteAsyncTask(menuDAO m) {
            menu_DAO = m;
        }

        @Override
        protected Void doInBackground(menu... m) {
            menu_DAO.delete(m[0]);
            return null;
        }

    }
    private static class UpdateAsyncTask extends AsyncTask<menu, Void, Void> {
        private menuDAO menu_DAO;

        public UpdateAsyncTask(menuDAO m) {
            menu_DAO = m;
        }

        @Override
        protected Void doInBackground(menu... m) {
            menu_DAO.update(m[0]);
            return null;
        }

    }
    private static class DeleteAllAsyncTask extends AsyncTask<Void, Void, Void> {
        private menuDAO menu_DAO;
        public DeleteAllAsyncTask(menuDAO m) {
            menu_DAO = m;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            menu_DAO.deleteAll();
            return null;
        }
    }
}