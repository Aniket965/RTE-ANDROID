package com.scibots.aniket.nestedrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scibots.aniket.nestedrecyclerview.R;

/**
 * Created by aniket on 27/5/17.
 */

public class outerAdapter extends RecyclerView.Adapter<outerAdapter.ViewHolder> {
    inner_adapter innerAdapter;
    Context context;

    public outerAdapter(Context context) {
        innerAdapter = new inner_adapter();
        this.context = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.outer_recyle, parent, false);
        ViewHolder v= new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView innerRecyclerView;


        public ViewHolder(View itemView) {
            super(itemView);
            innerRecyclerView = (RecyclerView) itemView.findViewById(R.id.movieRecyler);
            innerRecyclerView.setLayoutManager(
                    new LinearLayoutManager(context.getApplicationContext(), LinearLayoutManager.HORIZONTAL, false)
            );
            innerRecyclerView.setAdapter(innerAdapter);

        }
        public RecyclerView getInnerRecyclerView() {
            return innerRecyclerView;
        }
    }
}
