package com.example.umbrella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class adminChkActivity extends Activity {

    private EditText adminId;
    private EditText adminPw;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_chk_activity);

        adminId = (EditText) findViewById(R.id.id);
        adminPw = (EditText) findViewById(R.id.pw);
        System.out.println("아이디는 "+adminId);
        System.out.println("비밀번호는 "+adminPw);
    }

    public void onClickLogin(View view){ //adminChk에서 admin page로 이동
        Intent intent = new Intent(this,adminActivity.class);
        startActivity(intent);
    }
    public void onClickBack(View view){ //adminChk에서 main page로 이동
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
