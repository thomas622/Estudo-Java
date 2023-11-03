public class Main {
    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = a / b; //divide dois numeros inteiro e gera um resultado inteiro
        System.out.println(resultado);

        resultado = (double) a / b; // divide dois numeros inteiros porém gera um resultado double
        System.out.println(resultado);

        double c;
        int d;

        c = 5.0;
        d = a; //dando a uma variavel inteira o valor de uma variavel double, o programa entende que se perde valor
        System.out.println(d);
        c = 5.0;
        d = (int) a; //Dessa forma você indica para o compilador que as casas decimais não importam
        System.out.println(d);
    }
}