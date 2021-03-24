package com.usb.appenviar;

import java.io.Serializable;

public class Datos implements Serializable {

    private String nombre;
    private int edad;
    private double estatura;
    private boolean estado;

    public Datos(String nombre,String edad,String estatura,
                 boolean estado){
        this.nombre=nombre;
        this.edad=Integer.valueOf(edad);
        this.estatura=Double.valueOf(estatura);
        this.estado=estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public boolean isEstado() {
        return estado;
    }

    public String salNombre(){
        return nombre;
    }
    public String salEdad(){
        return String.valueOf(edad);
    }
    public String salEstatura(){
        return String.valueOf(estatura);
    }
    public String salEstado(){
        return String.valueOf(estado);
    }

}
