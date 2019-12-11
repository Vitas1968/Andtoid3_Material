package com.geek.a3l4drawerlayout.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.a3l4drawerlayout.R;

import java.util.ArrayList;

public class RecyclerBoarAdapter extends RecyclerView.Adapter<RecyclerBoarAdapter.ViewHolder> {
    private Fragment fragment;
    private ArrayList<String> listMemberFamily;
    private ArrayList<Integer> listImgMemberFamily;

    public RecyclerBoarAdapter(Fragment fragment, ArrayList<ArrayList> listResult) {
        this.fragment = fragment;
        if (listResult != null) {
            this.listMemberFamily = listResult.get(0);
            this.listImgMemberFamily = listResult.get(1);
        }
    }

    @NonNull
    @Override
    public RecyclerBoarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerBoarAdapter.ViewHolder holder, int position) {
        holder.descriptMember.setText(listMemberFamily.get(position));
        holder.imageMember.setImageResource(listImgMemberFamily.get(position));
    }

    @Override
    public int getItemCount() {
        return listMemberFamily.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageMember;
        private TextView descriptMember;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMember = itemView.findViewById(R.id.imgViewFamily);
            descriptMember = itemView.findViewById(R.id.member_desсript);
        }
    }
}
