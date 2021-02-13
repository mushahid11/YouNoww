package com.eclairiose.younow.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eclairiose.younow.Adapter.ViewPagerAdapterF;
import com.eclairiose.younow.R;
import com.google.android.material.tabs.TabLayout;


public class FriendFragmentH extends Fragment {

  private   TabLayout tab_friends;
    private  ViewPager pager_friends;

    public FriendFragmentH() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friendh, container, false);


        tab_friends = view.findViewById(R.id.tab_friends);
        pager_friends = view.findViewById(R.id.pager_friends);

//        tab_friends.addTab(tab_friends.newTab().setText("Friends"));
//        tab_friends.addTab(tab_friends.newTab().setText("Messages"));
//        tab_friends.setTabGravity(TabLayout.GRAVITY_FILL);
//        ViewPagerAdapterF adapter = new ViewPagerAdapterF(getChildFragmentManager(),this,tab_friends.getTabCount());
//        pager_friends.setAdapter(adapter);
//
//        pager_friends.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_friends));

        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        setUpViewPager(pager_friends);
        tab_friends.setupWithViewPager(pager_friends);
        tab_friends.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager pager_friends) {

        ViewPagerAdapterF viewPagerAdapterF = new ViewPagerAdapterF(getParentFragmentManager());
        viewPagerAdapterF.addFragment(new FriendFragment(),"Friends");
        viewPagerAdapterF.addFragment(new MessagesFragment(),"Messages");
       pager_friends.setAdapter(viewPagerAdapterF);

    }
}