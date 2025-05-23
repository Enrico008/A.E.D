import java.util.*;

class No {
    String valor;
    No esquerdo, direito;

    No(String valor) {
        this.valor = valor;
    }
}

public class ArvoreBinaria {
    public static void emNivel(No raiz) {
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");
            if (atual.esquerdo != null) fila.add(atual.esquerdo);
            if (atual.direito != null) fila.add(atual.direito);
        }
    }

    public static void main(String[] args) {
        No raiz = new No("A");
        raiz.esquerdo = new No("B");
        raiz.direito = new No("C");
        raiz.esquerdo.esquerdo = new No("D");
        raiz.esquerdo.direito = new No("E");
        raiz.direito.direito = new No("F");

        emNivel(raiz);
    }
}
