//Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
//sabendo-se que este sofreu um desconto de 10%.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        double npreco = preco - (preco * 0.1);
        System.out.println("Novo preço: " + npreco);

        sc.close();
    }
}
