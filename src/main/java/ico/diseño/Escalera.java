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
public class Escalera {
    private float medida;
    private int escalones;
    private String material;

    public Escalera() {
    }

    public Escalera(float medida, int escalones, String material) {
        this.medida = medida;
        this.escalones = escalones;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public int getEscalones() {
        return escalones;
    }

    public void setEscalones(int escalones) {
        this.escalones = escalones;
    }
    
    public void ascender(){
        System.out.println("Subiendo escaleras");
    }
    
    public void descender(){
        System.out.println("Descendiendo escalera");
    }
    
}
