package com.geek.a3l4drawerlayout.ui.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.geek.a3l4drawerlayout.R;
import com.geek.a3l4drawerlayout.data_model.DataModel;
import com.geek.a3l4drawerlayout.recycler.RecyclerBoarAdapter;
import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private Context mContext;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        initRecycler(root);
        return root;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    private void initRecycler(View view) {
        DataModel dataModel = new DataModel();
        ArrayList listResult = dataModel.getListResult();
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        RecyclerBoarAdapter adapter = new RecyclerBoarAdapter(this, listResult);
        RecyclerView recycler = view.findViewById(R.id.recycler_view);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

}