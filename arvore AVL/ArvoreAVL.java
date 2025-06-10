class Node {
    String v;
    Node e, d;
    int h = 1;

    Node(String v) {
        this.v = v;
    }
}

public class ArvoreAVL {

    static int alt(Node n) {
        return n == null ? 0 : n.h;
    }

    static int fb(Node n) {
        return alt(n.e) - alt(n.d);
    }

    static void att(Node n) {
        n.h = 1 + Math.max(alt(n.e), alt(n.d));
    }

    static Node rotDir(Node y) {
        Node x = y.e;
        y.e = x.d;
        x.d = y;
        att(y); att(x);
        return x;
    }

    static Node rotEsq(Node x) {
        Node y = x.d;
        x.d = y.e;
        y.e = x;
        att(x); att(y);
        return y;
    }

    static Node ins(Node n, String v) {
        if (n == null) return new Node(v);
        if (v.compareTo(n.v) < 0) n.e = ins(n.e, v);
        else if (v.compareTo(n.v) > 0) n.d = ins(n.d, v);
        else return n;

        att(n);
        int b = fb(n);

        if (b > 1 && v.compareTo(n.e.v) < 0) return rotDir(n);
        if (b < -1 && v.compareTo(n.d.v) > 0) return rotEsq(n);
        if (b > 1 && v.compareTo(n.e.v) > 0) { n.e = rotEsq(n.e); return rotDir(n); }
        if (b < -1 && v.compareTo(n.d.v) < 0) { n.d = rotDir(n.d); return rotEsq(n); }

        return n;
    }

    static int contar(Node n) {
        return n == null ? 0 : 1 + contar(n.e) + contar(n.d);
    }

    static void mostrar(Node n) {
        if (n != null) {
            mostrar(n.e);
            System.out.print(n.v + " ");
            mostrar(n.d);
        }
    }

    public static void main(String[] args) {
         ArvoreAVL arvore = new ArvoreAVL();

    int[] chaves = {10, 20, 30, 40, 50, 25};

    for (int chave : chaves) {
        arvore.raiz = arvore.inserir(arvore.raiz, chave);
        }

    System.out.println("percurso em ordem da arvore AVL:");
    arvore.percursoEmOrdem(arvore.raiz);
    }
}
