package com.geek.andtoid3_material.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.andtoid3_material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FragmentPhoto1 extends Fragment {

    private TextInputEditText enterName;
    private TextInputLayout enterName_layout;
    private String name;
    private MaterialButton cominBtn;


    public FragmentPhoto1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_photo1, container, false);
        initViews(view);
        setListenerEditText();
        setClickListenerNameBtn();

        return view;

    }
    private void initViews(View view){
        enterName=view.findViewById(R.id.enter_name);
        cominBtn=view.findViewById(R.id.comin_btn);
        enterName_layout=view.findViewById(R.id.name_layout);

    }
    private void setListenerEditText() {
        enterName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
            @Override
            public void afterTextChanged(Editable s) {
                name = s.toString();

            }
        });
    }

    private void setClickListenerNameBtn() {
        cominBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name!=null) {
                    Bundle bundle=new Bundle();
                    bundle.putString("myName",name);
                    Navigation.findNavController(v).navigate(R.id.action_fragmentPhoto1_to_fragmentPhoto2,bundle);
                } else {
                    enterName_layout.setError("No name");
                    Snackbar.make(v, "No name", Snackbar.LENGTH_LONG)
                            .setAction("CLOSE", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    enterName_layout.setError(null);

                                }
                            })
                            .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                            .show();
                }
            }
        });
    }

}
