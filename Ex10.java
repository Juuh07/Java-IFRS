//Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
//a. polegadas;
//b. jardas;
//c. milhas.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Medida em pés: ");
        double pes = sc.nextDouble();

        double polegadas = (pes*12);
        double jarda = (pes/3);
        double milha = (pes/5280);

        System.out.println("Polegadas: " + polegadas);
        System.out.println("Jardas: " + jarda);
        System.out.println("Milhas: " + milha);

        sc.close();
    }
}
