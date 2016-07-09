package com.ateamhasnoname.tw_iot.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.ateamhasnoname.tw_iot.R;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView destination;
    private EditText noOfPassenger;
    private Button submitButton;
    private String[] stops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getDifferentBusStops();

        initializeViews();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, stops);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendRequest();
            }
        });
    }

    private void getDifferentBusStops() {
        // TODO: call volley service
    }

    private void sendRequest() {
        String destinationText = destination.getText().toString();
        String noOfPeopleText = noOfPassenger.getText().toString();

        startActivity(new Intent(this,RoutesActivity.class));
        // TODO: call volley service
    }

    private void initializeViews() {
        destination = (AutoCompleteTextView) findViewById(R.id.destination);
        noOfPassenger = (EditText) findViewById(R.id.noOfPassenger);
        submitButton = (Button) findViewById(R.id.submit_button);


    }

}
