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

public class OptionAdaptor extends RecyclerView.Adapter<OptionAdaptor.ViewHolder> {

    List<String> Options;
    LayoutInflater inflater;


    public OptionAdaptor(Context context, List<String> options) {
        Options = options;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.option_card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.option.setText(Options.get(position));
    }

    @Override
    public int getItemCount() {
        return Options.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView option;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            option = itemView.findViewById(R.id.optionbtn);

        }
    }
}
