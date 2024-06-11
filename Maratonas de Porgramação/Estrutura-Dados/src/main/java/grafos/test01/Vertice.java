package grafos.test01;

import java.util.ArrayList;

public class Vertice <TIPO>{
    private TIPO dado;
    private ArrayList<TIPO> arestasEntrada;
    private ArrayList<TIPO> arestasSaida;

   public Vertice(TIPO valor){
       this.dado = valor;
       this.arestasEntrada = new ArrayList<TIPO>();
       this.arestasSaida = new ArrayList<TIPO>();
   }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public void adicionarArestaEntrada(Aresta aresta){
       this.arestasEntrada.add((TIPO) aresta);
    }

    public void adicionarArestaSaida(Aresta aresta){
        this.arestasSaida.add((TIPO) aresta);
    }
}
