package br.com.dio.debbuging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media); // %.1f formata o ponto flutuante para exibir uma unica casa decimal apos a virgula 
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            try {double nota = scanner.nextDouble();
                soma += nota;
            } catch (InputMismatchException e) {
               System.err.println("Insira numeros reais com virgula e não com ponto. Ex: 7,3");
            }
        }
        return soma / alunos.length;
        // retorna uma media de soma pela quantidade de alunos
    }

}
