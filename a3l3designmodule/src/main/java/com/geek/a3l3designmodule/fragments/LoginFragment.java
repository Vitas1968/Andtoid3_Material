package com.geek.a3l3designmodule.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.geek.a3l3designmodule.R;
import com.google.android.material.textfield.TextInputEditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private Button cancel, come_in;
    private String login;
    private TextInputEditText enterLoginEditText;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login, container, false);
        cancel=view.findViewById(R.id.cancel_button);
        come_in=view.findViewById(R.id.come_in_btn);
        enterLoginEditText=view.findViewById(R.id.enter_name);
        setListenerLoginEditText();
        setClickListenerCancelBtn();
        setClickListenerComeInBtn();

        return view;
    }
    private void setClickListenerCancelBtn() {
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().finish();
            }
        });
    }
    private void setClickListenerComeInBtn() {
        come_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("myLogin",login);
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_toolBarFragment,bundle);
            }
        });
    }

    private void setListenerLoginEditText() {
        enterLoginEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
            @Override
            public void afterTextChanged(Editable s) {
                login = s.toString();
            }
        });
    }
}
