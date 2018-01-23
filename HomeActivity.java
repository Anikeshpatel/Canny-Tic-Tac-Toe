package anongrp.canny_thetic_tac_toegame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
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

    @Override
    protected void onStart() {
        super.onStart();

        optionBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    optionBtn.setScaleX(1.0f);
                    optionBtn.setScaleY(1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    optionBtn.setScaleX(0.9f);
                    optionBtn.setScaleY(0.9f);
                    Intent intent = new Intent(getApplicationContext(),OptionController.class);
                    startActivity(intent);

                }
                return true;
            }
        });

        playBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    playBtn.setScaleX(1.0f);
                    playBtn.setScaleY(1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    playBtn.setScaleX(0.9f);
                    playBtn.setScaleY(0.9f);
                    Intent intent = new Intent(getApplicationContext(),BotController.class);
                    startActivity(intent);

                }
                return true;
            }
        });

        exitBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    exitBtn.setScaleX(1.0f);
                    exitBtn.setScaleY(1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    exitBtn.setScaleX(0.9f);
                    exitBtn.setScaleY(0.9f);
                    exitBtn.setTranslationY(20);
                    HomeActivity.this.finish();
                }
                return true;
            }
        });
    }
}
