package com.ateamhasnoname.tw_iot.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ateamhasnoname.tw_iot.R;


public class TimelineViewFragment extends Fragment {

    private RecyclerView recyclerView;


    public TimelineViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_timeline_view, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.timeline_recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        populateDataInTimeline();

        return v;
    }

    private void populateDataInTimeline() {

    }


}
