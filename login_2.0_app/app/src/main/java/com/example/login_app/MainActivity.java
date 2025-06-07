package com.example.login_app;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = (EditText) findViewById(R.id.name);
        passwordEditText = (EditText) findViewById(R.id.senha);
        loginButton = (Button) findViewById(R.id.buttonEntrar);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeUsuario = loginEditText.getText().toString();
                String senha = passwordEditText.getText().toString();
                String mensagem = "Olá Usuário: " + nomeUsuario + "\nSenha: " + senha;

                Toast.makeText(view.getContext(), mensagem, LENGTH_LONG).show();
            }
        });
    }
}