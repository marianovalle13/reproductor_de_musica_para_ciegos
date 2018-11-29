package com.example.mariano.reproductor_para_ciegos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button play, repeat;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormp[] = new MediaPlayer[13];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.play);
        repeat = (Button)findViewById(R.id.repeat);
        iv = (ImageView)findViewById(R.id.music_logo);

        vectormp[0] = MediaPlayer.create( this, R.raw.circulation);
        vectormp[1] = MediaPlayer.create( this, R.raw.cock);
        vectormp[2] = MediaPlayer.create( this, R.raw.ganso);
        vectormp[3] = MediaPlayer.create( this, R.raw.got);
        vectormp[4] = MediaPlayer.create( this, R.raw.one);
        vectormp[5] = MediaPlayer.create( this, R.raw.pewds);
        vectormp[6] = MediaPlayer.create( this, R.raw.pintaron);
        vectormp[7] = MediaPlayer.create( this, R.raw.amazing);
        vectormp[8] = MediaPlayer.create( this, R.raw.angel);
        vectormp[9] = MediaPlayer.create( this, R.raw.crazy);
        vectormp[10] = MediaPlayer.create( this, R.raw.idwmat);
        vectormp[11] = MediaPlayer.create( this, R.raw.janies);
        vectormp[12] = MediaPlayer.create( this, R.raw.cryin);
        vectormp[13] = MediaPlayer.create( this, R.raw.sweet);


    }

    public void PlayPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            Toast.makeText(this, "Pausado", Toast.LENGTH_SHORT).show();
        }else{
            vectormp[posicion].start();
            Toast.makeText(this, "Reproduciendo", Toast.LENGTH_SHORT).show();
        }

    }

    public void Stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();

            vectormp[0] = MediaPlayer.create( this, R.raw.circulation);
            vectormp[1] = MediaPlayer.create( this, R.raw.cock);
            vectormp[2] = MediaPlayer.create( this, R.raw.ganso);
            vectormp[3] = MediaPlayer.create( this, R.raw.got);
            vectormp[4] = MediaPlayer.create( this, R.raw.one);
            vectormp[5] = MediaPlayer.create( this, R.raw.pewds);
            vectormp[6] = MediaPlayer.create( this, R.raw.pintaron);
            vectormp[7] = MediaPlayer.create( this, R.raw.amazing);
            vectormp[8] = MediaPlayer.create( this, R.raw.angel);
            vectormp[9] = MediaPlayer.create( this, R.raw.crazy);
            vectormp[10] = MediaPlayer.create( this, R.raw.idwmat);
            vectormp[11] = MediaPlayer.create( this, R.raw.janies);
            vectormp[12] = MediaPlayer.create( this, R.raw.cryin);
            vectormp[13] = MediaPlayer.create( this, R.raw.sweet);

        }
    }
    public void Repeat(View view){
        if(repetir==1){
            repeat.setBackgroundResource(R.drawable.no_repetir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        }else{
            repeat.setBackgroundResource(R.drawable.repetir);
            Toast.makeText(this, "Repitiendo", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }

    }
    public void Next(View view){
        if(posicion < vectormp.length -1){
            if(vectormp[posicion].isPlaying()) {
                vectormp[posicion].stop();
                posicion++;
                vectormp[posicion].start();

            }else{
                posicion++;
            }
        }else{
            Toast.makeText(this, "No hay temas.", Toast.LENGTH_SHORT).show();
        }
    }
    public void Back(View view){
        if(posicion >= 1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp[0] = MediaPlayer.create( this, R.raw.circulation);
                vectormp[1] = MediaPlayer.create( this, R.raw.cock);
                vectormp[2] = MediaPlayer.create( this, R.raw.ganso);
                vectormp[3] = MediaPlayer.create( this, R.raw.got);
                vectormp[4] = MediaPlayer.create( this, R.raw.one);
                vectormp[5] = MediaPlayer.create( this, R.raw.pewds);
                vectormp[6] = MediaPlayer.create( this, R.raw.pintaron);
                vectormp[7] = MediaPlayer.create( this, R.raw.amazing);
                vectormp[8] = MediaPlayer.create( this, R.raw.angel);
                vectormp[9] = MediaPlayer.create( this, R.raw.crazy);
                vectormp[10] = MediaPlayer.create( this, R.raw.idwmat);
                vectormp[11] = MediaPlayer.create( this, R.raw.janies);
                vectormp[12] = MediaPlayer.create( this, R.raw.cryin);
                vectormp[13] = MediaPlayer.create( this, R.raw.sweet);
                posicion--;

                vectormp[posicion].start();
            }else{
                posicion--;
            }

        }else{
            Toast.makeText(this, "No hay temas.", Toast.LENGTH_SHORT).show();
        }
    }
}
///Mariano Valle 7° "C"



