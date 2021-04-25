package com.geekchtech.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    EditText editText;
    String userAnswer;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initViews();
        initAction();
        checkAnswer();
    }

    private void checkAnswer() {
        check = findViewById(R.id.check_btn);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("32")) {
                    Toast.makeText(GameActivity.this, "Right answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initAction() {
        userAnswer = editText.getText().toString();
    }

    private void initViews() {
        editText = findViewById(R.id.answer_ed);
    }

    public void next_level(View view) {
        Intent intent = new Intent(GameActivity.this,GameLevel2.class);
        startActivity(intent);
    }
}