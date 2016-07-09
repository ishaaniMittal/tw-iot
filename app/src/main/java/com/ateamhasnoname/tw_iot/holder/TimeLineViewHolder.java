package com.ateamhasnoname.tw_iot.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ateamhasnoname.tw_iot.R;
import com.vipul.hp_hp.timelineview.TimelineView;

/**
 * Created by imittal on 7/9/16.
 */
public class TimeLineViewHolder extends RecyclerView.ViewHolder {
    public TextView stopName, travelDuration;
    public TimelineView mTimelineView;

    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);

        mTimelineView = (TimelineView) itemView.findViewById(R.id.time_marker);
        mTimelineView.initLine(viewType);
        stopName = (TextView) itemView.findViewById(R.id.stop_name);
        travelDuration = (TextView) itemView.findViewById(R.id.travel_duration);
    }
}
