/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd3;

/**
 *
 * @author TanoW
 */
public class Perro implements Mamifero {
    private String nombre;
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void ladrar() {
        System.out.println("wof");
    }
    public boolean respondeA(String unNombre) {
        return this.nombre.equals(unNombre);
    }

    @Override
    public void caminar() {
        System.out.println(this.nombre + " empezó a caminar");
    }

    @Override
    public void correr() {
        System.out.println(this.nombre + " empezó a correr");
    }

    @Override
    public void saltar() {
        System.out.println(this.nombre + " saltó");
    }
}
