package com.bootcamp.calculator;

import com.bootcamp.enumformula.Formula;
import com.bootcamp.vehicle.Vehicle;

public final class PolicyCalculator {

    public static final PolicyCalculator INSTANCE = new PolicyCalculator();

    private PolicyCalculator() {
    }

    public int calculate(Vehicle vehicle, Formula formula){
        return formula.calculate(vehicle);
    }
}
