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
public class BinarioOctal extends BinarioDecimal{

    public static String converteBinarioParaOctal(String binario) {
        StringBuilder sb = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;

        
        posicaoInicial = binario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {
            
            posicaoInicial = ((posicaoInicial - 3) >= 0) ? posicaoInicial - 3 : 0;

            sb.insert(0, converteBinarioParaDecimal(binario.substring(posicaoInicial, posicaoFinal)));

            posicaoFinal = posicaoInicial;
        }

        return sb.toString();
    }
}
