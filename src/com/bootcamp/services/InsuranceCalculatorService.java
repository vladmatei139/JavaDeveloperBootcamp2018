package com.bootcamp.services;

import com.bootcamp.calculator.PolicyCalculator;
import com.bootcamp.dao.VehicleInfoPlainFileDao;
import com.bootcamp.enumformula.Formula;
import com.bootcamp.model.VehicleInfo;
import com.bootcamp.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCalculatorService {
    private String filePath;

    public InsuranceCalculatorService(String filePath){
        this.filePath = filePath;
    }

    public List<InsuranceCalculatorResult> calculateAll(){
        List<InsuranceCalculatorResult> resultList = new ArrayList<InsuranceCalculatorResult>();
        PolicyCalculator calculator = PolicyCalculator.INSTANCE;
        List<VehicleInfo> vehicleInfoList = new VehicleInfoPlainFileDao(filePath).getAllVehicles();
        for(VehicleInfo vehicleInfo : vehicleInfoList) {
            Vehicle vehicle = vehicleInfo.getVehicle();
            Formula formula = vehicleInfo.getFormula();
            InsuranceCalculatorResult result = new InsuranceCalculatorResult(vehicleInfo.getId(),
                    calculator.calculate(vehicle, formula));
            resultList.add(result);
        }
        return resultList;
    }
}
