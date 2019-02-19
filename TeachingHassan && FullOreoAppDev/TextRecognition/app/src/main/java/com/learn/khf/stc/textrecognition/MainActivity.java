package com.learn.khf.stc.textrecognition;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

public class MainActivity extends AppCompatActivity {

    ImageView helloImage;
    Button btn;
    TextView textReq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView helloImage = (ImageView)findViewById(R.id.helloImageId);
        Button btn = (Button)findViewById(R.id.btn);
        final TextView textReq = (TextView)findViewById(R.id.textReq);


        //Dealing with image code
        final Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.text_recognition);

        helloImage.setImageBitmap(bitmap);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();

                if(!textRecognizer.isOperational()){
                    Log.e("ERROR","Detector dependencies are not yet available");
                }
                else {
                    Frame frame = new Frame.Builder().setBitmap(bitmap).build();
                    StringBuilder stringBuilder = new StringBuilder();
                    SparseArray<TextBlock> items = textRecognizer.detect(frame);

                    for(int i=0;i<items.size();++i){
                        TextBlock item = items.valueAt(i);
                        stringBuilder.append(item.getValue());
                        stringBuilder.append("\n");

                        textReq.setText(stringBuilder.toString());
                }





            }



            }




    });


    }
}
