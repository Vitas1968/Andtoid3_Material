package com.geek.a3l4drawerlayout.tabs_fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.geek.a3l4drawerlayout.R;
import java.util.Objects;

public class AgeFragment extends Fragment {

    public AgeFragment() {
    }
    public static AgeFragment newInstance(Bundle bundle){
        AgeFragment ageFragment = new AgeFragment();
        ageFragment.setArguments(bundle);
        return ageFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_age, container, false);
        Bundle bundle= getArguments();
        int age = Objects.requireNonNull(bundle).getInt("ageArgs");
        TextView ageTextView=view.findViewById(R.id.age_textView);
        ageTextView.setText(Integer.toString(age));
        return view;
    }
}
