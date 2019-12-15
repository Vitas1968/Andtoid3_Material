package com.geek.a3l4drawerlayout.tabs_fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.a3l4drawerlayout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgeFragment extends Fragment {


    public AgeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_age, container, false);
    }

}
