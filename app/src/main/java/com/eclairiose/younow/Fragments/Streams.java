package com.eclairiose.younow.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Adapter.AdapterStream;
import com.eclairiose.younow.Model.ModelStream;
import com.eclairiose.younow.R;

import java.util.ArrayList;


public class Streams extends Fragment {
    RecyclerView recyclerView_S;
    AdapterStream adapterStream;
    ArrayList<ModelStream> streamList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_streams, container, false);

        recyclerView_S = (RecyclerView) v.findViewById(R.id.recyclerView_S);
          ModelStream modelStream = new ModelStream();
        for(int i = 0;i<10;i++) {
            streamList.add(new ModelStream(R.drawable.u1));
            streamList.add(new ModelStream(R.drawable.imran));
            streamList.add(new ModelStream(R.drawable.alice));
            streamList.add(new ModelStream(R.drawable.aliseena));

            streamList.add(modelStream);
        }
        adapterStream = new AdapterStream(streamList, getContext());
        recyclerView_S.setAdapter(adapterStream);
        return v;
    }
}