package com.example.umbrella;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class finishActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Handler timer = new Handler();

        timer.postDelayed(new Runnable() { //finishpage 3초 후 자동 종료..?
            @Override
            public void run() {
                setContentView(R.layout.finish_activity);
                finish();
            }
        },3000);
    }
}
