package com.kata.foo;

public class LogicalOperation implements ILogic {

    protected int left;
    protected int right;

    public LogicalOperation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean performLogicalOperation() {
        return false;
    }
}
