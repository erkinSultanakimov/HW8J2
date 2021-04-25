package com.geekchtech.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevel2 extends AppCompatActivity {
    EditText editText;
    String userAnswer;
    Button check;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level2);
        initViews();
        initAction();
        checkAnswer();
    }

    private void checkAnswer() {
        check = findViewById(R.id.check_btn);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("18")) {
                    Toast.makeText(GameLevel2.this, "Right answer", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameLevel2.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initViews() {
        editText = findViewById(R.id.answer_ed);
    }

    private void initAction() {
        userAnswer = editText.getText().toString();
    }
}