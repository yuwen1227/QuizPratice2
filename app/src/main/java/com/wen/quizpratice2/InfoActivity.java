package com.wen.quizpratice2;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    private EditText age;
    private EditText sex;
    private Button back;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findViews();
    }

    private void findViews() {
        age = findViewById(R.id.ed_age);
        sex = findViewById(R.id.ed_sex);
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(InfoActivity.this)
                        .setMessage(" 請確認資料無誤")
                        .setPositiveButton("SURE",null)
                        .setNeutralButton("CANCEL",null)
                        .show();
            }
        });
    }

    public void back(View view){
        Intent nicknameintent = new Intent(this,NicknameActivity.class);
        startActivity(nicknameintent);
        finish();
    }
    public void next(View view){
        Intent recyclerintent = new Intent(this,RecyclerActivity.class);
        startActivity(recyclerintent);
        finish();
    }
}
