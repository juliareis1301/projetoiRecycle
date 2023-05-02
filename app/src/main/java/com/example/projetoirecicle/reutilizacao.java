package com.example.projetoirecicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class reutilizacao extends AppCompatActivity {

    ImageButton btnpneu,btnlivro,btntaca,btngarrafaplastica,btnLata,btneletronicos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reutilizacao);

        btnpneu = (ImageButton) findViewById(R.id.btnpneu);

        btnpneu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent pneu = new Intent(reutilizacao.this, reutilizacao_pneu.class);
                startActivity(pneu);

            }
        });

        btnlivro = (ImageButton) findViewById(R.id.btnlivro);

        btnlivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent papel = new Intent(reutilizacao.this, reutilizacao_papel.class);
                startActivity(papel);

            }
        });

        btntaca = (ImageButton) findViewById(R.id.btntaca);

        btntaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent vidro = new Intent(reutilizacao.this, reutilizacao_vidro.class);
                startActivity(vidro);

            }
        });

        btngarrafaplastica = (ImageButton) findViewById(R.id.btngarrafaplastica);

        btngarrafaplastica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent plastico = new Intent(reutilizacao.this, reutilizacao_plastico.class);
                startActivity(plastico);

            }
        });

        btnLata = (ImageButton) findViewById(R.id.btnLata);

        btnLata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent lata= new Intent(reutilizacao.this, reutilizacao_aluminio.class);
                startActivity(lata);

            }
        });

        btneletronicos = (ImageButton) findViewById(R.id.btneletronicos);

        btneletronicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent eletronico= new Intent(reutilizacao.this, reutilizacao_eletronico.class);
                startActivity(eletronico);

            }
        });
    }
}