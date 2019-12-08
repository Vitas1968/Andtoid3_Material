package com.geek.a3l4drawerlayout.ui.gallery;

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

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final TextView boarDescTextView = root.findViewById(R.id.boar_description);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        galleryViewModel.getBoarDescriptiot().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                boarDescTextView.setText(s);
            }
        });
        loadImageWithPicasso(root);
        return root;
    }

    private void loadImageWithPicasso(View view) {

        ImageView imageView=view.findViewById(R.id.imgView);
        //Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);
        Picasso.get().load("https://img4.goodfon.ru/wallpaper/nbig/2/49/dikii-kaban-kabanchik-malysh-mordy.jpg").into(imageView);
    }
}