package com.ateamhasnoname.tw_iot.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ateamhasnoname.tw_iot.R;
import com.ateamhasnoname.tw_iot.holder.RoutesHolder;
import com.ateamhasnoname.tw_iot.model.Routes;

import java.util.List;

/**
 * Created by imittal on 7/9/16.
 */
public class RoutesAdapter extends RecyclerView.Adapter<RoutesHolder> {
    private List<Routes> routesList;


    public RoutesAdapter(List<Routes> routesList) {
        this.routesList = routesList;
    }


    @Override
    public RoutesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final View v = layoutInflater.inflate(R.layout.row_routes, parent, false);
        return new RoutesHolder(v);

    }

    @Override
    public void onBindViewHolder(RoutesHolder holder, int position) {
        Routes route = routesList.get(position);

    }

    @Override
    public int getItemCount() {
        return routesList.size();
    }
}
