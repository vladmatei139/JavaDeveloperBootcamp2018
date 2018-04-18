package com.bootcamp;

public final class PolicyCalculator {

    public static final PolicyCalculator INSTANCE = new PolicyCalculator();

    private PolicyCalculator() {
    }

    public int calculate(Car car){
        int cost = 100 * car.getAge();

        if(car.isDiesel()){
            cost += 500;
        }

        cost += car.getNumberOfMiles() > 200000 ? 500 : 0;

        return cost;
    }

    public int calculate(Bus bus){
        int cost = 200 * bus.getAge();

        if(bus.isDiesel()){
            cost += 1000;
        }

        cost += bus.getNumberOfMiles() > 100000 ? 500 : 0;
        cost += bus.getNumberOfMiles() > 200000 ? 500 : 0;

        return cost;
    }

    public int calculate(Tipper tipper){
        int cost = 300 * tipper.getAge();

        cost += tipper.getNumberOfMiles() > 80000 ? 700 : 0;

        return + cost;
    }
}
