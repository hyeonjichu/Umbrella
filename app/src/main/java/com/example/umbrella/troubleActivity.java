package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class troubleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trouble_activity);
    }

    public void onClickBack(View view){ //고장신고 안내 페이지 이동
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
