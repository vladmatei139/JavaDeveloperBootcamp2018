package com.bootcamp;

public final class PolicyCalculator {

    public static final PolicyCalculator INSTANCE = new PolicyCalculator();

    private PolicyCalculator() {
    }

    public int calculate(Vehicle vehicle, Formula formula){
        return formula.calculate(vehicle);
    }
}
