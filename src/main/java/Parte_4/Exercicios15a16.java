package Parte_4;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios15a16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 15 a 16");
        int escolha = ent.nextInt();
        while (escolha < 15 || escolha > 16) {
            System.out.println("É possível escolher apenas 15 ou 16");
            escolha = ent.nextInt();
        }
        switch (escolha) {
            case 15:
                System.out.println("Implementar uma função para verificar se um aluno passou ou não, baseado em 3 notas\nConsiderando que a média mínima para passar é 5.\n");
                Exercicio15();
                break;
            case 16:
                System.out.println("Implementar uma função para verificar se dois quadrados possuem a mesma área.\n");
                Exercicio16();
                break;
        }
    }
    
    public static void Exercicio15() {
        
    }
    
    public static void Exercicio16() {
        
    }
}