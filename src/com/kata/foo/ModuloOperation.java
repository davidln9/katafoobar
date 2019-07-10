package com.kata.foo;

public class ModuloOperation extends MathOperation {


    public ModuloOperation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int doOperation() {
        return left%right;
    }
}
