public class ListaDinamica {
    No inicio;
    No fim;

    //Construtor
    public ListaDinamica() {
        inicio = null;
        fim = null;
    }

    //Verifica se a lista esta vazia
    public boolean isEmpty() {
        return (inicio == null);
    }

    //Imprime a lista
    public void print() {
        if(isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            No aux = inicio;
            while(aux  != null) {
                System.out.println(aux.getDado());
                aux = aux.getProxNo();
            }
        }
    }

    //enqueue(String string)    coloca item nesta fila
    public void enqueue(String string) {
        No novoNo = new No(string);

        if(isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProxNo(novoNo);
            fim = novoNo;
        }

    }

    //dequeue() remove o item mais antigo desta fila
    public String dequeue() {
        return null;
    }

    //int   size()  número de Items nesta fila
    public int size() {
        return 0;
    }
}