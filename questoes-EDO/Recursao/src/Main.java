import Question2.Questao2;
import question1.Questao1;
import question3.Questao3;
import question5.Questao5;
import question6.Questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ------------ Questão 1 ------------ ");
        int x = Questao1.numberPrimo(13, 0);
        System.out.println(x);

        System.out.println(" ------------ Questão 2 ------------ ");

        System.out.println(" ------------ Questão 3 ------------ ");

        int questao3 = Questao3.calcularPotencia(2, 4);
        System.out.println(questao3);

        System.out.println(" ------------ Questão 4 ------------ ");


        System.out.println(" ------------ Questão 5 ------------ ");
        int [] array = {2, 5, -20, 7, 100, 1, -14, 78, 30, 0};
        int questao5 = Questao5.retornaArray(array, 0);
        System.out.println(questao5);

        System.out.println(" ------------ Questão 6 ------------ ");
        String resposta6 = Questao6.termosPA(5, 0.80, 0.58);
        System.out.println(resposta6);

    }
}