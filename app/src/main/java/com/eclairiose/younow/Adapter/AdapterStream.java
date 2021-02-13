package com.eclairiose.younow.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Model.ModelStream;
import com.eclairiose.younow.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterStream extends RecyclerView.Adapter<AdapterStream.ViewHolder> {

        List<ModelStream> streamList;
        Context context;



public AdapterStream(ArrayList<ModelStream> streamList, Context context) {
        this.streamList = streamList;
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
        holder.streamImage.setImageResource(streamList.get(position).getStreamImage());

        }


@Override
public int getItemCount() {
        return streamList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView streamImage;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        streamImage = itemView.findViewById(R.id.featuredUser);


    }
}
}
