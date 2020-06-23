package com.example.principles.lsp.solution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle implements IShape {
    private int length;
    private int breadth;

    @Override
    public int getArea() {
        return length * breadth;
    }
}
