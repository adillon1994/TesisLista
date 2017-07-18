package com.alberto.tesisjunta.LOGIN;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alberto.tesisjunta.MulticamaraActivity;
import com.alberto.tesisjunta.R;

public class LoginActivity extends AppCompatActivity {

    Intent ir;
    Button boton;
    TextView registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        boton = (Button)findViewById(R.id.bLogin);
        registrar = (TextView)findViewById(R.id.tvRegisterHere) ;

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ir = new Intent(LoginActivity.this, MulticamaraActivity.class);
                startActivity(ir);

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
}
