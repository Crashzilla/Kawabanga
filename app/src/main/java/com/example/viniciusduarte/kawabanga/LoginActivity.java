package com.example.viniciusduarte.kawabanga;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viniciusduarte.kawabanga.models.Usuario;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin;
    private TextInputLayout tilPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tilLogin = (TextInputLayout) findViewById(R.id.tilLogin);
        tilPassword = (TextInputLayout) findViewById(R.id.tilPassword);
    }

    public void logar(View view) {

        String login = tilLogin.getEditText().getText().toString();
        String pass = tilPassword.getEditText().getText().toString();
        if (login.equals("fiap") && pass.equals("123")) {
            Intent intent = new Intent(this, PedidoActivity.class);
            //intent.putExtra("usuario", login);
            intent.putExtra("usuario", new Usuario(login, pass));
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuario e/ou Senha invalidos.",
                    Toast.LENGTH_LONG).show();
        }
    }
}
