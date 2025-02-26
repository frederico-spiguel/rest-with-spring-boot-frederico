package br.com.frederico.request.converters;

import br.com.frederico.exception.UnsupportedMathOperationException;

public class NumberConverter {
    public static Double convertToDouble(String strNumber)throws Exception{
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",",".");
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
