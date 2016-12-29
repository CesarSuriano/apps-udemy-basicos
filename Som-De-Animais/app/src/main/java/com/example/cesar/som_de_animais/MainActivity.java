package com.example.cesar.som_de_animais;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgCao;
    private ImageView imgGato;
    private ImageView imgLeao;
    private ImageView imgMacaco;
    private ImageView imgOvelha;
    private ImageView imgVaca;

    private MediaPlayer mediaCao;
    private MediaPlayer mediaGato;
    private MediaPlayer mediaLeao;
    private MediaPlayer mediaMacaco;
    private MediaPlayer mediaOvelha;
    private MediaPlayer mediaVaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCao = (ImageView)findViewById(R.id.imgCao);
        imgGato = (ImageView)findViewById(R.id.imgGato);
        imgLeao = (ImageView)findViewById(R.id.imgLeao);
        imgMacaco = (ImageView)findViewById(R.id.imgMacaco);
        imgOvelha = (ImageView)findViewById(R.id.imgOvelha);
        imgVaca = (ImageView)findViewById(R.id.imgVaca);

        mediaCao = MediaPlayer.create(MainActivity.this, R.raw.cao);
        mediaGato = MediaPlayer.create(MainActivity.this, R.raw.gato);
        mediaLeao = MediaPlayer.create(MainActivity.this, R.raw.leao);
        mediaMacaco = MediaPlayer.create(MainActivity.this, R.raw.macaco);
        mediaOvelha = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
        mediaVaca = MediaPlayer.create(MainActivity.this, R.raw.vaca);

        imgCao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaCao.start();
            }
        });

        imgGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaGato.start();
            }
        });

        imgVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaVaca.start();
            }
        });

        imgMacaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaMacaco.start();
            }
        });

        imgOvelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaOvelha.start();
            }
        });

        imgLeao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaLeao.start();
            }
        });
    }
}
