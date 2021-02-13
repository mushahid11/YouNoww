package com.eclairiose.younow;

import android.os.Bundle;

import com.eclairiose.younow.Adapter.AdapterCurrentUser;
import com.eclairiose.younow.Adapter.AdapterSearchProduct;
import com.eclairiose.younow.Model.ModelCurrentUser;
import com.eclairiose.younow.Model.ModelSearchProduct;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SearchScreen extends AppCompatActivity {


    private RecyclerView recyclerView;
    List<ModelSearchProduct> chatitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        recyclerView = findViewById(R.id.recycle_search);

        recyclerView.setAdapter(new AdapterSearchProduct(productSearch(), this));
    }

    private List<ModelSearchProduct> productSearch() {

        chatitem = new ArrayList<>();
        chatitem.add(new ModelSearchProduct(R.drawable.wahtch1,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch2,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch3,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch4,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch3,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch2,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.wahtch1,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));
        chatitem.add(new ModelSearchProduct(R.drawable.watch4,R.drawable.ic_baseline_search_24,"Product Name","Seller Name","$50:00"));

        return chatitem;
    }

}