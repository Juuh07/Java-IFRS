//Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, 
//calcule e mostre o salário a receber seguindo estas regras:
//a. a hora trabalhada vale um décimo do salário mínimo;
//b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//c. o imposto equivale a 3% do salário bruto;
//d. o salário a receber equivale ao salário bruto menos o imposto.
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Salário mínimo: ");
        double salario =  sc.nextDouble();

        double valorHora = salario/10;
        double salarioBruto = horasTrabalhadas*valorHora;
        double imposto = salarioBruto*0.03;
        double salarioareceber = salarioBruto-imposto;

        System.out.println("Valor hora: " + valorHora);
        System.out.println("Slário bruto: " + salarioBruto);
        System.out.println("Imposto (3%): " + imposto);
        System.out.println("Salário a receber: " +  salarioareceber);
    }
}
