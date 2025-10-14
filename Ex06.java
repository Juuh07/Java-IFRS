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
