package com.appmania.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ImageView tic1_2;

    TextView winnerText;
    Button restartBtn;

    //0: circle , 1: qwe, 2: empty
    int activePlayer = 0;
    int[] gameState = {2,2,2,2,2,2,2,2,2};

    //array of wining positions
    int[][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    boolean gameActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restartBtn = findViewById(R.id.restartBtn);
        winnerText = findViewById(R.id.winnerText);



        //  tic1_2 = findViewById(R.id.tic1_2);
    }


    public void restart(View view){
        Intent restart = new Intent(MainActivity.this,MainActivity.class);
        startActivity(restart);


        //  Another way of doing it:
//          Gridlayout gridlayout = find view by id;
//          for(int i=0; i<gridlayout.getChildAt(i));
//          ImageView counter = gridLayout.getChildAt(i)
//          counter.setImageDrawable(null)}
//          //0: circle , 1: qwe, 2: empty
//
//          activePlayer = 0;
//         for(int i=0; i<gamestate.length; i++){
//        gamestate[i] = 2;
//
//    }
//          gameState = {2,2,2,2,2,2,2,2,2};
//
//         //array of wining positions
//          gameActive = true;


    }


    public void dropIn(View view){


        ImageView counter = (ImageView) view;


        int tappedCounter = Integer.parseInt(counter.getTag().toString());



        if(gameState[tappedCounter]==2 && gameActive) {
            //adding to array (the number like 2)
            gameState[tappedCounter] = activePlayer;


            counter.setTranslationY(-1500);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.circle);
                winnerText.setText( "It's Cross Turn");
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.cr);
                winnerText.setText( "It's Circle Turn");
                activePlayer = 0;
            }

            counter.animate().translationYBy(1500).rotation(3600).setDuration(300);

            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();

            //Checking for wining player
            for (int[] winingPosition : winningPositions) {
                if (gameState[winingPosition[0]] == gameState[winingPosition[1]] && gameState[winingPosition[1]] == gameState[winingPosition[2]] && gameState[winingPosition[0]] != 2) {
                    //Someone Has Won!

                    gameActive = false;

                    String winner = "";
                    if (activePlayer == 1) {
                        winner = "Circle";
                    } else {
                        winner = "Cross";
                    }

                    winnerText.setText(winner + " Has Won!");
                    restartBtn.setVisibility(View.VISIBLE);
                  //  Toast.makeText(MainActivity.this, winner + " Has Won!", Toast.LENGTH_SHORT).show();

                }
                else if(gameState[0] != 2 && gameState[1] != 2 && gameState[2] != 2 &&gameState[3] != 2 &&gameState[4] != 2&&
                gameState[5] != 2 && gameState[6] != 2 && gameState[7] != 2 &&gameState[8] != 2){
                    winnerText.setText("Game is Draw");
                    restartBtn.setVisibility(View.VISIBLE);
                }
            }
        }

    }



}
