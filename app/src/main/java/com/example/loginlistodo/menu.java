package com.example.loginlistodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //Metodo para pasar a la calculadora
    public void CalculadoraLy(View view){
        Intent lycalculadora = new Intent(this, calculadora.class);
        startActivity(lycalculadora);
    }
}

