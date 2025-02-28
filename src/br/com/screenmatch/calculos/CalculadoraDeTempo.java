package br.com.screenmatch.calculos;

import br.com.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }


}
