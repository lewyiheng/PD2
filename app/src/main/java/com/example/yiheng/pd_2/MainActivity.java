package com.example.yiheng.pd_2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout ahri;
    LinearLayout akali;
    LinearLayout aatrox;
    LinearLayout alistar;
    LinearLayout amumu;
    LinearLayout anivia;
    LinearLayout aoshin;
    LinearLayout azir;
    LinearLayout bard;
    LinearLayout blitz;
    LinearLayout braum;
    LinearLayout cait;
    LinearLayout camille;
    LinearLayout cass;
    LinearLayout cho;
    Button info,jungle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ahri = findViewById(R.id.ahri);
        akali = findViewById(R.id.akali);
        aatrox = findViewById(R.id.aatrox);
        alistar = findViewById(R.id.alistar);
        amumu = findViewById(R.id.amumu);
        anivia = findViewById(R.id.anivia);
        aoshin = findViewById(R.id.aoshin);
        azir = findViewById(R.id.azir);
        bard = findViewById(R.id.bard);
        blitz = findViewById(R.id.blitz);
        braum = findViewById(R.id.braum);
        cait = findViewById(R.id.cait);
        camille = findViewById(R.id.camille);
        cass = findViewById(R.id.cass);
        cho = findViewById(R.id.cho);
        info = findViewById(R.id.info);
        jungle = findViewById(R.id.jg);




        ahri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.ahri.class);
                startActivity(intent);

            }
        });

        akali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.akali.class);
                startActivity(intent);
            }
        });

        aatrox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.aatrox.class);
                startActivity(intent);
            }
        });

        alistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.alistar.class);
                startActivity(intent);
            }
        });

        amumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.amumu.class);
                startActivity(intent);
            }
        });

        anivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.anivia.class);
                startActivity(intent);
            }
        });

        aoshin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        azir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        bard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        blitz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        braum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        cait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        camille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        cass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });

        cho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.empty.class);
                startActivity(intent);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.info.class);
                startActivity(intent);
            }
        });
        jungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.yiheng.pd_2.jungle.class);
                startActivity(intent);
            }
        });

    }

}
