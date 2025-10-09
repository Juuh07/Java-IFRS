//Um funcionário recebe um salário fixo mais 4% de comissão sobre as
//vendas (4% do valor das vendas efetuadas pelo funcionário). Faça um
//programa que receba o salário fixo do funcionário e o valor de suas
//vendas, calcule e mostre a comissão e seu salário final.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        System.out.println("Valor das vendas: ");
        double valorVendas = sc.nextDouble();

        double comissao = (valorVendas*0.04);
        double total = (comissao + salario);

        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final: " + total);

        sc.close();
    }
}
