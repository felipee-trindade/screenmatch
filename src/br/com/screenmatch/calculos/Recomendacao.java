package br.com.screenmatch.calculos;

public class Recomendacao {

    public void filtro(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os favoritos!!");
        } 
        else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento!");
        }
        else {
            System.out.println("Baixa avaliação.");
        }
    }
}
