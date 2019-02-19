package com.appmania.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText nameEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        nameEdit = findViewById(R.id.aaa);

    }




    public void enterName(View view) {

        Toast.makeText(this, "Hello!" + nameEdit.getText().toString(), Toast.LENGTH_SHORT).show();
    }

}
