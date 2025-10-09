//Sabe-se que o quilowatt de energia custa um quinto do salário mínimo.
//Faça um programa que receba o valor do salário mínimo e a quantidade
//de quilowatts consumida por uma residência, calcule e mostre:
//a. o valor de cada quilowatt;
//b. o valor a ser pago por essa residência;
//c. o valor a ser pago com desconto de 15%.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário mínimo: ");
        double salario = sc.nextDouble();
        System.out.println("Quantidade de quilowatts: ");
        double quilowatt = sc.nextDouble();

        double valorQuilowatt = salario/5;
        double valorPago = quilowatt * valorQuilowatt;
        double valorDesconto = valorPago*0.85;

        System.out.println("Valor de cada quilowatts: " + valorQuilowatt);
        System.out.println("Valor a ser pago: " + valorPago);
        System.out.println("Valor a ser pago com desconto de 15%: " + valorDesconto);

        sc.close();
    }
}
