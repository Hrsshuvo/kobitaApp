package com.hrsshuvo.newone;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kobita5 extends AppCompatActivity {
    MediaPlayer player;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobita5);
    }

    public void kobita(View view) {
        player=MediaPlayer.create(this,R.raw.bd);
        player.start();
    }
}
