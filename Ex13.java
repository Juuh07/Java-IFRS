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
