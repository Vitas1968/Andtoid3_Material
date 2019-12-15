package com.geek.a3l4drawerlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.geek.a3l4drawerlayout.tabs_fragments.AgeFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.DescriptFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.ImgFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.TabsAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        Bundle bundle=getIntent().getBundleExtra("args");
/*
        String tmpStr = bundle.getString("descriptArgs");
        int tmpImg = bundle.getInt("imgArgs");
        int tmpAge = bundle.getInt("ageArgs");
 */

        ImgFragment imgFrag=ImgFragment.newInstance(bundle);
        DescriptFragment descrFrag=DescriptFragment.newInstance(bundle);
        AgeFragment ageFrag=AgeFragment.newInstance(bundle);
        ViewPager viewPager = findViewById(R.id.view_pager);

        TabsAdapter tabsAdapter=new TabsAdapter(getSupportFragmentManager());
        tabsAdapter.addFragment(imgFrag,"Photo");
        tabsAdapter.addFragment(descrFrag,"Description");
        tabsAdapter.addFragment(ageFrag,"Age");

        viewPager.setAdapter(tabsAdapter);
        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }


}
