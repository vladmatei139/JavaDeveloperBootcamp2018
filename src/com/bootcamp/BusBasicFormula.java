package com.bootcamp;

public class BusBasicFormula implements Formula{

    @Override
    public int calculate(Vehicle vehicle){
        int cost = 200 * vehicle.getAge();

        if(vehicle.isDiesel()){
            cost += 1000;
        }

        cost += vehicle.getNumberOfMiles() > 100000 ? 500 : 0;
        cost += vehicle.getNumberOfMiles() > 200000 ? 500 : 0;

        return cost;
    }
}
