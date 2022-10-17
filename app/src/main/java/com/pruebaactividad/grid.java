package com.pruebaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class grid extends AppCompatActivity {

    //Creacion de atributo
    private GridView grid1;

    //Creación del vector con los datos almacenados
    private String gridViewValue []  = {
            "Facebook","Instagram","Twitter","Youtube",
            "WhatsApp","SnapChat","Telegram","TikTok",
            "Messenger", "???"
    };

    //relacion de la parte lógica con la parte gráfica.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        //encontrar linea por id en este caso grid1.
        grid1 = findViewById(R.id.grid1);

        //creación del ArrayAdapter de tipo String, llamar el layout de android studio y llamar al vector.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,gridViewValue);
        grid1.setAdapter(adapter);

        //creacion del toas al ser clickeado

        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),((TextView)view).getText() + "ha sido clickeadoo", Toast.LENGTH_SHORT).show();
            }
        });
    }
//botón para atrás

    public void atras2(View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

}