package com.kata.foo;

public class Kata {

    public static void main(String[] args) {

        int startingNumber = 105;

        if (args.length > 0) {
            startingNumber = Integer.parseInt(args[0]);
        }

        MathBrain mathBrain = new MathBrain(new ModuloOperation(startingNumber,3));
        LogicBrain logicBrain3 = new LogicBrain(new EqualsLogicalOperation(mathBrain.execute(),0));

        mathBrain = new MathBrain(new ModuloOperation(startingNumber, 5));
        LogicBrain logicBrain5 = new LogicBrain(new EqualsLogicalOperation(mathBrain.execute(), 0));

        mathBrain = new MathBrain(new ModuloOperation(startingNumber, 7));
        LogicBrain logicBrain7 = new LogicBrain(new EqualsLogicalOperation(mathBrain.execute(), 0));

        String result = "";
        if (logicBrain3.execute()) {
            result += "Foo";
        }
        if (logicBrain5.execute()) {
            result += "Bar";
        }
        if (logicBrain7.execute()) {
            result += "Qix";
        }

        String str = Integer.toString(startingNumber);
        for (int i = 0; i < str.length(); i++) {

            logicBrain3 = new LogicBrain((new EqualsLogicalOperation((int)str.charAt(i),(int)'3')));
            logicBrain5 = new LogicBrain((new EqualsLogicalOperation((int)str.charAt(i),(int)'5')));
            logicBrain7 = new LogicBrain((new EqualsLogicalOperation((int)str.charAt(i), (int)'7')));
            LogicBrain logicBrain0 = new LogicBrain(new EqualsLogicalOperation((int)str.charAt(i), (int)'0'));
            if (logicBrain3.execute()) {
                result += "Foo";
            } else if (logicBrain5.execute()) {
                result += "Bar";
            } else if (logicBrain7.execute()) {
                result += "Qix";
            } else if (logicBrain0.execute()) {
                result += "*";
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);






    }
}
