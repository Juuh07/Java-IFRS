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
