
public class ListaEstatica {

    private String vetor[];
    private int fim;

    public ListaEstatica(int maxSize) {
        vetor = new String[maxSize];
        fim = -1;
    }

    // Verifica se a lista esta cheia
    public boolean isFull() {
        return (fim == getVetor().length - 1);
    }

    public String[] getVetor() {
        return vetor;
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    // Verifica se a lista esta vazia
    public boolean isEmpty() {
        return (getFim() == -1);
    }

    // enqueue(String string) coloca item nesta fila
    public void enqueue(String string) {
        if (!isFull()) {
            setFim(getFim() + 1);
            vetor[fim] = string;
            System.out.println("Sucesso: " + string);
        } else {
            System.out.println("Nao temos vaga: " + string);
        }
    }

    // dequeue() remove o item mais antigo desta fila
    public void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < fim; i++) {
                vetor[i] = vetor[i + 1];
            }
            setFim(getFim() - 1);
        } else {
            System.out.println("Nao tem itens");
        }
    }

    // Imprime a lista
    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
        } else {
            System.out.println("ta vazio");
        }
    }
}