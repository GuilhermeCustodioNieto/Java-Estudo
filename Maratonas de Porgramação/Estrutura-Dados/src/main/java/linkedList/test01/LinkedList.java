package linkedList.test01;

public class LinkedList {
    private Node primeiro;
    private Node ultimo;
    private int tamanho;

    public LinkedList() {
        this.tamanho = 0;
    }

    public Node getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Node novoNo = new Node(novoValor);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        }

        this.tamanho++;
    }

    public void remover(String novoValor){

    }

    public Node get(int posicao){
        Node atual = this.primeiro;
        for(int i=0; i<posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }

        return atual;

    }
}
