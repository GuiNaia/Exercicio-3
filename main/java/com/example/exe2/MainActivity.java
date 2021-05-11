package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txt1;
    EditText txt2;
    TextView resultado;

    public void botao(View view) {

        txt1 = findViewById(R.id.txtnome1);
        txt2 = findViewById(R.id.txtnome2);


        String string1 = txt1.getText().toString();
        String string2 = txt2.getText().toString();
        String string3 = string1 + " " + string2;

        if(string1.isEmpty() || string2.isEmpty()){
            Toast.makeText(MainActivity.this,"Nome não inserido",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(MainActivity.this,"Olá " + string3 ,Toast.LENGTH_LONG).show();
        }
    }
}