//Faça um programa que receba três notas e seus respectivos pesos,
//calcule e mostre a média ponderada dessas notas.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 01: ");
        float nota1 = sc.nextFloat();
        System.out.println("Peso: ");
        int peso1 = sc.nextInt();

        System.out.println("Nota 02: ");
        float nota2 = sc.nextFloat();
        System.out.println("Peso: ");
        int peso2 = sc.nextInt();

        System.out.println("Nota 03: ");
        float nota3 = sc.nextFloat();
        System.out.println("Peso: ");
        int peso3 = sc.nextInt();

        int somaPesos = (peso1 + peso2 + peso3);
        float media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/somaPesos;

        System.out.println("Media: " + media);

        sc.close();
    }
}