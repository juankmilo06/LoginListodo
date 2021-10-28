package com.example.loginlistodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        et1 = (EditText)findViewById(R.id.num1);
        et2 = (EditText)findViewById(R.id.num2);
        tv1 = (TextView)findViewById(R.id.total);
    }

    //Metodo para el boton Anterior
    public void Anterior(View view){
        Intent lymenu = new Intent(this, menu.class);
        startActivity(lymenu);
    }

    public void multi(View view){
        String val1 = et1.getText().toString();
        String val2 = et2.getText().toString();

        float num1 = Integer.parseInt(val1);
        float num2 = Integer.parseInt(val2);

        float multiplica = num1 * num2;

        String result = String.valueOf(multiplica);
        tv1.setText(result);

    }


}
