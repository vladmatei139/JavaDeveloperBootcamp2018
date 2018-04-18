package com.bootcamp;

public class MainApp {

    public static void main(String[] args) {
	    final Car joesCar = new Car(5,20000,true,"auto");
	    final Bus stevesBus = new Bus(3, 100000, true, 33);
	    final Tipper petersTipper = new Tipper(6, 80000, false, 15);

	    final PolicyCalculator calculator = PolicyCalculator.INSTANCE;

	    final int joesPolicyCost = calculator.calculate(joesCar);
        final int stevesPolicyCost = calculator.calculate(stevesBus);
        final int petersPolicyCost = calculator.calculate(petersTipper);

	    //Joe
        System.out.println("Cost: " + joesPolicyCost);


        //Steve
        System.out.println("Cost: " + stevesPolicyCost);


        //Peter
        System.out.println("Cost: " + petersPolicyCost);

    }
}
