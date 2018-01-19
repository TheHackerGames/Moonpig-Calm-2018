package com.moonpig.EMDR;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.moonpig.calm.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences =  getSharedPreferences("my_preferences", MODE_PRIVATE);
        if(!preferences.getBoolean("onboarding_complete",false)) {
            Intent onboarding = new Intent(this, OnboardingActivity.class);
            startActivity(onboarding);
            finish();
            return;
        }
        setContentView(R.layout.activity_home);
    }

    public void loadExercise(View view) {
        Intent intent = new Intent(this, Exercise.class);
        String message = "sadasd";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "sadasd";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}