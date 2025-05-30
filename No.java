import java.util.Stack;

class No {
    int valor;
    No esquerda, direita;

    No(int valor) {
        this.valor = valor;
    }
}

public class ArvoreBinaria {

    public static int contarNosComPilha(No raiz) {
        if (raiz == null) return 0;

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);
        int contador = 0;

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            contador++;

            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }

        return contador;
    }

    public static void main(String[] args) {
        No raiz = new No(1);
        raiz.esquerda = new No(2);
        raiz.direita = new No(3);
        raiz.esquerda.esquerda = new No(4);
        raiz.esquerda.direita = new No(5);

        System.out.println("Total de nós: " + contarNosComPilha(raiz));
    }
}

