/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd2;

/**
 *
 * @author TanoW
 */
public class ContadorPalabras {
    public static int contarPalabras (String frase) {
        int contador = 0;
        boolean hayPalabra = false;
        boolean prevHayPalabra = false;
        
        for (int i = 0; i < frase.length(); i++) {
            prevHayPalabra = hayPalabra;
            hayPalabra = Character.isLetter(frase.charAt(i))
                    || (prevHayPalabra && frase.charAt(i) != ' ');
            if (!hayPalabra && prevHayPalabra) {
                contador++;
            }
        }
        if (hayPalabra) {
            contador++;
        }
        return contador;
    }
            
}
