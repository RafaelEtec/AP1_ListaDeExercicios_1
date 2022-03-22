package Parte_3;
import java.util.Scanner;
import Parte_2.Exercicios6a9;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios10a13 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 10 a 13");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 10 || escolha > 13) {
                System.out.println("É possível escolher apenas entre 10 a 13");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
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
        double media = Exercicios6a9.media3notas(n1, n2, n3);
        boolean passou = passouMedia5(media);
        if (passou == true) {
            System.out.println("Você passou!");
        } else {
            System.out.println("Você NÃO passou!");
        }
    }
    
    public static boolean passouMedia5(double media) {
        if (media >= 5) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void Exercicio11() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor do lado do primeiro Quadrado");
        double lado1 = ent.nextDouble();
        System.out.println("Insira o valor do lado do segundo Quadrado");
        double lado2 = ent.nextDouble();
        double area1 = areaQuad(lado1);
        double area2 = areaQuad(lado2);
        boolean areaIgualQuad = areaIgual2Quad(area1, area2);
        if (areaIgualQuad == true) {
            System.out.println("Ambos os Quadrados possuem mesma área.");
        } else {
            System.out.println("Os Quadrados não possuem mesma área.");
        }
    }
    
    public static double areaQuad(double lado) {
        double area = lado * lado;
        return area;
    }
    
    public static boolean areaIgual2Quad(double area1, double area2) {
        return area1 == area2;
    }
    
    public static void Exercicio12() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor da base do primeiro Retângulo: ");
        double base1 = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt1 = ent.nextDouble();
        System.out.println("Insira o valor da base do Segundo Retângulo: ");
        double base2 = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt2 = ent.nextDouble();
        double area1 = areaRetan(base1,alt1);
        double area2 = areaRetan(base2,alt2);
        boolean areaIgualRetan = areaIgual2Retan(area1, area2);
        if (areaIgualRetan == true) {
            System.out.println("Ambos os Retângulos possuem mesma área.");
        } else {
            System.out.println("Os Retângulos não possuem mesma área.");
        }
    }
    
    public static double areaRetan(double base, double alt) {
        double area = base * alt;
        return area;
    }
    
    public static boolean areaIgual2Retan(double area1, double area2) {
        return area1 == area2;
    }
    
    public static void Exercicio13() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor da base do primeiro Triângulo: ");
        double base1 = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt1 = ent.nextDouble();
        System.out.println("Insira o valor da base do segundo Triângulo: ");
        double base2 = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt2 = ent.nextDouble();
        System.out.println("Insira o valor da base do terceiro Triângulo: ");
        double base3 = ent.nextDouble();
        System.out.println("Agora a altura: ");
        double alt3 = ent.nextDouble();
        double area1 = areaTri(base1, alt1);
        double area2 = areaTri(base2, alt2);
        double area3 = areaTri(base3, alt3);
        boolean areaIgualTri = areaIgual3Tri(area1, area2, area3);
        if (areaIgualTri == true) {
            System.out.println("Os três Triângulos possuem mesma área.");
        } else {
            System.out.println("Os Triângulos não possuem mesma área.");
        }
    }
    
    public static double areaTri(double base, double alt) {
        double area = (base * alt) / 2;
        return area;
    }
    
    public static boolean areaIgual3Tri(double area1, double area2, double area3) {
        return area1 == area2 && area2 == area3;
    }
}