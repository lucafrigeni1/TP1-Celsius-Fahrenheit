package Celsius;

import java.util.Scanner;

public class Convertisseur{
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        double aConvertir;
        double convertit;
        char rep1;
        char rep2;

        System.out.println("CONVERTISSEUR DEGRES CELSIUS - FAHRENHEIT");
        System.out.println("-----------------------------------------");

            do {

                do {
                    System.out.println("Choisissez le mode de conversion :");
                    System.out.println("1 - convertisseur Celsius - Fahrenheit");
                    System.out.println("2 - convertisseur Fahrenheit - Celsius");
                    rep1 = sc.nextLine().charAt(0);

                    if (rep1 != '1' && rep1 != '2')
                        System.out.println("erreur, recommencez.");

                } while (rep1 != '1' && rep1 != '2');


                System.out.println("Température à convertir :");
                aConvertir = sc.nextDouble();
                sc.nextLine();
                if (rep1 == '1') {
                    convertit = ((9.0/5.0) * aConvertir) + 32.0;
                    System.out.print(aConvertir + " °C correspond à : " + convertit +"F");
                }
                else {
                    convertit = ((aConvertir - 32) * 5) / 9;
                    System.out.print(aConvertir + " F correspond à : " + convertit +"°C");
                }

                do {
                    System.out.println("Souhaitez vous convertir une autre valeur ? (O/N)");
                    rep2 = sc.nextLine().charAt(0);

                } while (rep2 !='O' && rep2 !='N');

            } while (rep2 == 'O');

            System.out.println("aurevoir");

    }
}
