import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        dá direito a 100 minutos de telefone. Cada minuto que exceder a
        franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        a ser pago.
        Exemplo de entrada: 22 - Saida: 50
        Exemplo de entrada: 103 - Saida 56
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos minutos foi consumido?");
        int minutos = sc.nextInt();
        int conta = 50;
        if(minutos <= 100) {
            System.out.println("O total a ser pago será de R$ "+conta);
        }
        else {
            conta += (minutos - 100) * 2;
            System.out.println("O total a ser pago será de R$ "+conta);
        }
    sc.close();
    }
}