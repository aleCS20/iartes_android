package com.example.toast_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    private TextView meuNumero;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuNumero = (TextView) findViewById(R.id.meuNumero);
        Log.i("Debug", "Meu numero é: " + meuNumero.getText().toString());
    }

    public void imprimeMinhaMensagem(View view){
        Toast meuToast = null;
        meuToast = Toast.makeText(this, "Valor do contador e: "
            + contador, Toast.LENGTH_LONG);
        meuToast.show();
    }

    public void somaTexto(View view){
        contador++;
        Log.i("debug", "Novo valor do contador e: " + contador);
        meuNumero.setText(Integer.toString(contador));
    }
}