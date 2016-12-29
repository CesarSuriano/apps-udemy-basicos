package com.example.cesar.executar_musica;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button)findViewById(R.id.btnTocar);
        media = MediaPlayer.create(MainActivity.this, R.raw.musica);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (media.isPlaying()){
                    pause();
                }else{
                    tocar();
                }
            }
        });
    }

    public void pause(){
        if(media != null){
            media.pause();
            botao.setText("Tocar");
        }
    }

    public void tocar(){
        if(media != null){
            media.start();
            botao.setText("Pausar");
        }
    }

    @Override
    protected void onDestroy() {
        if(media != null && media.isPlaying()){
            media.stop();
            media.release();
            media = null;
        }

        super.onDestroy();
    }
}
