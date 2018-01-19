package com.moonpig.EMDR;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.moonpig.calm.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void loadExercise(View view) {
        Intent intent = new Intent(this, Exercise.class);
        String message = "sadasd";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
