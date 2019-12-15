package com.geek.a3l4drawerlayout.recycler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.a3l4drawerlayout.R;
import com.geek.a3l4drawerlayout.TabsActivity;

import java.util.ArrayList;
import java.util.Objects;

public class RecyclerBoarAdapter extends RecyclerView.Adapter<RecyclerBoarAdapter.ViewHolder> {
    private Fragment fragment;
    private ArrayList<String> listMemberFamily;
    private ArrayList<Integer> listImgMemberFamily;
    private ArrayList<Integer> listAgeMemberFamily;

    public RecyclerBoarAdapter(Fragment fragment, ArrayList<ArrayList> listResult) {
        this.fragment = fragment;
        if (listResult != null) {
            this.listMemberFamily = listResult.get(0);
            this.listImgMemberFamily = listResult.get(1);
            this.listAgeMemberFamily = listResult.get(2);
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
        final int pos=position;
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // вызываем активити для табса и передаем туда данные
                Intent intent=new Intent( fragment.getActivity(),TabsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("descriptArgs",listMemberFamily.get(pos));
                bundle.putInt("imgArgs",listImgMemberFamily.get(pos));
                bundle.putInt("ageArgs",listAgeMemberFamily.get(pos));
                intent.putExtra("args",bundle);
                //intent.putExtra("imgArgs",listImgMemberFamily.get(pos));
                //intent.putExtra("descriptArgs",listMemberFamily.get(pos));
               // intent.putExtra("ageArgs",listAgeMemberFamily.get(pos));
                Objects.requireNonNull(fragment.getActivity()).startActivity(intent);
                // надо ещё адаптер написать
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMemberFamily.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageMember;
        private TextView descriptMember;
        private CardView cardView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            imageMember = itemView.findViewById(R.id.imgViewFamily);
            descriptMember = itemView.findViewById(R.id.member_desсript);
        }

    }
}
