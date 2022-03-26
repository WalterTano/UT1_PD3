/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd3;

/**
 *
 * @author TanoW
 */
public class MainMaquinaA {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais");
        firulais.ladrar();
        System.out.println(firulais.respondeA(firulais.getNombre()));
        System.out.println(firulais.respondeA("Pepe"));
    }
}
