package com.geek.andtoid3_material.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.andtoid3_material.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPhoto1 extends Fragment {


    public FragmentPhoto1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo1, container, false);
    }

}
