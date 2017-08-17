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
public class DecimalHexadecimal {

    public static String converteDecimalParaHexadecimal(String valor1) {
        int valor = Integer.parseInt(valor1);
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        while (valor > 0) {
            resto = valor % 16;
            valor = valor / 16;
            sb.insert(0, hexa[resto]);
        }

        return sb.toString();
    }
}
