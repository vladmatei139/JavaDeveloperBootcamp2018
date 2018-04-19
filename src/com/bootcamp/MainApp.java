package com.bootcamp;
import com.bootcamp.services.InsuranceCalculatorResult;
import com.bootcamp.services.InsuranceCalculatorService;

import java.util.List;

public class MainApp {

    private static final String OUTPUT_FORMAT = "Vehicle with id %s has a cost of %d";

	public static void main(String[] args) {

		if(args.length>=1){
            final InsuranceCalculatorService service = new InsuranceCalculatorService(args[0]);
            final List<InsuranceCalculatorResult> results = service.calculateAll();
            for(InsuranceCalculatorResult result: results){
                final String output = String.format(OUTPUT_FORMAT, result.getId(), result.getCost());
                System.out.println(output);
            }
        } else {
            System.out.println("No arguments received!");
        }
    }
}
