//Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo. 

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int divisao = num1 / num2;
        System.out.println("O resultado da divisão é: " + divisao);

        sc.close();
    }
}