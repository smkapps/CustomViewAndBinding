package com.example.customviews;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.customviews.databinding.NameItemBinding;

import java.util.List;


public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NameViewHolder> {
    List<String> nameList;

    public NamesAdapter(List<String> nameList) {
        this.nameList = nameList;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        NameItemBinding binding = NameItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new NameViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
            holder.binding.setName(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {
         NameItemBinding binding;

        public NameViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
