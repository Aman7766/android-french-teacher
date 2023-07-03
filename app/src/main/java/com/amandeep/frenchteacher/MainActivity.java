package com.amandeep.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button yellow,red,green,purple,blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            yellow=findViewById(R.id.yellow);
            red=findViewById(R.id.red);
            green=findViewById(R.id.green);
            blue=findViewById(R.id.blue);
            purple=findViewById(R.id.purple);
        yellow.setOnClickListener(this);
        red.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
        purple.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
        if(v==yellow)
        {
       SayColor(v,"yellow");
        }
        else if(v==red)
        {
            SayColor(v,"red");
        }
        else if(v==green)
        {
            SayColor(v,"green");
        }
        else if(v==blue)
        {  SayColor(v,"blue");

        }
        else if(v==purple)
        {
            SayColor(v,"purple");
        }
        }

    public void SayColor(View v, String value)
    {
        Button btn= (Button)v;
        MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),getResources().getIdentifier(value,"raw",getPackageName()));
         mediaPlayer.start();

    }
}