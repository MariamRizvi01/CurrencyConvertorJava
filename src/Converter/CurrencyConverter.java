package Converter;

import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        double amount;
        // calling indentifers currency
        double dollar, pound, euro, peso, yen;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the currency choices: ");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Pound");
        System.out.println("Enter 3: Euro");
        System.out.println("Enter 4: Yen");
        System.out.println("Enter 5: Peso");

        System.out.println("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice){
            case 1: //Dollars Conversion
                pound = amount * 0.84;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount * 0.98;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yen = amount * 136.44;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                peso = amount * 20.57;
                System.out.println(amount + " Dollar = " + f.format(peso) + " Peso");
                break;

            case 2: // Pound Conversion
                dollar = amount * 1.20;
                System.out.println(amount + " Pound = " + f.format(dollar) + " Dollar");

                euro = amount * 1.18;
                System.out.println(amount + " Pound = " + f.format(euro) + " Euro");

                yen = amount * 163.32;
                System.out.println(amount + " Pound = " + f.format(yen) + " Yen");

                peso = amount * 24.64;
                System.out.println(amount + " Pound = " + f.format(peso) + " Peso");
                break;

            case 3: //Euro Conversion
                dollar = amount * 1.02;
                System.out.println(amount + " Euro = " + f.format(dollar) + " Dollar");

                pound = amount * 0.85;
                System.out.println(amount + " Euro = " + f.format(pound) + " Pound");

                yen = amount * 138.96;
                System.out.println(amount + " Euro = " + f.format(yen) + " Yen");

                peso = amount * 20.97;
                System.out.println(amount + " Euro = " + f.format(peso) + " Peso");
                break;

            case 4: //Yen conversion
                dollar = amount * 0.007;
                System.out.println(amount + " Yen = " + f.format(dollar) + " Dollar");

                pound = amount * 0.006;
                System.out.println(amount + " Yen = " + f.format(pound) + " Pound");

                euro = amount * 0.007;
                System.out.println(amount + " Yen = " + f.format(euro) + " Euro");

                peso = amount * 0.15;
                System.out.println(amount + " Yen = " + f.format(peso) + " Peso");
                break;

            case 5: //Peso Conversion
                dollar = amount * 0.049;
                System.out.println(amount + " Peso = " + f.format(dollar) + " Dollar");

                pound = amount * 0.041;
                System.out.println(amount + " Peso = " + f.format(pound) + " Pound");

                euro = amount * 0.048;
                System.out.println(amount + " Peso = " + f.format(euro) + " Euro");

                yen = amount * 6.69;
                System.out.println(amount + "Peso = " + f.format(yen) + "Yen");
                break;

                //Create Default case
            default:
                System.out.println("Invalid Input");



                }

        }


    }


