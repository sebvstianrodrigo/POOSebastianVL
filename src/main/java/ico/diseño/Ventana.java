/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.diseño;

/**
 *
 * @author 90817
 */
public class Ventana {
    private float tamaño;
    private String material;
    private String marca;

    public Ventana() {
    }

    public Ventana(float tamaño, String material, String marca) {
        this.tamaño = tamaño;
        this.material = material;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void abrir(){
        System.out.println("Abriendo ventana");
    }
    
    public void cerrar(){
        System.out.println("Cerrando ventana");
    }
    
}
