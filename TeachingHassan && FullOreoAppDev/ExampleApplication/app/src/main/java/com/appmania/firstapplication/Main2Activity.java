package com.appmania.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView x1,x2;

 //  public boolean isX1Showing = true;

    public void clone (View view){


//
        x1.animate().translationXBy(1000).rotation(1800).setDuration(3000);


//
//        if(isX1Showing){
//            isX1Showing = false;
//           x1.animate().alpha(0).setDuration(3000);
//            x2.animate().alpha(1).setDuration(3000);
//        }
//
//
//        else{
//            isX1Showing=true;
//            x1.animate().alpha(1).setDuration(3000);
//            x2.animate().alpha(0).setDuration(3000);
//
//        }
////

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);


        x1.setX(-1000);
        x1.animate().translationXBy(1000).rotation(3600).setDuration(3000);
    }
}
