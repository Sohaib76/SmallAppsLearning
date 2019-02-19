package com.appmania.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {


    EditText usernameEditText,passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        usernameEditText=findViewById(R.id.userEditText);
        passwordEditText=findViewById(R.id.passwordeditText);


    }

    public void login(View view){
        Toast.makeText(this, "Hello"+usernameEditText.getText().toString() , Toast.LENGTH_SHORT).show();
        Toast.makeText(this, passwordEditText.getText().toString(), Toast.LENGTH_SHORT).show();

        }



}
