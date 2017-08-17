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
public class DecimalOctal {

    public static String converteDecimalParaOctal(String valor1) {
        int valor = Integer.parseInt(valor1);
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        while (valor > 0) {
            resto = valor % 8;
            valor = valor / 8;
            sb.insert(0, resto);
        }

        return sb.toString();
    }
}
