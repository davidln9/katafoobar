package com.kata.foo;

public class LogicBrain {

    private ILogic logic;

    public LogicBrain(ILogic logic) {
        this.logic = logic;
    }

    public boolean execute() {
        return logic.performLogicalOperation();
    }
}
