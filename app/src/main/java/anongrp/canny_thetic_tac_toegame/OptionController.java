package anongrp.canny_thetic_tac_toegame;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OptionController extends AppCompatActivity {
    Button githubBtn,optionExitBtn,aboutBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_activity);

        githubBtn = findViewById(R.id.githubBtn);
        aboutBtn = findViewById(R.id.aboutBtn);
        optionExitBtn = findViewById(R.id.optionExitBtn);
    }

    public void quit(View view) {
        OptionController.this.finish();
    }
}
