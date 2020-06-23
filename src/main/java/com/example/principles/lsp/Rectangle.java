package com.example.principles.lsp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private int length;
    private int breadth;

    public int getArea() {
        return length * breadth;
    }
}