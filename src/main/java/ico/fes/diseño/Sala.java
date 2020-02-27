/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.diseño;

/**
 *
 * @author 90817
 */
public class Sala {
    private int cantidadDeSillones;
    private int cantidadDeMuebles;
    private String material;

    public Sala() {
    }

    public Sala(int cantidadDeSillones, int cantidadDeMuebles, String material) {
        this.cantidadDeSillones = cantidadDeSillones;
        this.cantidadDeMuebles = cantidadDeMuebles;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidadDeSillones() {
        return cantidadDeSillones;
    }

    public void setCantidadDeSillones(int cantidadDeSillones) {
        this.cantidadDeSillones = cantidadDeSillones;
    }

    public int getCantidadDeMuebles() {
        return cantidadDeMuebles;
    }

    public void setCantidadDeMuebles(int cantidadDeMuebles) {
        this.cantidadDeMuebles = cantidadDeMuebles;
    }
    
    public void descansar(){
        System.out.println("Descansando en la sala");
    }
    
    public void ocupar(){
        System.out.println("Ocupando sala");
    }
    
}
