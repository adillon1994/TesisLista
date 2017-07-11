package com.alberto.tesisjunta.LOGIN;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alberto.tesisjunta.MulticamaraActivity;
import com.alberto.tesisjunta.R;

public class LoginActivity extends AppCompatActivity {

    Intent ir;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        boton = (Button)findViewById(R.id.bLogin);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ir = new Intent(LoginActivity.this, MulticamaraActivity.class);
                startActivity(ir);

            }
        });



    }
}
