package com.example.regibici;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BicicletasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicicletas);
    }

    //Método para cambiar boton
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, RegistrarBiciActivity2.class);
        startActivity(siguiente );
    }



    }







