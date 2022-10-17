package com.pruebaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class lis extends AppCompatActivity {

    private TextView tv2;
    private ListView lv1;
    private String nombres [] = {"Benja", "Fran", "Juan", "Felipe", "Andrea"};
    private String profesion [] = {"Psicologo", "Médico","Profesor", "Ingeniero","Enfermera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lis);

        tv2=(TextView)findViewById(R.id.tv2);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_nombre,nombres);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv2.setText("La profesión de: " + lv1.getItemAtPosition(i) + "es" + profesion[i]);
            }

        });
    }

    public void atras(View view){
        Intent atra = new Intent(this, MainActivity.class);
        startActivity(atra);
    }
}