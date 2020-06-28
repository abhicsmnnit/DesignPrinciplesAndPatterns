package com.example.principles.lsp.solution;

public class Square implements IShape {
    private int side;

    @Override
    public int getArea() {
        return side * side;
    }
}
