package Parte_3;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios10a13 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 10 a 13");
        int escolha = ent.nextInt();
        while (escolha < 10 || escolha > 13) {
            System.out.println("É possível escolher apenas entre 10 a 13");
            escolha = ent.nextInt();
        }
        switch (escolha) {
            case 10:
                System.out.println("Implementar uma função para verificar se um aluno passou ou não, baseado em 3 notas\nConsiderando que a média mínima para passar é 5.\n");
                Exercicio10();
                break;
            case 11:
                System.out.println("Implementar uma função para verificar se dois quadrados possuem a mesma área.\n");
                Exercicio11();
                break;
            case 12:
                System.out.println("Implementar uma função para verificar se dois retângulos possuem a mesma área.\n");
                Exercicio12();
                break;
            case 13:
                System.out.println("Implementar uma função para verificar se três triângulos possuem a mesma área.\n");
                Exercicio13();
                break;
        }
    }
    
    public static void Exercicio10() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a Primeira nota: ");
        double n1 = ent.nextDouble();
        System.out.println("Insira a Segunda nota: ");
        double n2 = ent.nextDouble();
        System.out.println("Insira a Terceira nota: ");
        double n3 = ent.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        
        if (media >= 5) {
            System.out.println("Você Passou!");
        } else {
            System.out.println("Você não Passou.");
        }
    }
    
    public static void Exercicio11() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor do lado do primeiro Quadrado");
        double lado1 = ent.nextDouble();
        System.out.println("Insira o valor do lado do segundo Quadrado");
        double lado2 = ent.nextDouble();
        double area1 = lado1 * lado1;
        double area2 = lado2 * lado2;
        if (area1 == area2) {
            System.out.println("Ambos os Quadrados possuem mesma área.");
        } else {
            System.out.println("Os Quadrados não possuem mesma área.");
        }
    }
    
    public static void Exercicio12() {
        
    }
    
    public static void Exercicio13() {
        
    }
}
