import java.time.Year;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = Year.now().getValue();

        System.out.println("Seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

        int anos = (anoAtual - anoNasc);
        int meses = (anoAtual - anoNasc)*12;
        int dias = (anoAtual - anoNasc)*365;
        int semanas = (anoAtual - anoNasc)*52;

        System.out.println("Idade em anos: " + anos);
        System.out.println("Idade em meses: " + meses);
        System.out.println("Idade em dias: " + dias);
        System.out.println("Idade em semanas: " + semanas);

        sc.close();
    }
}
