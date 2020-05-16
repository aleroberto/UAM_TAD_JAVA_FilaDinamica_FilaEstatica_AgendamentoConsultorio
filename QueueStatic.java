class QueueStatic {
    String vetor [];
    int fim;

    public QueueStatic(int maxSize) {
        vetor = new String[maxSize];
        fim = -1;
    }

    //Verifica se a lista esta cheia
    public boolean isFull() {
        return (fim == vetor.length - 1);
    }
  
    //Verifica se a lista esta vazia
    public boolean isEmpty() {
        return  (fim == -1);
    }

    //enqueue(String string)    coloca item nesta fila
    public void enqueue(String string) {
        if (!isFull()) {
            fim++;
            vetor[fim] = string;
        } else {
            System.out.println("Nao tem vaga");
        }
    }

    //dequeue() remove o item mais antigo desta fila
    void dequeue() {
        if(!isEmpty()) {
            for(int i = 0 ; i < fim; i++) {
                vetor[i] = vetor[i + 1];
            }
            fim--;
        } else {
            System.out.println("Nao tem itens");
        }
    }

    //Imprime a lista
    public void print() {
        if(!isEmpty()) {
            for(int i = 0 ; i < vetor.length ; i++) {
                System.out.println(vetor[i]);
            }
        } else {
            System.out.println("ta vazio");
        }
    }
}
