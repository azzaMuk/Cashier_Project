package com.example.cashier_app.UI;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cashier_app.R;

import java.util.List;

public class TablesAdaptor extends RecyclerView.Adapter<TablesAdaptor.ViewHolder> {

    List<String> TablesNames;
    LayoutInflater inflater;


    public TablesAdaptor(Context context, List<String> tablesNames) {
        TablesNames = tablesNames;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tables_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tableName.setText(TablesNames.get(position));
    }

    @Override
    public int getItemCount() {
        return TablesNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tableName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tableName = itemView.findViewById(R.id.tableName);

        }
    }
}
