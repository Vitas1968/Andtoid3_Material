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

public class RecyclerBoarAdapter extends RecyclerView.Adapter<RecyclerBoarAdapter.ViewHolder> {
    private Fragment fragment;

    public RecyclerBoarAdapter(Fragment fragment) {
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public RecyclerBoarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context)
                .inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerBoarAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private  ImageView imageMember;
        private TextView descriptMember;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMember = itemView.findViewById(R.id.imgViewFamily);
            descriptMember = itemView.findViewById(R.id.member_desript);
        }

        public void setImageMember(ImageView imageMember) {
            this.imageMember = imageMember;
        }

        public void setDescriptMember(TextView descriptMember) {
            this.descriptMember = descriptMember;
        }
    }
}
