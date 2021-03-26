package sv.edu.udb.guia08app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import sv.edu.udb.guia08app.datos.Persona;

public class AddPersonaActivity extends AppCompatActivity {
    EditText edtDUI, edtNombre, edtGenero, edtFecha, edtPeso, edtAltura;
    String key="",nombre="",dui="",accion="", genero="", fecha_nacimiento="", peso="", altura="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_persona);
        inicializar();
    }

    private void inicializar() {
        edtNombre = findViewById(R.id.edtNombre);
        edtDUI = findViewById(R.id.edtDUI);
        edtGenero = findViewById(R.id.edtGenero);
        edtFecha = findViewById(R.id.edtFecha);
        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);


        // Obtención de datos que envia actividad anterior
        Bundle datos = getIntent().getExtras();
        key = datos.getString("key");
        dui = datos.getString("dui");
        nombre=datos.getString("nombre");
        genero=datos.getString("genero");
        fecha_nacimiento=datos.getString("fecha_nacimiento");
        peso=datos.getString("peso");
        altura=datos.getString("altura");
        accion=datos.getString("accion");
        edtDUI.setText(dui);
        edtNombre.setText(nombre);
        edtGenero.setText(genero);
        edtFecha.setText(fecha_nacimiento);
        edtPeso.setText(peso);
        edtAltura.setText(altura);
    }

    public void guardar(View v){
        String nombre = edtNombre.getText().toString();
        String dui = edtDUI.getText().toString();
        String genero = edtGenero.getText().toString();
        String fecha = edtFecha.getText().toString();
        String peso = edtPeso.getText().toString();
        String altura = edtAltura.getText().toString();

        // Se forma objeto persona
        Persona persona = new Persona(dui,nombre, genero, fecha, peso, altura);

        if (accion.equals("a")) { //Agregar usando push()
            PersonasActivity.refPersonas.push().setValue(persona);
        }
        else // Editar usando setValue
        {
            PersonasActivity.refPersonas.child(key).setValue(persona);
        }
        finish();
    }
    public void cancelar(View v){
        finish();
    }
}