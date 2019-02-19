package com.appmania.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText toaster;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toaster  = findViewById(R.id.editText);

    }

    public void Btn (View view){




        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(toaster.getText().toString());





        if (myNumber.isSquare() && myNumber.isTriangular()){

            Toast.makeText(this, "The number is square number and a triangular number", Toast.LENGTH_SHORT).show();
        }
        else if (myNumber.isSquare()){
            Toast.makeText(this, "The number is square number", Toast.LENGTH_SHORT).show();

        }
        else if(myNumber.isTriangular()){

            Toast.makeText(this, "The number is triangular number ", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(this, "The number is nor triangular nor square ", Toast.LENGTH_SHORT).show();

        }


    }




}
