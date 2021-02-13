package com.eclairiose.younow.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.eclairiose.younow.Adapter.AdapterAllOption;
import com.eclairiose.younow.Adapter.AdapterCurrentUser;
import com.eclairiose.younow.Adapter.AdapterDiscoverUser;
import com.eclairiose.younow.Adapter.AdapterFeaturedUsers;
import com.eclairiose.younow.Model.ModelAllOption;
import com.eclairiose.younow.Model.ModelCurrentUser;
import com.eclairiose.younow.Model.ModelDiscoverUser;
import com.eclairiose.younow.Model.ModelFeaturedUsers;
import com.eclairiose.younow.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.eclairiose.younow.MainActivity.drawerLayout;

public class HomeFragment extends Fragment {

   private CircleImageView myprofile;

    private HomeViewModel homeViewModel;
    ImageView imgggg ;
    TextView viddli;

    RecyclerView recyclerView, recyclerViewfeaturedUser, recyclerViewDiscoverUser, recyclerViewAllOption;
    List<ModelCurrentUser> chatitem;
    List<ModelFeaturedUsers> listFeaturedUser;
    List<ModelDiscoverUser> listDiscoverUser;
    List<ModelAllOption> listAllOptions;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        myprofile = root.findViewById(R.id.hom_myprofile);

       // imgggg = root.findViewById(R.id.imgg);
        viddli = root.findViewById(R.id.viddli);

        recyclerView = root.findViewById(R.id.recyclerView);

        recyclerViewfeaturedUser = root.findViewById(R.id.recyclerViewfeaturedUser);
        recyclerViewDiscoverUser = root.findViewById(R.id.recyclerViewDiscoverUser);
        recyclerViewAllOption = root.findViewById(R.id.recyclerViewAllOption);

        recyclerView.setAdapter(new AdapterCurrentUser(initData(), this));
        recyclerViewfeaturedUser.setAdapter(new AdapterFeaturedUsers(featureUser(), this));
        recyclerViewDiscoverUser.setAdapter(new AdapterDiscoverUser(discoverUser(), this));
        recyclerViewAllOption.setAdapter(new AdapterAllOption(allOptions(), this));


        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);

                }
            }
        });

        return root;
    }
    private List<ModelCurrentUser> initData() {

        chatitem = new ArrayList<>();
        chatitem.add(new ModelCurrentUser(R.drawable.u1, "Ali"));
        chatitem.add(new ModelCurrentUser(R.drawable.u2, "Haider"));
        chatitem.add(new ModelCurrentUser(R.drawable.u3, "Aamir"));
        chatitem.add(new ModelCurrentUser(R.drawable.u4, "Muneeb"));
        chatitem.add(new ModelCurrentUser(R.drawable.u5, "Hasher"));
        chatitem.add(new ModelCurrentUser(R.drawable.u6, "Muhammad"));
        chatitem.add(new ModelCurrentUser(R.drawable.u7, "Sami"));
        chatitem.add(new ModelCurrentUser(R.drawable.u8, "Shoaib"));
        chatitem.add(new ModelCurrentUser(R.drawable.u9, "Zakir"));
        chatitem.add(new ModelCurrentUser(R.drawable.u10, "Ahmad"));
        return chatitem;
    }

    private List<ModelFeaturedUsers> featureUser() {

        listFeaturedUser = new ArrayList<>();
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u1));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u2));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u3));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u4));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u5));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u6));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u7));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u8));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u9));
        listFeaturedUser.add(new ModelFeaturedUsers(R.drawable.u9));
        return listFeaturedUser;
    }

    private List<ModelDiscoverUser> discoverUser() {

        listDiscoverUser = new ArrayList<>();
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u1));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u2));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u3));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u4));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u5));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u6));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u7));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u8));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u9));
        listDiscoverUser.add(new ModelDiscoverUser(R.drawable.u9));
        return listDiscoverUser;
    }

    private List<ModelAllOption> allOptions() {
        listAllOptions = new ArrayList<>();
        listAllOptions.add(new ModelAllOption("Latest"));
        listAllOptions.add(new ModelAllOption("Popular"));
        listAllOptions.add(new ModelAllOption("Accessories"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Clothes"));
        listAllOptions.add(new ModelAllOption("Products"));
        listAllOptions.add(new ModelAllOption("Others"));
        listAllOptions.add(new ModelAllOption("Others"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Games"));
        listAllOptions.add(new ModelAllOption("Games"));
        return listAllOptions;
    }



}