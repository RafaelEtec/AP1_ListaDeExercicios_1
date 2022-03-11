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
                System.out.println("Implementar uma função para calcular o valor final de uma compra a partir de um cupom de desconto. O cupom diz quantos reais terá de desconto.\n");
                Exercicio15();
                break;
            case 16:
                System.out.println("Implementar uma função para calcular o valor final de uma compra a partir de um cupom de desconto. O cupom diz a porcentagem que terá de desconto.\n");
                Exercicio16();
                break;
        }
    }
    
    public static void Exercicio15() {
        Scanner ent = new Scanner(System.in);
       
        System.out.println("Insira o valor da compra: ");
        double valCompra = ent.nextDouble();
        System.out.println("Insira a porcentagem do desconto: ");
        int desconto = ent.nextInt();
       
        double valDesconto = (valCompra * desconto) / 100 ;
        double valFinal = valCompra - valDesconto;
       
        System.out.println("Será descontado: "+valDesconto+" da compra\nValor Final da compra: "+valFinal);
    }
    
    public static void Exercicio16() {
        Scanner ent = new Scanner(System.in);
       
        System.out.println("Insira o valor da compra: ");
        double valCompra = ent.nextDouble();
        System.out.println("Insira o valor a ser descontado: ");
        double valDesconto = ent.nextDouble();
       
        double valFinal = valCompra - valDesconto;
        double porcDesconto = (valDesconto * 100) / valCompra ;
        System.out.println("O valor final será: "+valFinal+"\nPorcentagem de desconto: "+porcDesconto+"%");
    }
}