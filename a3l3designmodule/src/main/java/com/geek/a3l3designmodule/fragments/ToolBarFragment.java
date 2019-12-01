package com.geek.a3l3designmodule.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geek.a3l3designmodule.R;


import java.util.Objects;


public class ToolBarFragment extends Fragment {
    private Toolbar mToolbar;
    private TextView loginTextView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tool_bar, container, false);
        mToolbar=view.findViewById(R.id.toolbar);
        loginTextView=view.findViewById(R.id.output_login_text_view);
        AppCompatActivity activity=(AppCompatActivity)getActivity();
        Objects.requireNonNull(activity).setSupportActionBar(mToolbar);
        Objects.requireNonNull(activity.getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        String login=getArguments().getString("myLogin");
        loginTextView.setText(login);

        return view;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                Log.d("TAGFR", "onOptionsItemSelected Fragment: ");
                Objects.requireNonNull(getActivity()).onBackPressed();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
