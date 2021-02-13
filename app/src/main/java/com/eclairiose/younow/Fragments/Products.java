package com.eclairiose.younow.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Adapter.AdapterProduct;
import com.eclairiose.younow.Model.ModelProduct;
import com.eclairiose.younow.R;

import java.util.ArrayList;


public class Products extends Fragment {

    ModelProduct modelProduct;
    RecyclerView recyclerView_P;
    AdapterProduct adapterProduct;
    ArrayList<ModelProduct> ProductList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_products, container, false);

        recyclerView_P = (RecyclerView) v.findViewById(R.id.recyclerView_P);
         modelProduct = new ModelProduct();
        for(int i = 0;i<10;i++) {
            ProductList.add(new ModelProduct(R.drawable.watch4,"Product Name","$50.00"));
            ProductList.add(new ModelProduct(R.drawable.watch2,"Product Name","$50.00"));
            ProductList.add(new ModelProduct(R.drawable.watch3,"Product Name","$50.00"));
            ProductList.add(new ModelProduct(R.drawable.watch4,"Product Name","$50.00"));
            ProductList.add(modelProduct);
        }
        adapterProduct = new AdapterProduct(ProductList, getContext());
        recyclerView_P.setAdapter(adapterProduct);
        return v;
    }
}