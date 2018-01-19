package com.moonpig.EMDR;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.moonpig.EMDR.UnityPlayerActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
