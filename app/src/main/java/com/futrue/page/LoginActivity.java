package com.futrue.page;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    //test
    private EditText login_edit_account, login_edit_password;
    private RelativeLayout login_view_login;
    private TextView login_text_login, login_text_other, login_text_help;

    private View.OnClickListener click_edit_account, click_edit_password, click_view_login, click_text_login,
    click_text_other, click_text_help;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init(){
        initView();
        initListener();
        addListener();
    }

    private void initView(){
        login_edit_account = findViewById(R.id.login_edit_account);
        login_edit_password = findViewById(R.id.login_edit_password);
        login_view_login = findViewById(R.id.login_view_login);
        login_text_login = findViewById(R.id.login_text_login);
        login_text_other = findViewById(R.id.login_text_register);
        login_text_help = findViewById(R.id.login_text_help);
    }

    private void initListener(){
        click_edit_account = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_edit_account.setBackground(getResources().getDrawable(R.drawable.shape_login_input_yang));
                login_edit_password.setBackground(getResources().getDrawable(R.drawable.shape_login_input_yin));
            }
        };
        click_edit_password = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_edit_account.setBackground(getResources().getDrawable(R.drawable.shape_login_input_yin));
                login_edit_password.setBackground(getResources().getDrawable(R.drawable.shape_login_input_yang));
            }
        };
        click_view_login = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        click_text_login = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        click_text_other = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        click_text_help = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }

    private void addListener(){
        login_edit_account.setOnClickListener(click_edit_account);
        login_edit_password.setOnClickListener(click_edit_password);
        login_view_login.setOnClickListener(click_view_login);
        login_text_login.setOnClickListener(click_text_login);
        login_text_other.setOnClickListener(click_text_other);
        login_text_help.setOnClickListener(click_text_help);
    }


}
