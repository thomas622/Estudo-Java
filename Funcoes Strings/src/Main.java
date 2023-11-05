public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEF         ";
        System.out.println("Original: "+original+"-");
        System.out.println("LowerCase: "+original.toLowerCase()+"-");
        System.out.println("UpperCase: "+original.toUpperCase()+"-");
        System.out.println("trim: "+original.trim()+"-"); //REMOVE ESPAÇOS DESNECESSÁRIOS
        System.out.println("substring(2): "+original.substring(2)+"-"); //IMPRIME APARTIR DO INDICE
        System.out.println("substring(2,9): "+original.substring(2,9)+"-"); //IMPRIME ENTRE OS INDICES
        System.out.println("replace('a','x'): "+original.replace('a','x')+"-"); //TROCA X CARACTER POR X CARACTER
        System.out.println("indexOf('bc'): "+original.indexOf("bc")+"-"); //INFORMA A PRIMEIRA VEZ QUE BC APARECE
        System.out.println("lastIndexOf('bc'): "+original.lastIndexOf("bc")+"-"); //INFORMA A ULTIMA VEZ QUE BC APARECE

        String s = "potato apple lemon";

        String[] vect = s.split(" "); //SPLIT SEPARA A STRING QUANDO ACHAR O CARACTER MENCIONADO, E O JOGA EM UM VETOR
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);



    }
}