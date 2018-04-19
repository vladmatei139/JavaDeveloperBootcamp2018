package com.bootcamp;

import com.bootcamp.calculator.PolicyCalculator;
import com.bootcamp.dao.VehicleInfoPlainFileDao;
import com.bootcamp.enumformula.Formula;
import com.bootcamp.model.VehicleInfo;
import com.bootcamp.vehicle.Vehicle;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {

        PolicyCalculator calculator = PolicyCalculator.INSTANCE;

		if(args.length>=1){
            List<VehicleInfo> vehicleInfoList = new VehicleInfoPlainFileDao(args[0]).getAllVehicles();
            for(VehicleInfo vehicleInfo : vehicleInfoList){
                Vehicle vehicle = vehicleInfo.getVehicle();
                Formula formula = vehicleInfo.getFormula();
                System.out.println("Vehicle " + vehicleInfo.getId() + " has a policy cost of: " +
                        calculator.calculate(vehicle,formula));
            }
        } else {
            System.out.println("No arguments received!");
        }
    }
}
