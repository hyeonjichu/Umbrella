package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class finishActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_activity);

        Handler timer = new Handler();

        timer.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(finishActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}

