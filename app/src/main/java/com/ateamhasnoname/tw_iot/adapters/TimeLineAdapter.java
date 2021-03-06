package com.ateamhasnoname.tw_iot.adapters;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.ateamhasnoname.tw_iot.R;
import com.ateamhasnoname.tw_iot.holder.TimeLineViewHolder;
import com.ateamhasnoname.tw_iot.model.TimeLineModel;
import com.vipul.hp_hp.timelineview.TimelineView;

import java.util.List;

/**
 * Created by imittal on 7/9/16.
 */
public class TimeLineAdapter extends RecyclerView.Adapter<TimeLineViewHolder> {

    private List<TimeLineModel> mFeedList;
    private Context mContext;
    private GradientDrawable.Orientation mOrientation;

    public TimeLineAdapter(List<TimeLineModel> feedList, GradientDrawable.Orientation orientation) {
        mFeedList = feedList;
        mOrientation = orientation;
    }

    @Override
    public int getItemViewType(int position) {
        return TimelineView.getTimeLineViewType(position, getItemCount());
    }

    @Override
    public TimeLineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        mContext = parent.getContext();
        View view;
        view = View.inflate(parent.getContext(), R.layout.row_timeline_view, null);

        return new TimeLineViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(TimeLineViewHolder holder, int position) {

        TimeLineModel timeLineModel = mFeedList.get(position);

    }

    @Override
    public int getItemCount() {
        return (mFeedList != null ? mFeedList.size() : 0);
    }

}

