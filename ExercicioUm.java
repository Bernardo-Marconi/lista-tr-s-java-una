import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {

System.out.println("Exercicio um.");
    Scanner scan=new Scanner(System.in);

    double numero = -1;

while (numero < 0 || numero > 10){
System.out.println("Digite um número ente 0 e 10: ");  
numero=scan.nextInt();

if (numero < 0 || numero > 10) {
System.out.println("O número digitado é inválido!");
  }
}
System.out.println("Número informado valido: "+numero);

scan.close();

    }
}
