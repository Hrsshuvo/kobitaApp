package com.hrsshuvo.newone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView kazin,rob,josim,habib,jdas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        ImageView kazin=findViewById(R.id.kazin);
        ImageView rob=findViewById(R.id.rob);
        ImageView josim=findViewById(R.id.josim);
        ImageView habib=findViewById(R.id.habib);
        ImageView jdas=findViewById(R.id.jdas);

        jdas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,jdasnav.class));
            }
        });

        habib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.hrsshuvo.newone.habib.class));
            }
        });

        josim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,josim.class));
            }
        });

        rob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,rthakur.class));
            }
        });

        kazin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,kazinav.class));
            }
        });
    }

    public void rob(View view) {
        Intent intent=new Intent(this,Robithakur.class);
        startActivities(new Intent[]{intent});
    }

}
