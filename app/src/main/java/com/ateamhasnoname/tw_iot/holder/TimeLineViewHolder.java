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
    public TextView name;
    public  TimelineView mTimelineView;

    public TimeLineViewHolder(View itemView, int viewType) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tx_name);
        mTimelineView = (TimelineView) itemView.findViewById(R.id.time_marker);
        mTimelineView.initLine(viewType);
    }
}
