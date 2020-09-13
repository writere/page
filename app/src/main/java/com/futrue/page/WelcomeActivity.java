package com.futrue.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.futrue.page.follower.SharedPreferencesManager;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView welcome_next = findViewById(R.id.welcome_next);
        welcome_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        skip();
    }

    /*
     * 函数：skip()
     * 功能：检查初始化跳转情况
     */
    private void skip(){
        SharedPreferencesManager sharedPreferencesManager = new SharedPreferencesManager(getBaseContext(),"skip", Context.MODE_PRIVATE);
        boolean isFirst = sharedPreferencesManager.get("isFirst", true);
        boolean isLogin = sharedPreferencesManager.get("isLogin", false);
        if (!isFirst){
            if (isLogin){
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                this.finish();
            } else {
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
                this.finish();
            }
        }
    }







}
