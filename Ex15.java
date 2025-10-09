//Faça um programa que receba uma temperatura em Celsius, 
//calcule e mostre essa temperatura em Fahrenheit.

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double farenheit = ((9*celsius)/5) + 32;

        System.out.println("Temperatura em Farenheit: " + farenheit);
    }
}
