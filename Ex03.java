//Faça um programa que receba três notas de um estudante, 
//calcule e mostre a média aritmética entre elas

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 01: ");
        float nota01 = sc.nextFloat();
        System.out.println("Nota 02: ");
        float nota02 = sc.nextFloat();
        System.out.println("Nota 03: ");
        float nota03 = sc.nextFloat();

        float media = (nota01 + nota02 + nota03) / 3;
        System.out.println("Media: " + media);

        sc.close();
    }
}