package com.usb.appenviar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private TextView rnomtext;
    private TextView redadtext;
    private TextView resttext;
    private TextView restadotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rnomtext=findViewById(R.id.rnomtext);
        redadtext=findViewById(R.id.redadtext);
        resttext=findViewById(R.id.resttext);
        restadotext=findViewById(R.id.restadotext);
        recibir2();
    }

    public void recibir1(){

        Bundle bundle=getIntent().getBundleExtra("bundle");
        String nombre=bundle.getString("nombre");
        int edad=bundle.getInt("edad");
        double estatura=bundle.getDouble("estatura");
        boolean estado=bundle.getBoolean("estado");
        rnomtext.setText(nombre);
        redadtext.setText(String.valueOf(edad));
        resttext.setText(String.valueOf(estatura));
        restadotext.setText(String.valueOf(estado));

    }

    public void recibir2(){

        Bundle bundle=getIntent().getBundleExtra("bundle");
        Datos datos=(Datos)bundle.getSerializable("datos");
        rnomtext.setText(datos.salNombre());
        redadtext.setText(datos.salEdad());
        resttext.setText(datos.salEstatura());
        restadotext.setText(datos.salEstado());

    }
}