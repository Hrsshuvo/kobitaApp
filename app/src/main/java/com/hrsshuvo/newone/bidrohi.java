package com.hrsshuvo.newone;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bidrohi extends AppCompatActivity {
    MediaPlayer player;
    TextView bol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidrohi);

        final MediaPlayer sound = MediaPlayer.create(this,R.raw.bd);
       final TextView bol=this.findViewById(R.id.bol);

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.start();
            }
        });

    }

    public void b1(View view) {
        player=MediaPlayer.create(this,R.raw.bd);
        player.start();
    }

    public void b2(View view) {
        player=MediaPlayer.create(this,R.raw.bb2);
        player.start();

    }

    public void b3(View view) {
        player=MediaPlayer.create(this,R.raw.sir);
        player.start();
    }
}
