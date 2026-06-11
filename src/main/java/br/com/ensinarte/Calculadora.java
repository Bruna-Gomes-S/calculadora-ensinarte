package br.com.ensinarte;

public class Calculadora {
	
	// essa é para somar
    public double calcularTotalPontos(double nota1, double nota2) {
        return nota1 + nota2;
    }
    
    //subtrai
    public double calcularQuantoFaltaParaPassar(double mediaDesejada, double notaAtual) {
        return mediaDesejada - notaAtual;
    }
    
  //multiplicar
    public double calcularNotaComPeso(double nota, double peso) {
        return nota * peso;
    }
    
  //dividir
    public double calcularMediaAcademica(double totalPontos, int quantidadeAvaliacoes) {
        if (quantidadeAvaliacoes == 0) {
            throw new IllegalArgumentException("A quantidade de avaliações não pode ser zero.");
        }
        return totalPontos / quantidadeAvaliacoes;
    }
}