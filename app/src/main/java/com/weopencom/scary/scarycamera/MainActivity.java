package com.weopencom.scary.scarycamera;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//int flag, int mask


        //Sound Full
        AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);

    }
    public void takePic(View view){
        FrameLayout fl=(FrameLayout)findViewById(R.id.camera_preview);

        Random rand=new Random();
        int n=rand.nextInt(5);
        if(n<2){
            fl.setBackgroundResource(R.drawable.scarypics);
        }else if(n==2){
            fl.setBackgroundResource(R.drawable.scarypics2);
        }else{
            fl.setBackgroundResource(R.drawable.scarypics3);
        }


        MediaPlayer mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.scarysound);
        mediaPlayer.start();
        Toast.makeText(MainActivity.this, "Hello Random number is "+n, Toast.LENGTH_SHORT).show();
    }
}
