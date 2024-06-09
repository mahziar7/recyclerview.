package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptername extends RecyclerView.Adapter<Adaptername.NameViewHolder> {
    String[] names = {};
    int[] imageid = {};

    public Adaptername() {
        Templistitem templistitem = new Templistitem();
        names = templistitem.getName();
        imageid = templistitem.getAvatar();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new Adaptername.NameViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setitem(names[position], imageid[position]);
        holder.imageView_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {
        private TextView textView_item;
        private ImageView imageView_item;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_item = itemView.findViewById(R.id.imageView_item);
            textView_item = itemView.findViewById(R.id.textView_item);

        }

        public void setitem(String names, int imageid) {
            textView_item.setText(names);
            imageView_item.setImageResource(imageid);

        }
    }
}