package com.example.projetoirecicle;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemReciclagem) {
            Intent intent = new Intent(MainActivity.this, opcoes_reciclagem.class);
            startActivity(intent);

            return true;

        } else if (id == R.id.itemReutilizacao) {
            Intent intent = new Intent(MainActivity.this, reutilizacao.class);
            startActivity(intent);
        } 
        return super.onOptionsItemSelected(item);
    }

}