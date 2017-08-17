/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import conversor.DecimalHexadecimal;

/**
 *
 * @author Francielly
 */
public class OctalHexadecimal extends OctalDecimal {

    public static String converteOctalParaHexadecimal(String valorOctal) {
        int valorDecimal = converteOctalParaDecimal(valorOctal);
        String valorDecimal1 = String.valueOf(valorDecimal);
        return DecimalHexadecimal.converteDecimalParaHexadecimal(valorDecimal1);
    }
}
