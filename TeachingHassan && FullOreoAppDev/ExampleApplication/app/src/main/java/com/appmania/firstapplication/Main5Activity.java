package com.appmania.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity {

    ImageView xmen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

       xmen1=findViewById(R.id.xmen1);

    }

    public void btn (View view){

        xmen1.setImageResource(R.drawable.xmeen);

    }

}
