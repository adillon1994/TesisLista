package com.alberto.tesisjunta.LOGIN;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alberto.tesisjunta.LOGIN.Conexion.Recepcion;
import com.alberto.tesisjunta.LOGIN.Conexion.Transaccion;
import com.alberto.tesisjunta.LOGIN.Controladores.Controlador;
import com.alberto.tesisjunta.MulticamaraActivity;
import com.alberto.tesisjunta.R;

import retrofit2.Call;

public class RegisterActivity extends AppCompatActivity implements Recepcion {

    Button registrar;
    Intent ir;
    Button volver;
    EditText name;
    EditText Username;
    EditText mail;
    EditText password;
    EditText Aged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registrar = (Button)findViewById(R.id.bRegister);
        volver = (Button)findViewById(R.id.bBack);
        name = (EditText)findViewById(R.id.etName);
        Username = (EditText)findViewById(R.id.etUserName);
        password = (EditText)findViewById(R.id.etPassword);
        Aged = (EditText)findViewById(R.id.etAged);
        mail = (EditText)findViewById(R.id.etMail);

        final Recepcion interfaz = (Recepcion)this;


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Controlador.esVacio(name)==0)&&(Controlador.esVacio(Username)==0) &&
                        (Controlador.esVacio(mail)==0) && (Controlador.esVacio(Aged)==0) && (Controlador.esVacio(password)==0))
                {
                    System.out.println("Pasa validacion");
                    Controlador.username = Username.getText().toString();
                    Controlador.name = name.getText().toString();
                    Controlador.aged = Aged.getText().toString();
                    Controlador.email = mail.getText().toString();
                    Controlador.password = password.getText().toString();
                    Controlador.registrarusuario(RegisterActivity.this,interfaz);

                }




            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ir = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(ir);
            }
        });

    }

    @Override
    public void Recibiendo(String datos){

        if (datos.contains("1")){
            Toast.makeText(RegisterActivity.this,"Registro Exitoso",Toast.LENGTH_LONG).show();
            ir = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(ir);


        }else if (datos.contains("0")) {
            Toast.makeText(RegisterActivity.this,"Usuario o Correo Repetido",Toast.LENGTH_LONG).show();


        }else {
            Toast.makeText(RegisterActivity.this,"Error de Conexion con servidor",Toast.LENGTH_LONG).show();

        }



    }
}
