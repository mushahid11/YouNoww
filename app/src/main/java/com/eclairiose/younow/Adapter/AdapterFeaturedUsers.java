package com.eclairiose.younow.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Model.ModelFeaturedUsers;
import com.eclairiose.younow.R;
import com.eclairiose.younow.ui.home.HomeFragment;

import java.util.List;


public class AdapterFeaturedUsers extends RecyclerView.Adapter<AdapterFeaturedUsers.ViewHolder> {

    List<ModelFeaturedUsers> featuredUserList;
    private HomeFragment context;



    public AdapterFeaturedUsers(List<ModelFeaturedUsers> featuredUserList, HomeFragment context) {
        this.featuredUserList = featuredUserList;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_featuredusers,parent,false);

ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userImage.setImageResource(featuredUserList.get(position).getFeaturedUserImage());
    }


    @Override
    public int getItemCount() {
        return featuredUserList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.featuredUser);


        }
    }
}
