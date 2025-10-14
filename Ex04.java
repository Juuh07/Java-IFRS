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
