import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Exercicio seis.");
        
            System.out.println("Digite o primeiro número: ");
            int primeiroNumero = scan.nextInt();

            System.out.println("Digite o segundo número: ");
            int segundoNumero = scan.nextInt();

int menorNumero = Math.min(primeiroNumero,segundoNumero);
int maiorNumero = Math.max(primeiroNumero,segundoNumero);

        System.out.println("Os números que estão no intervalo entre o primeiro e o segundo número são: ");
            for(menorNumero=menorNumero+1;menorNumero<maiorNumero;menorNumero++){
                System.out.println(menorNumero);
            scan.close();
        }     
    }
}
