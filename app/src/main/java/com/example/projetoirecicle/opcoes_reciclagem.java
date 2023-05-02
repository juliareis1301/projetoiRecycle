package com.example.projetoirecicle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class opcoes_reciclagem extends AppCompatActivity {
    ImageButton btnAmarelo,btnAzul,btnLaranja,btnVermelho,btnVerde,btnCinza,btnMarrom,btnRoxo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_reciclagem);
        //getSupportActionBar().hide();

        btnVermelho = (ImageButton) findViewById(R.id.btnLata);

        btnVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent plastico = new Intent(opcoes_reciclagem.this, plastico_main.class);
                startActivity(plastico);

            }
        });

        btnLaranja = (ImageButton) findViewById(R.id.btnlivro);

        btnLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toxico = new Intent(opcoes_reciclagem.this, toxico_main.class);
                startActivity(toxico);
            }
        });

        btnAmarelo = (ImageButton) findViewById(R.id.btntaca);

        btnAmarelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent metal = new Intent(opcoes_reciclagem.this, metal_main.class);
                startActivity(metal);
            }
        });

        btnAzul = (ImageButton) findViewById(R.id.btnpneu);

        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent papel = new Intent(opcoes_reciclagem.this, papel_main.class);
                startActivity(papel);
            }
        });

        btnVerde = (ImageButton) findViewById(R.id.btngarrafaplastica);

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vidro = new Intent(opcoes_reciclagem.this, vidro_main.class);
                startActivity(vidro);
            }
        });

        btnCinza = (ImageButton) findViewById(R.id.btnCinza);

        btnCinza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hospitalar = new Intent(opcoes_reciclagem.this, hospitalar_main.class);
                startActivity(hospitalar);
            }
        });

        btnRoxo = (ImageButton) findViewById(R.id.btnRoxo);

        btnRoxo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent radioativo = new Intent(opcoes_reciclagem.this, radioativo_main.class);
                startActivity(radioativo);
            }
        });

        btnMarrom = (ImageButton) findViewById(R.id.btnMarrom);

        btnMarrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent organico = new Intent(opcoes_reciclagem.this, Organic_main.class);
                startActivity(organico);
            }
        });
    }

}