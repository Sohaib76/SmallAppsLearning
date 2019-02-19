package com.learn.khf.stc.lean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Suprise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suprise);
    }

    public void openSuorise(View view) {
        Intent intent = new Intent(Suprise.this,StartActivity.class);
        startActivity(intent);
    }
}
