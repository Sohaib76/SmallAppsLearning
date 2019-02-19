package com.appmania.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText;




//    int min = 1;
//    int max = 120;

   // Random r = new Random();
   int randomStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);


        Random randomGenerator = new Random();
        randomStart = randomGenerator.nextInt(120);
       //randomStart = r.nextInt(max - min + 1) + min;

    }


    public void pressIt(View view)
    {




        String q = editText.getText().toString();
        int converted = Integer.parseInt(q);


//        if(converted == random) {
//
//            int min = 1;
//            int max = 120;
//
//            Random r = new Random();
//            int random = r.nextInt(max - min + 1) + min;
//
//            Toast.makeText(this,  "Your guessed number "+random+"  is right", Toast.LENGTH_SHORT).show();




            if(converted == randomStart)

            {
            Toast.makeText(this, "new", Toast.LENGTH_SHORT).show();

            Random randomGenerator = new Random();
            randomStart = randomGenerator.nextInt(20);

           }

            else if (converted > randomStart){
                Toast.makeText(this, "You Should Guess a lower number", Toast.LENGTH_SHORT).show();
            }




            else
            {
                Toast.makeText(this, "You Should Guess a higher number", Toast.LENGTH_SHORT).show();
            }


//



       // System.out.print(randomNumber);
//
//
//
//        }













    }

}
