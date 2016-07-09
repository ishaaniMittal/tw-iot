package com.ateamhasnoname.tw_iot.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ateamhasnoname.tw_iot.R;

/**
 * Created by imittal on 7/9/16.
 */
public class RoutesHolder extends RecyclerView.ViewHolder {

    private TextView commuteOne, commuteDurationOne, costCommuteOne;
    private TextView commuteTwoStopOne, commuteTwoStopTwo, commuteDurationTwo, costCommuteTwo;
    private TextView commuteThree, commuteDurationThree, costCommuteThree;

    public RoutesHolder(View itemView) {
        super(itemView);
        commuteOne = (TextView) itemView.findViewById(R.id.commute_one);
        commuteTwoStopOne = (TextView) itemView.findViewById(R.id.commute_two_stop_one);
        commuteTwoStopTwo = (TextView) itemView.findViewById(R.id.commute_two_stop_two);
        commuteThree = (TextView) itemView.findViewById(R.id.commute_three);
        commuteDurationOne = (TextView) itemView.findViewById(R.id.travel_duration_commute_one);
        commuteDurationTwo = (TextView) itemView.findViewById(R.id.travel_duration_commute_two);
        commuteDurationThree = (TextView) itemView.findViewById(R.id.travel_duration_commute_three);
        costCommuteOne = (TextView) itemView.findViewById(R.id.cost_commute_one);
        costCommuteTwo = (TextView) itemView.findViewById(R.id.cost_commute_two);
        costCommuteThree = (TextView) itemView.findViewById(R.id.cost_commute_three);
    }


}
