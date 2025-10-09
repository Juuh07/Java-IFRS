//Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
//sabendo-se que o funcionário tem ratificação de 5% sobre o salário base (que será acrescentado ao salário) 
//e paga imposto de 7% sobre este salário (o que será descontado do salário).

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário base: ");
        double salario = sc.nextDouble();

        double gratificacao = (salario * 0.05);
        double imposto = (salario * 0.07);

        double novoSal = (salario + gratificacao) - imposto;
        System.out.println("Salário a receber: " + novoSal);

        sc.close();
    }
}
