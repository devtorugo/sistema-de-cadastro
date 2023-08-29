import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====Bem Vindo ao Sistema dos alunos da FIAP=====\r\n" +
                "Escolha a opção desejada:\r\n" +
                "1. Cadastrar alunos\r\n");

        Scanner  scanner = new Scanner(System.in);

        System.out.printf("Primeiro, digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite o sexo do aluno: ");
        String Sexo = scanner.nextLine();

        System.out.println("Agora, digite a idade do aluno:");
        int idade = scanner.nextInt();

        boolean matriculado = true;

        System.out.println("Nome: "+ nome + "\r\n, Idade:" + idade + "\r\n,Matriculado: " + matriculado + "\r\n,Sexo: " + Sexo);
    }
}