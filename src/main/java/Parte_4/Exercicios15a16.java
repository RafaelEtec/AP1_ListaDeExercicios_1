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
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 15 || escolha > 16) {
                System.out.println("É possível escolher apenas entre 15 a 16");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
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
        
        try {
            System.out.println("Insira o valor da compra: ");
            double valCompra = ent.nextDouble();
            System.out.println("Insira a porcentagem do desconto: ");
            int porcDesconto = ent.nextInt();

            double valDesconto = valDesconto(valCompra, porcDesconto);
            double valFinal = valCompra - valDesconto;

            System.out.println("Será descontado: "+valDesconto+" da compra\nValor Final da compra: "+valFinal);
        } catch (Exception ex) {
            System.out.println("Letras não são perminitdas!");
        }
    }
    
    public static double valDesconto(double valCompra, int porcDesconto) {
        double valDesconto = (valCompra * porcDesconto) / 100;
        return valDesconto;
    }
    
    public static double valFinal(double valCompra, double valDesconto) {
        double valFinal = valCompra - valDesconto;
        return valFinal;
    }
    
    public static void Exercicio16() {
        Scanner ent = new Scanner(System.in);
       
        try {
            System.out.println("Insira o valor da compra: ");
            double valCompra = ent.nextDouble();
            System.out.println("Insira o valor a ser descontado: ");
            double valDesconto = ent.nextDouble();

            double valFinal = valFinal(valCompra, valDesconto);
            double porcDesconto = porcDesconto(valCompra, valDesconto);
            System.out.println("O valor final será: "+valFinal+"\nPorcentagem de desconto: "+porcDesconto+"%");
        } catch (Exception ex) {
            System.out.println("Letras não são perminitdas!");
        }
    }
    
    public static double porcDesconto(double valCompra, double valDesconto) {
        double porcDesconto = (valDesconto * 100) / valCompra;
        return porcDesconto;
    }
}