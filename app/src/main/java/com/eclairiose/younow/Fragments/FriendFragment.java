package com.eclairiose.younow.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eclairiose.younow.Adapter.AdapterFriendFragment;
import com.eclairiose.younow.Model.ModelFriendFregment;
import com.eclairiose.younow.R;

import java.util.ArrayList;
import java.util.List;


public class FriendFragment extends Fragment {

    RecyclerView recyclerView;
    List<ModelFriendFregment> Friendchatitem;

    public FriendFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friend, container, false);


        recyclerView = view.findViewById(R.id.recycle_friend);



        recyclerView.setAdapter(new AdapterFriendFragment(friendData(), this));





        return view;
    }
    public List<ModelFriendFregment> friendData() {

        Friendchatitem = new ArrayList<>();
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        Friendchatitem.add(new ModelFriendFregment(R.drawable.u1, "Ali","22:10 Am","hello bro"));

        return Friendchatitem;
    }




}