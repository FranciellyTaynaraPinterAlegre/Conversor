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
public class BinarioDecimal {

    public static int converteBinarioParaDecimal(String valorBinario) {
        int valor = 0;

        for (int i = valorBinario.length(); i > 0; i--) {
            valor += Integer.parseInt(valorBinario.charAt(i - 1) + "") * Math.pow(2, (valorBinario.length() - i));
        }

        return valor;
    }
}
