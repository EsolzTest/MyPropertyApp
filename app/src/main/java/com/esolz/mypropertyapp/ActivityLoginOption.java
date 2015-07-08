package com.esolz.mypropertyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by ltp on 07/07/15.
 */
public class ActivityLoginOption extends AppCompatActivity {

    LinearLayout fbLoginBtn, twtLoginBtn, loginBtn, signupBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);

        fbLoginBtn = (LinearLayout) findViewById(R.id.fb_login);
        twtLoginBtn = (LinearLayout) findViewById(R.id.twt_login);
        loginBtn = (LinearLayout) findViewById(R.id.login);
        signupBtn = (LinearLayout) findViewById(R.id.sign_up);

        fbLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        twtLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLoginOption.this, ActivityLogin.class);
                startActivity(intent);
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLoginOption.this, ActivitySignUp.class);
                startActivity(intent);
            }
        });
    }
}