/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
package assignment1.currencycunversion;
import java.util.Scanner;

/**
 *
 * @author shi
 */
public class CurrencyConverter {
// There are three constant values
    public static final double RATE_EURO_TO_USD = 1.124;
    public static final double RATE_CAD_TO_USD = 0.8;
    public static final double RATE_GBP_TO_USD = 1.296;

    public static double getRate(String currencyInHand, String currencyRequired) {
        // getRate of currency by this method ,currenyInHand means currency in the hand and currencyRequired means currency needed
        if (currencyInHand.equals("USD")) {
            if (currencyRequired.equals("USD")) {
                return 1;
            } else if (currencyRequired.equals("EURO")) {
                return 1 / RATE_EURO_TO_USD;
            } else if (currencyRequired.equals("CAD")) {
                return 1 / RATE_CAD_TO_USD;
            } else {
                return 1 / RATE_GBP_TO_USD;
            }
        } else if (currencyInHand.equals("EURO")) {
            if (currencyRequired.equals("GBP")) {
                return RATE_EURO_TO_USD / RATE_GBP_TO_USD;
            } else if (currencyRequired.equals("CAD")) {
                return RATE_EURO_TO_USD / RATE_CAD_TO_USD;
            } else if (currencyRequired.equals("USD")) {
                return RATE_EURO_TO_USD;
            } else {
                return 1;
            }
        } else if (currencyInHand.equals("CAD")) {
            if (currencyRequired.equals("EURO")) {
                return RATE_CAD_TO_USD / RATE_EURO_TO_USD;
            } else if (currencyRequired.equals("GBP")) {
                return RATE_CAD_TO_USD / RATE_GBP_TO_USD;
            } else if (currencyRequired.equals("USD")) {
                return RATE_CAD_TO_USD;
            } else {
                return 1;
            }
        } else {
            if (currencyRequired.equals("EURO")) {
                return RATE_GBP_TO_USD / RATE_EURO_TO_USD;
            } else if (currencyRequired.equals("CAD")) {
                return RATE_GBP_TO_USD / RATE_CAD_TO_USD;

            } else if (currencyRequired.equals("USD")) {
                return RATE_GBP_TO_USD;
            } else {
                return 1;
            }
        }
    }

    public static double convert(String currencyInHand, String currencyRequired, double amount) {
        // this is the method to convert the currency
        return amount * getRate(currencyInHand, currencyRequired);

    }

    public static void printString(String currencyInHand, String currencyRequired) {
        //method for printing Symbol and string of currency
        char currencySymbol = '$';
        if (currencyInHand.equals("EURO")) {
            currencySymbol = '\u00a3';
        } else if (currencyInHand.equals("GBP")) {
            currencySymbol = '\u20ac';
        }
        String currencyRequiredString = "US doller";

        if (currencyRequired.equals("EURO")) {
            currencyRequiredString = "euros";
        } else if (currencyRequired.equals("GBP")) {
            currencyRequiredString = "pounds";
        } else if (currencyRequired.equals("CAD")) {
            currencyRequiredString = "canadian doller";
        }
        // printing values in round off by printf method
        System.out.printf("Exchange rate: One %s (%c) = %.3f %s\n",
                currencyInHand, currencySymbol, getRate(currencyInHand.toUpperCase(), currencyRequired.toUpperCase()), currencyRequiredString);
    }

}
