import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite quantos numeros deseja somar.");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Agora digite os numeros.");
        int soma = 0;
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Resultado "+soma);
        sc.close();
    }
}