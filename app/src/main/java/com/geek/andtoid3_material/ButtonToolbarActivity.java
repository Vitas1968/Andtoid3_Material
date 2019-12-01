package com.geek.andtoid3_material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BottomSheetActivity extends AppCompatActivity {
    private TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        showName=findViewById(R.id.show_name);
        showName.setText(getIntent().getStringExtra("myName"));
    }
}
