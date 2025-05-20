class Node {
    String valor;
    Node esq, dir;

    Node(String valor) {
        this.valor = valor;
    }
}

public class ArvoreBinaria {
    static int contarNos(Node no) {
        if (no == null) return 0;
        return 1 + contarNos(no.esq) + contarNos(no.dir);
    }

    public static void main(String[] args) {
        Node raiz = new Node("A");
        raiz.esq = new Node("B");
        raiz.dir = new Node("C");
        raiz.esq.esq = new Node("D");
        raiz.esq.dir = new Node("E");
        raiz.dir.dir = new Node("F");

        System.out.println("Total de nós: " + contarNos(raiz));
    }
}