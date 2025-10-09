//Faça um programa que calcule e mostre a área de um triângulo. Sabe
//se que: Área = (base x altura) / 2. A base e altura devem ser informadas
//pelo usuário.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Area: " + area);

        sc.close();
    }
}
