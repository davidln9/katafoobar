package com.kata.foo;

public class EqualsLogicalOperation extends LogicalOperation {


    public EqualsLogicalOperation(int left, int right) {
        super(left, right);
    }

    @Override
    public boolean performLogicalOperation() {
        return left == right;
    }
}
