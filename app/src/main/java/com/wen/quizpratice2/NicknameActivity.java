package com.wen.quizpratice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText nickname;
    private Button back;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        findViews();
    }

    private void findViews() {
        nickname = findViewById(R.id.ed_nickname);
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
    }
    public void next(View view){
        Intent infointent = new Intent(this,InfoActivity.class);
        startActivity(infointent);
        finish();
    }
}
