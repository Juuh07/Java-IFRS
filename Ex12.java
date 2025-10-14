import java.util.Scanner;

public class Ex12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço de fábrica: ");
        double preco = sc.nextDouble();
        System.out.println("Percentual de lucro: ");
        double plucro = sc.nextDouble();
        System.out.println("Percentual de imposto: ");
        double pimposto = sc.nextDouble();

        double lucro = (preco * plucro)/100;
        double imposto = (preco * pimposto)/100;
        double precofinal = preco + imposto + lucro;

        System.out.println("Lucro: " + lucro);
        System.out.println("Imposto: " + imposto);
        System.out.println("Preço final: "  + precofinal);

        sc.close();
    }
}
