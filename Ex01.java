//Faça um programa que receba dois números, calcule e mostre a 
//subtração do primeiro número pelo segundo.
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        int sub = (num - num2);
        System.out.println("A subtração do primeiro número pelo segundo é: " + sub);

        sc.close();
    }
}