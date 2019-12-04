package com.geek.a3l4drawerlayout.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.geek.a3l4drawerlayout.R;
import com.squareup.picasso.Picasso;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel = ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        loadImageWithPicasso(root);
        return root;
    }
    private void loadImageWithPicasso(View view) {

        ImageView imageView=view.findViewById(R.id.imgView_tools);

        Picasso.get().load("https://cdn.pixabay.com/photo/2017/11/19/16/16/boar-2963161__340.jpg").into(imageView);
    }
}