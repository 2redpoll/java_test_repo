package ru.stqa.jtr.sandbox;

public class Multiplie {
    public int n1;
    public int n2;

    public Multiplie (int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int mult() {
        return  (this.n1 * this.n2) + 10;
    }
}
