package anongrp.canny_thetic_tac_toegame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayingController extends AppCompatActivity {
    TextView block1;
    TextView block2;
    TextView block3;
    TextView block4;
    TextView block5;
    TextView block6;
    TextView block7;
    TextView block8;
    TextView block9;
    TextView userChoice1;
    TextView userChoice2;
    Button backBtn;
    private Integer[][] winningCombination;
    private Integer playerNo;
    private List<Integer> player1;
    private List<Integer> player2;
    private Integer player1WinningChance;
    private Integer player2WinningChance;
    private Integer counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_to_player);

        block1 = findViewById(R.id.block1);
        block2 = findViewById(R.id.block2);
        block3 = findViewById(R.id.block3);
        block4 = findViewById(R.id.block4);
        block5 = findViewById(R.id.block5);
        block6 = findViewById(R.id.block6);
        block7 = findViewById(R.id.block7);
        block8 = findViewById(R.id.block8);
        block9 = findViewById(R.id.block9);
        userChoice1 = findViewById(R.id.userChoice1);
        userChoice2 = findViewById(R.id.userChoice2);
        backBtn = findViewById(R.id.backBtn);
        winningCombination = new Integer[][]{{1,2,3}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9}, {1,5,9}, {3,5,7},
                {2,3,1},{3,1,2},{5,6,4},{6,4,5},{8,9,7},{9,7,8},{4,7,1},{7,1,4},{5,8,2},{8,2,5},{6,9,3},{9,3,6},{5,9,1},{9,5,1},{7,5,3},{5,7,3}};
        playerNo = -1;
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        player1WinningChance = 0;
        player2WinningChance = 0;
    }


    public void blockAction1(View view) {
        if (playerNo == -1){
            player1.add(1);
            block1.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(1);
            block1.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction2(View view) {
        if (playerNo == -1){
            player1.add(2);
            block2.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(2);
            block2.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();

    }
    public void blockAction3(View view) {
        if (playerNo == -1){
            player1.add(3);
            block3.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(3);
            block3.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction4(View view) {
        if (playerNo == -1){
            player1.add(4);
            block4.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(4);
            block4.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction5(View view) {
        if (playerNo == -1){
            player1.add(5);
            block5.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(5);
            block5.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction6(View view) {
        if (playerNo == -1){
            player1.add(6);
            block6.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(6);
            block6.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction7(View view) {
        if (playerNo == -1){
            player1.add(7);
            block7.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(7);
            block7.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction8(View view) {
        if (playerNo == -1){
            player1.add(8);
            block8.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(8);
            block8.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }
    public void blockAction9(View view) {
        if (playerNo == -1){
            player1.add(9);
            block9.setText(userChoice1.getText());
            playerNo *= -1;
        }
        else {
            player2.add(9);
            block9.setText(userChoice2.getText());
            playerNo *= -1;
        }

        getWinner();
    }

    private void getWinner(){
        counter++;
        if (counter >= 5){
            for (Integer[] i : winningCombination){
                for (Integer k:player1){
                    if (Objects.equals(i, k)){


                    }
                }
                for (Integer l:player2){
                    if (Objects.equals(i, l)){


                    }
                }
            }
        }

    }

    public void back(View view) {
        PlayingController.this.finish();
    }
}
