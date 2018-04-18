package com.bootcamp;

public class CarBasicFormula implements Formula{

    @Override
    public int calculate(Vehicle vehicle){
        int cost = 100* vehicle.getAge();
        cost += vehicle.isDiesel() ? 500 : 0;
        cost += vehicle.getNumberOfMiles() > 200000 ? 500 : 0;
        return cost;
    }

}
