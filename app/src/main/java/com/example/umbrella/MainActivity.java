package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNext(View view){ //다음 페이지로 이동(유저 페이지) > 정보 들어오면 넘어가는거로 바꿀예정
        Intent intent = new Intent(this,userActivity.class);
        startActivity(intent);
    }

    public void onClickAdmin(View view){ //adminpage로 이동
        Intent intent = new Intent(this,adminActivity.class);
        startActivity(intent);
    }

}