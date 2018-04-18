package com.bootcamp;

import java.text.Normalizer;

public class MainApp {

    public static void main(String[] args) {
	    final Vehicle joesCar = new Car(5,20000,true,"auto");
	    final Vehicle stevesBus = new Bus(3, 100000, true, 33);
	    final Vehicle petersTipper = new Tipper(6, 80000, false, 15);

	    final PolicyCalculator calculator = PolicyCalculator.INSTANCE;

	    final Formula carBasicFormula = new CarBasicFormula();
	    final Formula busBasicFormula = new BusBasicFormula();
	    final Formula tipperBasicFormula = new TipperBasicFormula();

	    final int joesPolicyCost = calculator.calculate(joesCar,carBasicFormula);
        final int stevesPolicyCost = calculator.calculate(stevesBus,busBasicFormula);
        final int petersPolicyCost = calculator.calculate(petersTipper,tipperBasicFormula);

	    //Joe
        System.out.println("Cost: " + joesPolicyCost);


        //Steve
        System.out.println("Cost: " + stevesPolicyCost);


        //Peter
        System.out.println("Cost: " + petersPolicyCost);

    }
}
