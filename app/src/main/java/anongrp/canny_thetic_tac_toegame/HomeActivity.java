package anongrp.canny_thetic_tac_toegame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button playBtn;
    Button optionBtn;
    Button exitBtn;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        playBtn = findViewById(R.id.playBtn);
        optionBtn = findViewById(R.id.optionBtn);
        exitBtn = findViewById(R.id.exitBtn);

    }


    public void quit(View view) {
        HomeActivity.this.finish();
    }

    public void play(View view) {
        Intent intent = new Intent(getApplicationContext(),PlayingController.class);
        startActivity(intent);
    }

    public void showOption(View view) {
        Intent intent = new Intent(getApplicationContext(),OptionController.class);
        startActivity(intent);
    }
}
