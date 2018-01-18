package com.moonpig.calm.calm;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "sadasd";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}