package com.example.guia03_complementario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView valor;
    Integer num;
    String numsaved;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.Btn);
        valor=findViewById(R.id.TV_1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum();
            }
        });

        num=0;
        valor.setText(String.valueOf(num));

        if ( savedInstanceState != null){
            numsaved = savedInstanceState.getString("numero");
            valor.setText(numsaved);
        }

        //if ( Integer.parseInt(String.valueOf(valor.getText())) > 9 ){
          //  valor.setText(String.valueOf(0));
       // }

    }

    public void sum(){


          if (num == 9){
               num=0;
          }
          else{
              num = Integer.parseInt(String.valueOf(valor.getText())) + 1  ;

          }
          valor.setText(String.valueOf(num));



    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("numero", String.valueOf(num));
    }
}