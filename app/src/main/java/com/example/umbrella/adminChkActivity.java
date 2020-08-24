package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adminChkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_chk_activity);
    }

    public void onClickLogin(View view){ //adminChk에서 admin page로 이동
        Intent intent = new Intent(this,adminActivity.class);
        startActivity(intent);
    }
}
