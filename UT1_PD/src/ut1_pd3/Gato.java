/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd3;

/**
 *
 * @author TanoW
 */
public class Gato implements Mamifero {
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

    @Override
    public void caminar() {
        System.out.println(this.nombre + 
                " empezó a caminar encima de los muebles");
    }

    @Override
    public void correr() {
        System.out.println(this.nombre + " no quiso correr");
    }

    @Override
    public void saltar() {
        System.out.println(this.nombre + " saltó hacia un estante");
    }
}
