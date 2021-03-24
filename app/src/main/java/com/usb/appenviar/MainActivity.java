package com.usb.appenviar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private EditText nomtext;
    private EditText edadtext;
    private EditText esttext;
    private ToggleButton btestado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomtext=findViewById(R.id.nomtext);
        edadtext=findViewById(R.id.edadtext);
        esttext=findViewById(R.id.esttext);
        btestado=findViewById(R.id.btestado);
    }

    public void enviar(View view){
        enviar3();
    }

    public void enviar1(){
        String nombre;
        int edad;
        double estatura;
        boolean estado;
        nombre=nomtext.getText().toString();
        edad=Integer.valueOf(edadtext.getText().toString());
        estatura=Double.valueOf(esttext.getText().toString());
        estado=btestado.isChecked();
        Bundle bundle=new Bundle();
        bundle.putString("nombre",nombre);
        bundle.putInt("edad",edad);
        bundle.putDouble("estatura",estatura);
        bundle.putBoolean("estado",estado);
        Intent intent=new Intent(this,PrincipalActivity.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);

    }

    public void enviar2(){

        Datos datos=new Datos(nomtext.getText().toString(),
                 edadtext.getText().toString(),
                 esttext.getText().toString(),
                 btestado.isChecked());
        Bundle bundle=new Bundle();
        bundle.putString("nombre",datos.getNombre());
        bundle.putInt("edad",datos.getEdad());
        bundle.putDouble("estatura",datos.getEstatura());
        bundle.putBoolean("estado",datos.isEstado());
        Intent intent=new Intent(this,PrincipalActivity.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);

    }

    public void enviar3(){
        Datos datos=new Datos(nomtext.getText().toString(),
                edadtext.getText().toString(),
                esttext.getText().toString(),
                btestado.isChecked());
        Bundle bundle=new Bundle();
        bundle.putSerializable("datos",datos);
        Intent intent=new Intent(this,PrincipalActivity.class);
        intent.putExtra("bundle",bundle);
        startActivity(intent);


    }
}