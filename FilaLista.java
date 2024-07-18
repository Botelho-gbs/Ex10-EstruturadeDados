import java.util.LinkedList;

public class FilaLista {
    private LinkedList<Aluno> fila;

    public FilaLista() {
        this.fila = new LinkedList<>();
    }

    public void enqueue(Aluno aluno) {
        fila.addLast(aluno);
    }

    public Aluno dequeue() {
        if (isEmpty()) {
            return null;
        }
        return fila.removeFirst();
    }

    public int size() {
        return fila.size();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public void imprimirFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Estado atual da fila:");
            for (Aluno aluno : fila) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        FilaLista fila = new FilaLista();

        // Adicionando alunos à fila
        fila.enqueue(new Aluno("João", 20));
        fila.enqueue(new Aluno("Maria", 22));
        fila.enqueue(new Aluno("Carlos", 21));

        // Imprimindo o estado da fila
        fila.imprimirFila();

        // Removendo um aluno da fila
        fila.dequeue();

        // Imprimindo o estado da fila novamente
        fila.imprimirFila();

        // Mostrando tamanho e se está vazia
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("A fila está vazia? " + fila.isEmpty());
    }
}
