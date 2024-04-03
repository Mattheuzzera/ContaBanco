package terminal;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o numero da sua conta. ");
    int numero = sc.nextInt();
    System.out.print("Digite o nome do dono da conta. ");
    String nome = sc.next();
    System.out.print("Digite o saldo da conta. ");
    double saldo = sc.nextDouble();
    System.out.print("Digite a agencia da conta. ");
    String agencia = sc.next();
    System.out.print("Ola " + nome);
    System.out.print(", obrigado por criar uma conta no nosso banco, sua agencia é " + agencia);
    System.out.print(", conta " + numero);
    System.out.print(" e seu saldo " + saldo);
    System.out.print(" ja esta disponivel para saque");
  }


}