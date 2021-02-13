package com.eclairiose.younow.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eclairiose.younow.Adapter.ViewPagerAdapterSPR;
import com.eclairiose.younow.AddProducts;
import com.eclairiose.younow.R;
import com.eclairiose.younow.SearchScreen;
import com.google.android.material.tabs.TabLayout;

public class MyProfile extends Fragment {

  private   TabLayout tab_StreamsProductReview;
 private    ViewPager pager_streamsProductReview;
   private TextView profile_name;
   private ImageView add_ToCart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_my_profile, container, false);

        profile_name = view.findViewById(R.id.profile_name);
        add_ToCart = view.findViewById(R.id.add_ToCart);
        tab_StreamsProductReview = view.findViewById(R.id.tab_StreamsProductReview);
        pager_streamsProductReview = view.findViewById(R.id.pager_streamsProductReview);


        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Streams"));
        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Products"));
        tab_StreamsProductReview.addTab(tab_StreamsProductReview.newTab().setText("Reviews"));
        tab_StreamsProductReview.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPagerAdapterSPR adapter = new ViewPagerAdapterSPR(getChildFragmentManager(),this,tab_StreamsProductReview.getTabCount());
        pager_streamsProductReview.setAdapter(adapter);

        profile_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SearchScreen.class);
                startActivity(i);
            }
        });
        add_ToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddProducts.class);
                startActivity(i);
            }
        });

      return view;
    }
}