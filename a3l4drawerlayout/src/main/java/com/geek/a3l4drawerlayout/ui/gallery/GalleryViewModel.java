package com.geek.a3l4drawerlayout.ui.gallery;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.geek.a3l4drawerlayout.R;
import com.squareup.picasso.Picasso;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is family of boar");
    }

    public LiveData<String> getText() {
        return mText;
    }

}