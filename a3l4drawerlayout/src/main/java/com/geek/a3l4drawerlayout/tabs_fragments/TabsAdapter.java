package com.geek.a3l4drawerlayout.tabs_fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class TabsAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> listFragments;
    ArrayList<String> listTitleTabs;

    public TabsAdapter(@NonNull FragmentManager fm) {
        super(fm);
        listFragments=new ArrayList<>(3);
        listTitleTabs=new ArrayList<>(3);
    }

    public  void addFragment(Fragment fragment, String title){
        listFragments.add(fragment);
        listTitleTabs.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitleTabs.get(position);
    }
}
