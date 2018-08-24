package com.sagensoren.showandhideui;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView CimageView;
    Button playBtn;
    MediaPlayer mediaPlayer;
    public void show(View view)
    {
        CimageView.setVisibility(View.VISIBLE);
    }
    public void hide(View view)
    {
        CimageView.setVisibility(view.INVISIBLE);
    }
    public void playFun(View view)
    {
        mediaPlayer.start();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CimageView=(ImageView)findViewById(R.id.CimageView);
        playBtn=(Button)findViewById(R.id.playBtn);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rooster);
    }

}


