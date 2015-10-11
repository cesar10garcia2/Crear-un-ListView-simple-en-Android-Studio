package com.crearunalistasimple.cesargarcia.crearunalistasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Definimos el ListView
    private ListView listView;
    //Elementos que se mostraran en el listview
    private String lenguajeProgramacion[]=new String[]{"Java","PHP","Python","JavaScript","Ruby","C",
    "C++","C#","Go","Perl","Pascal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectamos miLista a mi ListView
        listView = (ListView) findViewById(R.id.miLista);

        //Declaramos el Array Adactes,le pasamos el contexto, le indicamos para que tenga
        // una simple_expandable_list_item_1 y le damos nuestro Array de String
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, lenguajeProgramacion);

        //Le asignamos el adacter al listView
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /// Obtiene el valor de la casilla elegida
                String itemSeleccionado = parent.getItemAtPosition(position).toString();

                // muestra un mensaje
                Toast.makeText(getApplicationContext(), "El lenguaje seleccionado es: " +
                        itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
