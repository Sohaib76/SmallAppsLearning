package com.stc.sohaib.testyourluck;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.*;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;


    private Random random = new Random();




        ListView listview;
        FloatingActionButton Addbutton;
        EditText GetValue;
        String[] ListElements = new String[] {
                "Android",
                "PHP"};





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

            final List<String> list = new ArrayList<String>();

            list.add("Apple");
            list.add("Boy");
            list.add("Cat");
            list.add("Dog");
            list.add("Elephant");
            list.add("Far");
            list.add("Get");
            list.add("Jimmy Vegas().seriesTutorial.Youtube");
            list.add("Jimmy Vegas().individualTutorial.Youtube");
            list.add("Brackeys().seriesTutorial.Youtube");
            list.add("Brackeys().individualTutorial.Youtube");
            list.add("Blackthorn Prod().individualTutorial.Youtube");
            list.add("Blackthorn Prod().seriesTutorial.Youtube");
            list.add("Cisco Academy().");
            list.add("F");
            list.add("Ge");
            list.add("Ele");
            list.add("F");
            list.add("Ge");  list.add("Ele");
            list.add("F");
            list.add("Ge");  list.add("Ele");
            list.add("F");
            list.add("Ge");

//            final AlertDialog.Builder builderSingle = new AlertDialog.Builder(MainActivity.this);
//            builderSingle.setIcon(R.drawable.ic_launcher_background);
//            builderSingle.setTitle("Select One Name:-");

//            builderSingle.setAdapter((ListAdapter) list, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    String strName = list.get(which);
//                    AlertDialog.Builder builderInner = new AlertDialog.Builder(MainActivity.this);
//                    builderInner.setMessage(strName);
//                    builderInner.setTitle("Your Selected Item is");
//                    builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog,int which) {
//                            dialog.dismiss();
//                        }
//                    });
//                    builderInner.show();
//                }
//            });
//            builderSingle.show();




            FloatingActionButton AddButton = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton RandomButton = (FloatingActionButton) findViewById(R.id.fabRandom);



            listview = (ListView) findViewById(R.id.myListView);
          //  GetValue = (EditText)findViewById(R.id.editText1);



          //  final List<String> ListElementsArrayList = new ArrayList<String>(Arrays.asList(ListElements));


            final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                    (MainActivity.this, android.R.layout.simple_list_item_1, list);

            listview.setAdapter(adapter);




            AddButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                  //  list.add(GetValue.getText().toString());
//                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                    builder.setMessage(adapter.getItem(random.nextInt()));

              //      AlertDialog alertDialog= builder.create();

//                    builder.show();


                 //   adapter.notifyDataSetChanged();



                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
            });

            RandomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Collections.shuffle(list);
                   // adapter.getItem(4);
                    adapter.notifyDataSetChanged();
                }
            });
        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void hello(View view) {
        Toast.makeText(this, "Work hard man", Toast.LENGTH_SHORT).show();
    }
}
