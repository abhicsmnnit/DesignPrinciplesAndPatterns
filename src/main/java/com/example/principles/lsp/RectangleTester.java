package com.example.principles.lsp;

public class RectangleTester {
    public static void main(String[] args) {
        someCode(new Square());
    }

    public static void someCode(Rectangle r) {
        // ...
        int length = 3;
        int breadth = 2;

        r.setLength(length);
        r.setBreadth(breadth);

        assert r.getLength() == length;
        assert r.getBreadth() == breadth;
        assert r.getArea() == length * breadth;
        // ...
        System.out.println("Test passed!");
    }
}