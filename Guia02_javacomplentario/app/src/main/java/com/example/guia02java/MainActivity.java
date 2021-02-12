package com.example.guia02java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView name;
   // String Nombre=getResources().getString(R.string.Name_text);
     String Nombre="Josue Samuel Rodriguez Tobias";

    String Nomsaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn1=findViewById(R.id.Btn1);
       name=findViewById(R.id.TV_1);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               name.setText(Nombre);
           }
       });

       /*Si existe una instancia, entonces busca esa instancia, mandamos a traer
       * el string y se lo asignamos a una variable y esa se la regresamos al TextView*/
       if ( savedInstanceState != null){
           Nomsaved = savedInstanceState.getString("nombre");
           name.setText(Nomsaved);
       }
    }

    /*control + o para buscar este metodo, que guarda instancias para luego ser recuperadas en el onCreate
    * guardamos la variable que contiene el nombre Nombre y le asignamos una key que sera nombre
    * con esta podremos recuperar su instancia guardada*/
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("nombre", Nombre);
    }
}