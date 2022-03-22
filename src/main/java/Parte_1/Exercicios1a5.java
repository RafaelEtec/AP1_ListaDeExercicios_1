package Parte_1;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios1a5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 1 a 5");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 1 || escolha > 5) {
                System.out.println("É possível escolher apenas entre 1 a 5");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 1:
                System.out.println("Implementar uma função para calcular o dobro de um número.\n");
                Exercicio1();
                break;
            case 2:
                System.out.println("Implementar uma função para calcular o triplo de um número.\n");
                Exercicio2();
                break;
            case 3:
                System.out.println("Implementar uma função para calcular a metade de um número.\n");
                Exercicio3();
                break;
            case 4:
                System.out.println("Implementar uma função para calcular a área do quadrado.\n");
                Exercicio4();
                break;
            case 5:
                System.out.println("Implementar uma função para calcular a área do retângulo.\n");
                Exercicio5();
                break;
        }
    }
    
    public static void Exercicio1() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor: ");
        double val = ent.nextDouble();
        double res = dobro(val);
        System.out.println("O Dobro de "+val+" é: "+res);
    }
    
    public static double dobro(double val) {
        double res = val * 2;
        return res;
    }
    
    public static void Exercicio2() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor: ");
        double val = ent.nextDouble();
        double res = triplo(val);
        System.out.println("O Triplo de "+val+" é: "+res); 
    }
    
    public static double triplo(double val) {
        double res = val * 3;
        return res;
    }
    
    public static void Exercicio3() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor: ");
        double val = ent.nextDouble();
        double res = metade(val);
        System.out.println("A Metade de "+val+" é: "+res);
    }
    
    public static double metade(double val) {
        double res = val / 2;
        return res;
    }
    
    public static void Exercicio4() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor do lado do Quadrado: ");
        double val = ent.nextDouble();
        double res = areaQuad(val);
        System.out.println("A área do Quadrado é de: "+res+"cm²");
    }
    
    public static double areaQuad(double val) {
        double res = val * val;
        return res;
    }
    
    public static void Exercicio5() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor da base do Retângulo: ");
        double base = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt = ent.nextDouble();
        double res = areaRetan(base,alt);
        System.out.println("A área do Retângulo é de: "+res+"cm²");
    }
    
    public static double areaRetan(double base, double alt) {
        double res = base * alt;
        return res;
    }
}