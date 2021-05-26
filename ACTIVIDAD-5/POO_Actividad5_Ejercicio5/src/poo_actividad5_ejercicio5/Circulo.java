/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_actividad5_ejercicio5;

/**
 *
 * @author Santy
 */
public class Circulo {

    static final double PI = 3.14;
    double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return (this.radio * this.radio * PI);
    }

    public double getLongitud() {
        return (this.radio * 2 * PI);
    }
}
