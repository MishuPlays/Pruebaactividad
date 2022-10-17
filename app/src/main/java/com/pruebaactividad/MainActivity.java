package com.pruebaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguienteA(View view){
        Intent siguientea = new Intent(this,lis.class);
        startActivity(siguientea);
    }
    public void grids(View view){
        Intent siguienteg = new Intent(this,grid.class);
        startActivity(siguienteg);
    }
}