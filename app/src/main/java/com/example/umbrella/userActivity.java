package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class userActivity extends Activity {

    public void onClickUserNext(View view){ //userpage에서 finishpage로 이동
        Intent intent = new Intent(this,finishActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);
    }
}
