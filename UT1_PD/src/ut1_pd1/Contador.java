/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd1;

/**
 *
 * @author TanoW
 */
public class Contador {
    public final int MAX_CONT = 50;
    public int contador = 1;
    public int incremento = 1;
    
    public void mostrarContador() {
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
        // Este método no reinicia contador.
    }
    
    public void mostrarContadorDoWhile() {
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
        // Este método no reinicia contador.
    }
    
    public void mostrarContadorFor() {
        for (;contador <= MAX_CONT; contador += incremento) {
            System.out.println(contador);
        }
        // Este método no reinicia contador.
    }
}
