package sv.edu.udb.guia06app_com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*Para cada Layout sus nombres son
        * Relative -> discusion_relative_layout
        * Constraint -> discusion_constraint_layout*/

        setContentView(R.layout.discusion_constraint_layout);
    }
}