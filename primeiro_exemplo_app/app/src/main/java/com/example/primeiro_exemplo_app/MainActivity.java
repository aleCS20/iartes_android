package com.example.primeiro_exemplo_app;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private String meuNome = "Alessandro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloUser);
        String aux = helloText.getText().toString();
        aux = aux.replace("user", meuNome);
        helloText.setText(aux);

        Log.i("Debug", "User Name Alterado com Sucesso!!! ");
    }
}