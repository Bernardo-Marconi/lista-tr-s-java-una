import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    System.out.println("Exercicio quatro.");

    int soma = 0;
    int media = 0;

    for(int i = 1; i < 6; i++){
        System.out.print("Digite o " + i + "º número: ");
        int numero = scan.nextInt();
    soma+=numero;
    }

    media = soma/5;

    System.out.println("Soma: "+soma);
    System.out.println("Média: "+media);
        scan.close();
    }
}
