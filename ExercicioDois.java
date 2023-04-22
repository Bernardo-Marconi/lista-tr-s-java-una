import java.util.Scanner;	
	
public class ExercicioDois {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        String usuario, senha;
		do {
			System.out.println("Insira o nome do usuário: ");
			usuario = scan.nextLine();

			System.out.println("Insira sua senha: ");
			senha = scan.nextLine();	

			if(senha.equals(usuario))
				System.out.println("Nome de usuário e a senha não podem ser iguais! Digite novamente:");

		}while(senha.equals(usuario));
		System.out.println("Usuário e senha cadastrada!");
		scan.close();
	}
}
