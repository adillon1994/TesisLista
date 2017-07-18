package com.alberto.tesisjunta.LOGIN;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alberto.tesisjunta.MulticamaraActivity;
import com.alberto.tesisjunta.R;

public class RegisterActivity extends AppCompatActivity {

    Button registrar;
    Intent ir;
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registrar = (Button)findViewById(R.id.bRegister);
        volver = (Button)findViewById(R.id.bBack);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ir = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(ir);
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
}
