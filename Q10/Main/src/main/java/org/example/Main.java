package org.example;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        Triangle t1 = new Triangle();
        t1.draw();
        Square s1 = new Square();
        s1.draw();

        c1.erase();
        t1.erase();
        s1.erase();
    }
}