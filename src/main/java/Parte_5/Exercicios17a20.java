package Parte_5;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Exercicios17a20 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 17 a 20");
        int escolha = ent.nextInt();
        while (escolha < 17 || escolha > 20) {
            System.out.println("É possível escolher apenas entre 17 e 20");
            escolha = ent.nextInt();
        }
        switch (escolha) {
            case 17:
                System.out.println("Implementar uma função para verificar se uma cor é primária ou não.\n");
                Exercicio17();
                break;
            case 18:
                System.out.println("Implementar uma função para verificar se uma pessoa pode atravessar a rua ou não, baseado na cor do semáforo do pedestre.\n");
                Exercicio18();
                break;
            case 19:
                System.out.println("Implementar uma função para verificar se duas cores são primárias ou não.\n");
                Exercicio19();
                break;
            case 20:
                System.out.println("Implementar uma função para verificar se uma forma geométrica é um triângulo equilátero, baseado em seus três lados.\n");
                Exercicio20();
                break;
        }
    }
    
    public static void Exercicio17() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Escreva o nome da cor: ");
        String cor = ent.next();
        if (cor.toLowerCase().equals("vermelho") || cor.toLowerCase().equals("azul") || cor.toLowerCase().equals("amarelo")) {
            System.out.println("A cor "+cor+" é primária.");
        } else {
            System.out.println("A cor "+cor+" NÃO é primária! ! !");
        }
    }
    
    public static void Exercicio18() {
        Scanner ent = new Scanner(System.in);
        
        String pode = "verde";
        String npode = "vermelho";
        
        System.out.println("Qual a cor do farol agora?");
        String cor = ent.next();
        
        if (cor.toLowerCase().equals(pode)) {
            System.out.println("O farol está Verde, por isso você pode atravessar a rua.");
        } else if (cor.toLowerCase().equals(npode)) {
            System.out.println("O farol está vermelho, por isso você NÃO pode atravessar a rua!");
        } else if (cor.toLowerCase() != pode || cor.toLowerCase() != npode) {
            System.out.println("A cor inserida não pode ser usada!");
        }
    }
    
    public static void Exercicio19() {
        Scanner ent = new Scanner(System.in);
       
        System.out.println("Escreva o nome da primeira cor: ");
        String cor1 = ent.next();
        System.out.println("Agora escreva o nome da segunda cor: ");
        String cor2 = ent.next();
       
        if (cor1.toLowerCase().equals("vermelho") || cor1.toLowerCase().equals("amarelo") || cor1.toLowerCase().equals("azul")) {
            if (cor2.toLowerCase().equals("vermelho") || cor2.toLowerCase().equals("amarelo") || cor2.toLowerCase().equals("azul")) {
                System.out.println("Ambas as cores sao Primárias.");
            } else {
                System.out.println("Apenas a cor "+cor1+" é primária.");
            }
        } else if (cor2.toLowerCase().equals("vermelho") || cor2.toLowerCase().equals("amarelo") || cor2.toLowerCase().equals("azul")) {
            System.out.println("Apenas a cor "+cor2+" é primária.");  
        } else {
            System.out.println("Nenhuma das cores inseridas são primárias!");  
        }
    }
    
    public static void Exercicio20() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro lado: ");
        double lado1 = ent.nextDouble();
        System.out.println("Insira o valor do segundo lado: ");
        double lado2 = ent.nextDouble();
        System.out.println("Insira o valor do terceiro lado: ");
        double lado3 = ent.nextDouble();
        
        boolean x = trianguloEquilatero(lado1, lado2, lado3);
        System.out.println("É um Triângulo Equilátero ? " + x);
        
    }
    
    public static boolean trianguloEquilatero(double lado1, double lado2, double lado3) {
        boolean iguais = lado1 == lado2 && lado2 == lado3;
        return iguais;
    }
}