package com.kata.foo;

import java.util.List;

public class MathBrain {

    private IMath strategy;

    public MathBrain(IMath strategy) {
        this.strategy = strategy;
    }

    public int execute() {

        return strategy.doOperation();
    }
}
