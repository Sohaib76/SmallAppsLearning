package com.appmania.myapplicationcurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inDoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inDoll=findViewById(R.id.in_doll);
    }

    public void btnqwe(View view) {

               String AmountInDollars=inDoll.getText().toString();
        double AmountInDollarsDouble = Double.parseDouble(AmountInDollars);
        double AmountInRuppess = AmountInDollarsDouble * 123.25;
       String AmountinRuppesString  = String.format("%.2f",AmountInRuppess);
       Toast.makeText(this, "$" + AmountInDollars + "is Rs" +" " + AmountinRuppesString , Toast.LENGTH_SHORT).show();
    }
}
