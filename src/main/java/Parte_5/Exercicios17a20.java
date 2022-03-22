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
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 17 || escolha > 20) {
                System.out.println("É possível escolher apenas entre 17 a 20");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
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
        boolean corPrimaria = corPrimaria(cor);
        if (corPrimaria == true) {
            System.out.println("A cor "+cor+" é Primária!");
        } else {
            System.out.println("A cor "+cor+" NÃO é Primária.");
        }
    }
    
    public static boolean corPrimaria(String cor) {
        return cor.toLowerCase().equals("vermelho") || cor.toLowerCase().equals("azul") || cor.toLowerCase().equals("amarelo");
    }
    
    public static void Exercicio18() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Qual a cor do farol agora?");
        String corFarol = ent.next();
        String retornoFarol = podeAtravessar(corFarol);
        System.out.println(retornoFarol);
    }
    
    public static String podeAtravessar(String corFarol) {
        String retornoFarol = "";
        if (corFarol.toLowerCase().equals("verde")) {
            retornoFarol = "O Farol está "+corFarol+", Você pode atravessar.";
        } else if (corFarol.toLowerCase().equals("vermelho")) {
            retornoFarol = "O Farol está "+corFarol+", Você NÃO PODE atravessar!";
        } else {
            retornoFarol = "A cor Inserida não pode ser usada!";
        }
        return retornoFarol;
    }
    
    public static void Exercicio19() {
        Scanner ent = new Scanner(System.in);
       
        System.out.println("Escreva o nome da primeira cor: ");
        String cor1 = ent.next();
        System.out.println("Agora escreva o nome da segunda cor: ");
        String cor2 = ent.next();
        boolean corP1 = corPrimaria(cor1);
        boolean corP2 = corPrimaria(cor2);
        if (corP1 == true) {
            if (corP2 == true) {
                System.out.println("Ambas as cores são Primárias.");
            } else {
                System.out.println("Apenas a cor "+cor1+" é Primária.");
            }
        } else if (corP2 == true) {
            System.out.println("Apenas a cor "+cor2+" é Primária.");
        } else {
            System.out.println("Nenhuma das cores é Primária!");
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
        boolean triEquilatero = trianguloEquilatero(lado1, lado2, lado3);
        if (triEquilatero == true) {
            System.out.println("É um Triângulo Equilátero!");
        } else {
            System.out.println("Não é um Triângulo Equilátero.");
        }
    }
    
    public static boolean trianguloEquilatero(double lado1, double lado2, double lado3) {
        boolean iguais = lado1 == lado2 && lado2 == lado3;
        return iguais;
    }
}