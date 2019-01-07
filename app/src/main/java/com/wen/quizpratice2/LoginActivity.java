package com.wen.quizpratice2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        String u = getSharedPreferences("login",MODE_PRIVATE)
                .getString("username"," ");
        username.setText(u);
    }

    private void findViews() {
        username = findViewById(R.id.ed_username);
        password = findViewById(R.id.ed_password);
        login = findViewById(R.id.login);
    }
    public void login(View view){
        String u = username.getText().toString();
        String p = password.getText().toString();
        if(u.equals("lin") && p.equals("111")){
            getSharedPreferences("login",MODE_PRIVATE)
                    .edit()
                    .putString("username",u)
                    .apply();
            Intent intent = new Intent(this,NicknameActivity.class);
            startActivity(intent);
        }
    }
}
