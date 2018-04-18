package com.bootcamp;

public class MainApp {

    public static void main(String[] args) {
	    final Vehicle joesCar = new Car(5,20000,true,"auto");
	    final Vehicle stevesBus = new Bus(3, 100000, true, 33);
	    final Vehicle petersTipper = new Tipper(6, 80000, false, 15);


	    //Joe
	    int joesPolicyCost = 100 * joesCar.getAge();

	    if(joesCar.isDiesel()){
	        joesPolicyCost += 500;
        }

        joesPolicyCost += joesCar.getNumberOfMiles() > 200000 ? 500 : 0;

        System.out.println("Cost: " + joesPolicyCost);


        //Steve
        int stevesPolicyCost = 200 * stevesBus.getAge();

        if(stevesBus.isDiesel()){
            stevesPolicyCost += 1000;
        }

        stevesPolicyCost += stevesBus.getNumberOfMiles() > 100000 ? 500 : 0;
        stevesPolicyCost += stevesBus.getNumberOfMiles() > 200000 ? 500 : 0;

        System.out.println("Cost: " + stevesPolicyCost);


        //Peter
        int petersPolicyCost = 300 * petersTipper.getAge();

        petersPolicyCost += petersTipper.getNumberOfMiles() > 80000 ? 700 : 0;

        System.out.println("Cost: " + petersPolicyCost);

    }
}
