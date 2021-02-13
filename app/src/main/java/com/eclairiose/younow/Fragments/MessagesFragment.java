package com.eclairiose.younow.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eclairiose.younow.Adapter.AdapterFriendFragment;
import com.eclairiose.younow.Adapter.AdapterMessageFragment;
import com.eclairiose.younow.Model.ModelFriendFregment;
import com.eclairiose.younow.Model.ModelMessagesFragment;
import com.eclairiose.younow.R;

import java.util.ArrayList;
import java.util.List;


public class MessagesFragment extends Fragment {


 private RecyclerView recyclerView;

  private   List<ModelMessagesFragment> chatitem;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_messages, container, false);

        recyclerView = view.findViewById(R.id.recycle_masseges);
        recyclerView.setAdapter(new AdapterMessageFragment(chatData(), this));

        return  view;
    }

    public List<ModelMessagesFragment> chatData() {

        chatitem = new ArrayList<>();
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));
        chatitem.add(new ModelMessagesFragment(R.drawable.u1, "Ali","22:10 Am","hello bro"));

        return chatitem;
}}