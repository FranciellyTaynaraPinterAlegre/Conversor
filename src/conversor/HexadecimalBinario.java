/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.Arrays;

/**
 *
 * @author Francielly
 */
public class HexadecimalBinario extends DecimalBinario {

    public static String converteHexadecimalParaBinario(String valorHexa) {
        int posicao = 0;
        int posicaoArrayHexa = -1;
        StringBuilder sb = new StringBuilder();
        String valorConvertidoParaBinario = null;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        while (posicao < valorHexa.length()) {

            posicaoArrayHexa = Arrays.binarySearch(hexa, valorHexa.charAt(posicao));
            String posicaoArrayHexa1 = String.valueOf(posicaoArrayHexa);
            valorConvertidoParaBinario = converteDecimalParaBinario(posicaoArrayHexa1);

            if (valorConvertidoParaBinario.length() != 4 && posicao > 0) {
                for (int i = 0; i < (4 - valorConvertidoParaBinario.length()); i++) {
                    sb.append("0");
                }
            }

            sb.append(valorConvertidoParaBinario);
            posicao++;
        }
        return sb.toString();
    }
}
