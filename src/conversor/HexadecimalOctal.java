/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;
import conversor.DecimalOctal;
/**
 *
 * @author Francielly
 */
public class HexadecimalOctal extends HexadecimalDecimal{

    public static String converteHexadecimalParaOctal(String valorHexa) {
        int valorDecimal = converteHexadecimalParaDecimal(valorHexa);
        String valorDecimal1 = String.valueOf(valorDecimal);
        return DecimalOctal.converteDecimalParaOctal(valorDecimal1);
    }
}
