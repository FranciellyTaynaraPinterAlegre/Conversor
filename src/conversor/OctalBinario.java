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
public class OctalBinario extends DecimalBinario {

    public static String converteOctalParaBinario(String valorOctal) {
        int posicao = 0;
        StringBuilder sb = new StringBuilder();
        String valorConvertidoParaBinario = null;

        while (posicao < valorOctal.length()) {
            valorConvertidoParaBinario = converteDecimalParaBinario(valorOctal.charAt(posicao) + "");

            if (valorConvertidoParaBinario.length() != 3 && posicao > 0) {
                for (int i = 0; i < (3 - valorConvertidoParaBinario.length()); i++) {
                    sb.append("0");
                }
            }

            sb.append(valorConvertidoParaBinario);
            posicao++;
        }

        return sb.toString();
    }

}
