package conversor;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Francielly
 */
public class HexadecimalDecimal {

    public static int converteHexadecimalParaDecimal(String valorHexa) {
        int valor = 0;
        int posicaoCaractere = -1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = valorHexa.length(); i > 0; i--) {
            posicaoCaractere = Arrays.binarySearch(hexa, valorHexa.charAt(i - 1));
            valor += posicaoCaractere * Math.pow(16, (valorHexa.length() - i));
        }

        return valor;
    }
}
