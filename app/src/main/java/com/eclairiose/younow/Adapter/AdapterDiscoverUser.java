package com.eclairiose.younow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Model.ModelDiscoverUser;
import com.eclairiose.younow.R;
import com.eclairiose.younow.ui.home.HomeFragment;

import java.util.List;


public class AdapterDiscoverUser extends RecyclerView.Adapter<AdapterDiscoverUser.ViewHolder> {

    List<ModelDiscoverUser> discoverUserList;
    private HomeFragment context;


    public AdapterDiscoverUser(List<ModelDiscoverUser> discoverUserList, HomeFragment context) {
        this.discoverUserList = discoverUserList;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_discoveruser,parent,false);

       ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageDiscoverUser.setImageResource(discoverUserList.get(position).getDiscoverUser());
    }


    @Override
    public int getItemCount() {
        return discoverUserList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageDiscoverUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageDiscoverUser = itemView.findViewById(R.id.discoverUser);


        }
    }
}
