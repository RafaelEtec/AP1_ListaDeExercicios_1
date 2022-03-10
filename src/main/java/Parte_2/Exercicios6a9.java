package Parte_2;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios6a9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 6 a 9");
        int escolha = ent.nextInt();
        while (escolha < 6 || escolha > 9) {
            System.out.println("É possível escolher apenas entre 6 a 9");
            escolha = ent.nextInt();
        }
        switch (escolha) {
            case 6:
                System.out.println("Implementar uma função para calcular a área do triângulo.\n");
                Exercicio6();
                break;
            case 7:
                System.out.println("Implementar uma função para calcular o perímetro do octógono com mesmo lado.\n");
                Exercicio7();
                break;
            case 8:
                System.out.println("Implementar uma função para calcular a média de 3 notas.\n");
                Exercicio8();
                break;
            case 9:
                System.out.println("Implementar uma função para calcular a média de 5 notas.\n");
                Exercicio9();
                break;
        }
    }
    
    public static void Exercicio6() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor da base do Triângulo: ");
        double base = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt = ent.nextDouble();
        double res = (base * alt) / 2;
        
        System.out.println("A área do Triângulo é de: "+res+"cm²");
    }
    
    public static void Exercicio7() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor do lado do Octógono: ");
        double lado = ent.nextDouble();
        double res = lado * 8;
        
        System.out.println("O perímetro do Octógono é de: "+res+"cm");
    }
    
    public static void Exercicio8() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a Primeira nota: ");
        double n1 = ent.nextDouble();
        System.out.println("Insira a Segunda nota: ");
        double n2 = ent.nextDouble();
        System.out.println("Insira a Terceira nota: ");
        double n3 = ent.nextDouble();
        double res = (n1 + n2 + n3) / 3;
        
        System.out.println("Sua média é de: "+res);
    }
    
    public static void Exercicio9() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a Primeira nota: ");
        double n1 = ent.nextDouble();
        System.out.println("Insira a Segunda nota: ");
        double n2 = ent.nextDouble();
        System.out.println("Insira a Terceira nota: ");
        double n3 = ent.nextDouble();
        System.out.println("Insira a Quarta nota: ");
        double n4 = ent.nextDouble();
        System.out.println("Insira a Quinta nota: ");
        double n5 = ent.nextDouble();
        double res = (n1 + n2 + n3 + n4 + n5) / 5;
        
        System.out.println("Sua média é de: "+res);
    }
}