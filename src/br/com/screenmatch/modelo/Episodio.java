package br.com.screenmatch.modelo;

import br.com.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel{
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacao;


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }



    @Override
    public int getClassificacao() {
        if (totalVisualizacao > 10000) {
            return 5;
        }
        else if (totalVisualizacao > 7500) {
            return 4;
        }
        else if (totalVisualizacao > 5000) {
            return 3;
        }
        else if (totalVisualizacao > 2500) {
            return 2;
        } 
        else if (totalVisualizacao > 1000) {
            return 1;
        }
        else {
            return 0;
        }
    }

    
}
