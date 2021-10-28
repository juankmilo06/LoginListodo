package com.example.loginlistodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //Metodo para pasar al menu
    public void lymenu(View view){
        Intent lymenu = new Intent(this, menu.class);
        startActivity(lymenu);
    }

}


