package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, userActivity.class);
        startActivity(i);
    }
}