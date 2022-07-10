import java.util.Scanner;
class Aprovado_ou_nao {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Terceira nova:");
        double nota3 = sc.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println ("Média do aluno: " + media);
        if(media>=6){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println ("Aprovado!");
        }
    }
}