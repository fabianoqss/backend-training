import Question2.Questao2;
import question1.Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Resolução Questao1
        int x = Questao1.numberPrimo(13, 0);
        System.out.println(x);

        System.out.println(" ------------ Questão 2 ------------ ");

        int x2 = Questao2.multiFib(4, 1);
        System.out.println(x2);
    }
}