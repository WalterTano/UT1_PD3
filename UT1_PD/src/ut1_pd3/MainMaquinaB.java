/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd3;

/**
 *
 * @author TanoW
 */
public class MainMaquinaB {
    public static void main(String[] args) {
        Gato garfield = new Gato("Garfield");
        garfield.maullar();
        System.out.println(garfield.respondeA(garfield.getNombre()));
        System.out.println(garfield.respondeA("Pepe"));
    }
}
