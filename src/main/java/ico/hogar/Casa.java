/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.hogar;

import ico.diseño.Escalera;
import ico.diseño.Sala;
import ico.diseño.Ventana;

/**
 *
 * @author 90817
 */
public class Casa {
    private int numeroDeCuartos;
    private String color;
    private int numeroDeVentanas;
    private Ventana ventana;
    private Escalera escalera;
    private Sala sala;

    public Casa() {
    }

    public Casa(int numeroDeCuartos, String color, int numeroDeVentanas, Ventana ventana, Escalera escalera, Sala sala) {
        this.numeroDeCuartos = numeroDeCuartos;
        this.color = color;
        this.numeroDeVentanas = numeroDeVentanas;
        this.ventana = ventana;
        this.escalera = escalera;
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getNumeroDeCuartos() {
        return numeroDeCuartos;
    }

    public void setNumeroDeCuartos(int numeroDeCuartos) {
        this.numeroDeCuartos = numeroDeCuartos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDeVentanas() {
        return numeroDeVentanas;
    }

    public void setNumeroDeVentanas(int numeroDeVentanas) {
        this.numeroDeVentanas = numeroDeVentanas;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Escalera getEscalera() {
        return escalera;
    }

    public void setEscalera(Escalera escalera) {
        this.escalera = escalera;
    }
    
    public void habitar(){
        System.out.println("Casa habitada...");
    }
    
    public void construirCuarto(){
        System.out.println("Construyendo cuartos");
    } 
        
}



    
