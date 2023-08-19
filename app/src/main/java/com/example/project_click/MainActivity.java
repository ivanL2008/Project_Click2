package com.example.project_click;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // обработка нажатия кнопки
    public void onClickB(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}