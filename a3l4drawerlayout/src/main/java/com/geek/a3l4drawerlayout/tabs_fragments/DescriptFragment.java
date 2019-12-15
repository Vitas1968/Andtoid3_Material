package com.geek.a3l4drawerlayout.tabs_fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.geek.a3l4drawerlayout.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptFragment extends Fragment {

    public DescriptFragment() {
    }

    public static DescriptFragment newInstance(Bundle bundle) {
        DescriptFragment descriptFragment = new DescriptFragment();
        descriptFragment.setArguments(bundle);
        return descriptFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descript, container, false);
        Bundle bundle = getArguments();
        String description = Objects.requireNonNull(bundle).getString("descriptArgs");
        TextView descriptView = view.findViewById(R.id.descript_textView);
        descriptView.setText(description);
        return view;
    }

}
