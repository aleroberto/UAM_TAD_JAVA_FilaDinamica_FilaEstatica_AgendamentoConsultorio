class QueueDinamic {
    No inicio;
    No fim;

    //Construtor
    public QueueDinamic() {
        inicio = null;
        fim = null;
    }

    //Verifica se a lista esta vazia
    boolean isEmpty() {
        return (inicio == null);
    }

    //Imprime a lista
    void print() {
        if(isEmpty()) {
            //System
        } else {
            No aux = inicio;
            while(aux  != null) {
                System.out.println();
            }
        }
    }
  
    //enqueue(String string)	coloca item nesta fila
    void enqueue(String string) {
    }

    //dequeue()	remove o item mais antigo desta fila
    String dequeue() {
        return null;
    }

    //int	size()	número de Items nesta fila
    int size() {
        return 0;
    }
}