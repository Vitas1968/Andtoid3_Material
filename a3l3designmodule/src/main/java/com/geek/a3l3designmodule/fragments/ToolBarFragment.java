package com.geek.a3l3designmodule.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.a3l3designmodule.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToolBarFragment extends Fragment {


    public ToolBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tool_bar, container, false);
    }

}
