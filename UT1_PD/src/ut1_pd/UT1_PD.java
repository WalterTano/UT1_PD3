/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd;

import ut1_pd1.Contador;
import ut1_pd1.Multsuma;

/**
 *
 * @author TanoW
 */
public class UT1_PD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test multsuma
        Multsuma.multsuma(1.0, 2.0, 3.0);   // Imprime 5.0
        System.out.println(recorrer("Prueba"));
        System.out.println(getValor());
        System.out.println(getPrimerCaracter("Prueba"));
        System.out.println(paraAString(5));
        
        Contador contador = new Contador();
        contador.mostrarContador();
        contador.contador = 1;
        contador.mostrarContadorDoWhile();
        contador.contador = 1;
        contador.mostrarContadorFor();
    }

    // UT1_PD1 =================================================================
    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        if (palabra != null) {
            return palabra.charAt(0);
        }
        return ' ';
    }

    public static String paraAString(int a) {
        Object x1 = new Integer(a);
        return String.valueOf(x1);
    }
    // UT1_PD1 =================================================================
}
