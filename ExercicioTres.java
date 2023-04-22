import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número três. ");

        String nome,sexo,estadoCivil;
        int idade;
        double salario;

    System.out.println("Digite seu nome: ");
    nome = scan.nextLine();

while (nome.length()<3){
    System.out.println("O nome deve ser maior que 3 caracteres! ");
    System.out.println("Digite seu nome novamente: ");
    nome = scan.nextLine();
}
    System.out.printf("Nome: %s. Salvo com sucesso!",nome);

    System.out.println("\nDIgite sua idade: ");
    idade = scan.nextInt();

while(idade<0 || idade>150){
    System.out.println("A idade deve ser entre 0 e 150! ");
    System.out.println("Digite a sua idade novamente: ");
    idade = scan.nextInt();
}
    System.out.printf("Sua idade: (%d anos) foi salva! ",idade);

    System.out.println("\nDigite seu salário: ");
    salario = scan.nextDouble();

while(salario<0){
    System.out.println("O salário deve ser maior que zero!");
    System.out.println("Digite seu salário novamente: ");
    salario = scan.nextDouble();
}
    System.out.printf("seu salário de R$%.2f foi salvo!",salario);

    System.out.println("\nDigite seu sexo:\nMasculino digite (m).\nFeminino digite (f). ");
    sexo = scan.next();

while(!sexo.equals( "m") && !sexo.equals("f")){
    System.out.println("O sexo nao pode ser diferente de (m) ou (f)!");
    System.out.println("Digite seu sexo novamente: ");
    sexo = scan.next();
}
    System.out.printf("seu sexo (%s) foi salvo! ",sexo);

    System.out.println("\nDigite seu estado civil:\nSolteiro digite (s)\nCasado digite (c)\nViuvo digite (v)\nDivorciado digite (d)");
    estadoCivil = scan.next();

while(!estadoCivil.equals( "s") && !estadoCivil.equals("c") && !estadoCivil.equals( "v") && !estadoCivil.equals("d")){
    System.out.println("Estado civil invalido!\nDigite (s,c,v ou d)");
    System.out.println("Digite o estado civil novamente! ");
    estadoCivil = scan.next();
}
    System.out.printf("estado civil %s salvo",estadoCivil);

        scan.close();
    }
}
