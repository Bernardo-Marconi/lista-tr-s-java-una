import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Exercicio sete.");
            
            int pares = 0;
            int impares = 0;
                     
        for( int i = 0;i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = scan.nextInt();

            if(numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        
        System.out.println("quantidade de números pares: "+pares);
        System.out.println("quantidade de números impares: "+impares);

        scan.close();
    }
}
