package com.carturo8824.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarContacto);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText etNombreContacto = (EditText) findViewById(R.id.etNombreContacto);
        EditText etEmailContacto = (EditText) findViewById(R.id.etEmailContacto);
        EditText etAsuntoContacto = (EditText) findViewById(R.id.etAsuntoContacto);
        EditText etMensajeContacto = (EditText) findViewById(R.id.etMensajeContacto);
        Button btEnviar = (Button) findViewById(R.id.btEnviar);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contacto.this,"Mensaje Enviado",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
