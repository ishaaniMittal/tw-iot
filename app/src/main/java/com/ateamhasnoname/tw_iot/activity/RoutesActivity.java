package com.ateamhasnoname.tw_iot.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ateamhasnoname.tw_iot.R;
import com.ateamhasnoname.tw_iot.model.Routes;

import java.util.List;

public class RoutesActivity extends AppCompatActivity {

    private List<Routes> routesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        callServiceToGetRoutesList();


    }



    private void callServiceToGetRoutesList() {

    }

}
