package com.alberto.tesisjunta.LOGIN;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.alberto.tesisjunta.LOGIN.Conexion.Recepcion;
import com.alberto.tesisjunta.LOGIN.Controladores.Controlador;
import com.alberto.tesisjunta.MulticamaraActivity;
import com.alberto.tesisjunta.R;

public class LoginActivity extends AppCompatActivity implements Recepcion{

    Intent ir;
    Button boton;
    TextView registrar;
    EditText Username;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        boton = (Button)findViewById(R.id.bLogin);
        registrar = (TextView)findViewById(R.id.tvRegisterHere) ;
        Username = (EditText) findViewById(R.id.etUserName) ;
        Password = (EditText) findViewById(R.id.etPassword) ;
        final Recepcion interfaz = (Recepcion)this;

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Controlador.esVacio(Username)==0)&& (Controlador.esVacio(Password)==0)){
                    Controlador.password = Password.getText().toString();
                    Controlador.username = Username.getText().toString();
                    Controlador.iniciarsesion(LoginActivity.this,interfaz);

                }

            }
        });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ir = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(ir);

            }
        });



    }

    @Override
    public void Recibiendo(String datos) {

        if (datos.contains("1")){
            Controlador.perfil = datos;
            Toast.makeText(LoginActivity.this,"Bienvenido",Toast.LENGTH_LONG).show();
            ir = new Intent(LoginActivity.this, MulticamaraActivity.class);
            startActivity(ir);


        }else if (datos.contains("0")) {
            Toast.makeText(LoginActivity.this,"Usuario o contrasena incorrecta",Toast.LENGTH_LONG).show();


        }else {
            Toast.makeText(LoginActivity.this,"Error de Conexion con servidor",Toast.LENGTH_LONG).show();

        }

    }
}
