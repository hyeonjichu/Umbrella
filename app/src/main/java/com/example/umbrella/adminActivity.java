package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adminActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_activity);
    }

    public void onClickLogout(View view){ //adminpage에서 mainpage로 이동
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}