/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Francielly
 */
public class OctalDecimal {

    public static int converteOctalParaDecimal(String valorOctal) {
        int valor = 0;

        for (int i = valorOctal.length(); i > 0; i--) {
            valor += Integer.parseInt(valorOctal.charAt(i - 1) + "") * Math.pow(8, (valorOctal.length() - i));
        }

        return valor;
    }
}
