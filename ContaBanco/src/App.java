import java.security.DrbgParameters;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        
        System.err.println("Sistema bancario inicializado...");
        
        String nome;
        String agencia;
        int numero;
        Double saldo;
        Scanner scan = new Scanner (System.in).useLocale(Locale.US);
            
            System.out.println("Olá Seja bem vindo ao Banco DIO, por gentileza digite seu nome para prossegir com cadastro:");
        
        nome = scan.next();

            System.out.println("Digite sua agencia: ");

        agencia = scan.next();

            System.out.println("Digite seu numero: ");

        numero = scan.nextInt();

            System.out.println("Digite o saldo que deseja depositar: ");

        saldo = scan.nextDouble();
        
            System.out.println("Seu cadastro foi concluido com SUCESSO!!! Seus dados sao: NOME: " + nome + " " + "AGENCIA:" + agencia + " " + "NUMERO:" + numero + " " + "SALDO:" + saldo + " " + "By.. Alberth Brendon");
    }
}