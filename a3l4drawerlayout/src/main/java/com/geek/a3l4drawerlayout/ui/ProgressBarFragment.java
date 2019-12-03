package com.geek.a3l4drawerlayout.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.geek.a3l4drawerlayout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressBarFragment extends Fragment {
    private Button show,hide;
    private ProgressBar mProgressBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_progress_bar, container, false);
        initViews(view);
        setOnClickListenerShowButton();
        setOnClickListenerHideButton();
        return view;

    }
    private void initViews(View view){
        show=view.findViewById(R.id.show);
        hide=view.findViewById(R.id.hide);
        mProgressBar=view.findViewById(R.id.progressBar);
    }

    private void setOnClickListenerShowButton(){
        show.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mProgressBar.setVisibility(View.VISIBLE);
            }
        });
    }
    private void setOnClickListenerHideButton(){
        hide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mProgressBar.setVisibility(View.INVISIBLE);
            }
        });
    }

}
