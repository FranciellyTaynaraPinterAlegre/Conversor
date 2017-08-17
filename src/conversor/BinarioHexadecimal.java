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
public class BinarioHexadecimal extends BinarioDecimal{

    public static String converteBinarioParaHexadecimal(String binario) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;
        char caractereEncontrado = '-';

        posicaoInicial = binario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {

            posicaoInicial = ((posicaoInicial - 4) >= 0) ? posicaoInicial - 4 : 0;

            caractereEncontrado = hexa[converteBinarioParaDecimal(binario.substring(posicaoInicial, posicaoFinal))];

            sb.insert(0, caractereEncontrado);

            posicaoFinal = posicaoInicial;
        }

        return sb.toString();
    }
}
