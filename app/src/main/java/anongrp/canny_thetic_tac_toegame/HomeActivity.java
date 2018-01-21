package anongrp.canny_thetic_tac_toegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button playBtn;
    Button opetionBtn;
    Button exitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        playBtn = findViewById(R.id.playBtn);
        opetionBtn = findViewById(R.id.optionBtn);
        exitBtn = findViewById(R.id.exitBtn);
    }

    public void quit(View view) {
        HomeActivity.this.finish();
    }
}
