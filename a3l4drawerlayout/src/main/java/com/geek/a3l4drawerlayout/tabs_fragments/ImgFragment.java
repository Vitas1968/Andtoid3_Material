package com.geek.a3l4drawerlayout.tabs_fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.geek.a3l4drawerlayout.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImgFragment extends Fragment {
    ImageView imgView;


    public ImgFragment() {
        // Required empty public constructor
    }
    public static ImgFragment newInstance(Bundle bundle){
        ImgFragment imgFragment = new ImgFragment();
        imgFragment.setArguments(bundle);
        return imgFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_img, container, false);
        Bundle bundle= getArguments();
        int imgRes = Objects.requireNonNull(bundle).getInt("imgArgs");
        imgView = view.findViewById(R.id.image_member);
        imgView.setImageResource(imgRes);
        return view;
    }

}
