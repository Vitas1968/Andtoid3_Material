package com.geek.andtoid3_material.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geek.andtoid3_material.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPhoto2 extends Fragment {


    private TextView showName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_photo2, container, false);
        showName=view.findViewById(R.id.show_name);
        showName.setText(getArguments().getString("myName"));

        return view;
    }

}
