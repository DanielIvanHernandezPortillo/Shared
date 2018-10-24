package com.example.daniel.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConsultaPreferencias extends AppCompatActivity {

    TextView txtUsuario;
    TextView txtPass;
    TextView txtTipo;
    TextView txtTipo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtUsuario=(TextView) findViewById(R.id.tvUser);
        txtPass=(TextView) findViewById(R.id.tvPass);
        txtTipo=(TextView) findViewById(R.id.tvTipo);
        txtTipo2=(TextView) findViewById(R.id.tvTipo2);

        cargarPreferencias();
    }


    public void cargarPreferencias( ) {
        SharedPreferences preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String user = preferences.getString("user", "No existe la información");
        String pass = preferences.getString("pass", "No existe la información");
        String tipo = preferences.getString("tipo", "No existe la información");



        if(tipo.equals("1")){
            txtTipo2.setText("ADMINISTRADOR");
        }
        else {
            txtTipo2.setText("USUARIO");
        }

        txtUsuario.setText(user);
        txtPass.setText(pass);
        txtTipo.setText(tipo);




    }

}
