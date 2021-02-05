package com.example.segundaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tv_user=findViewById<TextView>(R.id.TV_user)
        val boton=findViewById<Button>(R.id.button)

        boton.setOnClickListener(View.OnClickListener {
            tv_user.text= "Josue Samuel Rodriguez Tobias"
        })
    }

   // var tv_name=findViewById<TextView>(R.id.TV_name)





}