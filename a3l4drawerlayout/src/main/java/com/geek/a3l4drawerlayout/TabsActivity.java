package com.geek.a3l4drawerlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.geek.a3l4drawerlayout.tabs_fragments.AgeFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.DescriptFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.ImgFragment;
import com.geek.a3l4drawerlayout.tabs_fragments.TabsAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabsActivity extends AppCompatActivity {
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_CURRENT_THEME_ID = "currentThemeId";
    private SharedPreferences settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settings=getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        if(settings.contains(APP_PREFERENCES_CURRENT_THEME_ID)&& (settings.getInt(APP_PREFERENCES_CURRENT_THEME_ID,-1))!=-1 ) {
            setTheme(settings.getInt(APP_PREFERENCES_CURRENT_THEME_ID,-1));
        }
        setContentView(R.layout.activity_tabs);
        Bundle bundle=getIntent().getBundleExtra("args");

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
