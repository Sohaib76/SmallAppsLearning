package com.appmania.firstapplication;

import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editText  = findViewById(R.id.editTextId);
    }

//    public void clickFunction(View onclick){
//        Log.i("Info", "clickFunction:");
//    }

    public void forefsf (View viewas){
        Log.i("Info", "forefsf: ");

        Toast.makeText(this, editText.getText().toString()+"", Toast.LENGTH_SHORT).show();


    }
}
