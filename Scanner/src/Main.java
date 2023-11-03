import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Importação do scanner
        /*System.out.println("Digite o seu nome: ");
        String name = sc.next(); //Entrada de dado string
        System.out.println("Ola, "+ name);

        System.out.println("Quantos anos voce tem?");
        int x = sc.nextInt(); //Entrada de dado inteiro
        System.out.println(name+ " tem "+x+" anos");


        //Outra forma de digitar, entrada de dados separados por espaço
        System.out.println("Digite o seu nome, idade e altura ");
        String nome = sc.next();
        int idade = sc.nextInt();
        double peso = sc.nextDouble();
        System.out.println("Nome: "+nome + " idade: "+idade+" peso: "+peso);
*/
        //Outra forma de entrada de dados, dados digitados na linha toda
        /*Caso for utilizar nextLine junto de outra entradada de dados por exemplo nextInt, colocar um nextLine vazio
        Entre eles, pois o enter consome um nextLine */
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}