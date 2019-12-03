/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.currencycunversion;

import static assignment1.currencycunversion.CurrencyConverter.convert;
import java.util.Scanner;

/**
 *
 * @author shi
 */
public class CurrencyConverterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner method for taking currency from keynoard
        Scanner input = new Scanner(System.in);
        //used Scanner method for getting input from user
        System.out.println(  "                       Currency Conversion Program" );
        System.out.print("Enter currency in hand (USD | CAD | EURO | GBP):    ");
        String currencyInHand = input.nextLine();
        
        System.out.print("Enter currency required (USD | CAD | EURO | GBP):  ");
        String currencyRequired = input.nextLine();
        CurrencyConverter.printString(currencyInHand.toUpperCase(), currencyRequired.toUpperCase());
        // print currencyRequired and currencyInHand and getting input from user
        System.out.print("Enter the " + currencyInHand.toUpperCase() + " amount to convert to " + currencyRequired.toUpperCase() + ":");
        double amount = input.nextDouble();
      //  getting amount from user and convert with this method
      CurrencyConverter.convert(currencyInHand, currencyRequired, amount);
       System.out.printf("%.0f %s is equal to %.2f %s" , 
         amount ,currencyInHand.toUpperCase(), convert(currencyInHand.toUpperCase(), currencyRequired.toUpperCase(), amount), currencyRequired.toUpperCase());
    

    }

}
