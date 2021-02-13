package com.eclairiose.younow.Adapter;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.eclairiose.younow.Fragments.FriendFragment;
import com.eclairiose.younow.Fragments.MessagesFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapterF extends FragmentPagerAdapter {

private List<Fragment> fragmentList = new ArrayList<>();
private List<String> titleList = new ArrayList<>();

    public ViewPagerAdapterF(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FriendFragment friendsFragment = new FriendFragment();
                return  friendsFragment;
            case 1:
                MessagesFragment messagesFragment = new MessagesFragment();
                return messagesFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {



        return titleList.get(position);
    }

    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
