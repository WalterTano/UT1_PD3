/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd3;

/**
 *
 * @author TanoW
 */
public class Gato {
    private String nombre;
    
    public Gato(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void maullar() {
        System.out.println("miau");
    }
    public boolean respondeA(String unNombre) {
        return false; //NUNCA RESPONDEN!!!
    }
}
