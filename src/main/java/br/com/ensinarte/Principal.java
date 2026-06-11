package br.com.ensinarte;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("===============================================");
        System.out.println("   SISTEMA DE NOTAS - ENSINARTE     ");
        System.out.println("===============================================\n");

        try {
            System.out.print("Digite a nota do Trabalho: ");
            double notaTrabalho = teclado.nextDouble();

            System.out.print("Digite a nota da Prova: ");
            double notaProva = teclado.nextDouble();

            double total = calc.calcularTotalPontos(notaTrabalho, notaProva);
            System.out.println("\n-> Total de pontos acumulados: " + total);

            System.out.print("\nEm quantas avaliações deseja dividir esses pontos? ");
            int quantidadeAvaliacoes = teclado.nextInt();

            double media = calc.calcularMediaAcademica(total, quantidadeAvaliacoes);
            System.out.println("-> Média Final do Aluno: " + media);

            double mediaAprovacao = 7.0;
            System.out.println("\n-----------------------------------------------");
            if (media >= mediaAprovacao) {
                System.out.println("SITUAÇÃO: Aluno Aprovado! Parabéns!");
            } else {
                double quantoFalta = calc.calcularQuantoFaltaParaPassar(mediaAprovacao, media);
                System.out.println("SITUAÇÃO: Em Recuperação.");
                System.out.println("Faltaram " + quantoFalta + " pontos para atingir a média " + mediaAprovacao);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("PROTEÇÃO DO SISTEMA ATIVADA: Operação cancelada.");
            System.out.println("Mensagem de erro tratada: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("\nERRO: Por favor, digite apenas números válidos.");
            
        } finally {
            teclado.close();
            System.out.println("\n===============================================");
        }
    }
}