package br.com.screenmatch.calculos;

public class Recomendacao {

    public void filtro(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.print("Está entre os favoritos!! - Nome: ");
        } 
        else if (classificavel.getClassificacao() >= 2) {
            System.out.print("Bem avaliado no momento! - Nome: ");
        }
        else {
            System.out.print("Baixa avaliação. - Nome: ");
        }
    }
}
