package com.example.sohaib.videoexample;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundDemo extends AppCompatActivity {

    Button playBtn,pauseBtn,stopBtn,goToVideo;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_demo);

        playBtn = findViewById(R.id.playBtn);
        pauseBtn = findViewById(R.id.pauseBtn);
        stopBtn = findViewById(R.id.stopBtn);
        goToVideo = findViewById(R.id.goToVideo);




       mediaPlayer = MediaPlayer.create(this,R.raw.byan);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.byan);
                mediaPlayer.start();

            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();

            }
        });
        goToVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoundDemo.this,MainActivity.class);
                startActivity(intent);

            }
        });



    }

//    public void play(View v){
//        mediaPlayer.start();
//    }
//
//    public void stop(View v){
//        mediaPlayer.stop();
//    }


}
