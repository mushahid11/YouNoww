package com.eclairiose.younow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.eclairiose.younow.Model.ModelAllOption;
import com.eclairiose.younow.R;
import com.eclairiose.younow.ui.home.HomeFragment;

import java.util.List;

public class AdapterAllOption extends RecyclerView.Adapter<AdapterAllOption.ViewHolder> {

    List<ModelAllOption> chatItem;
    HomeFragment context;



    public AdapterAllOption(List<ModelAllOption> chatItem, HomeFragment context) {
        this.chatItem = chatItem;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_alloptions,parent,false);

     ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.options.setText(chatItem.get(position).getOptions());
    }


    @Override
    public int getItemCount() {
        return chatItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView options;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            options = itemView.findViewById(R.id.options);

        }
    }
}

