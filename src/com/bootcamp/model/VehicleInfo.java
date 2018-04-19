package com.bootcamp.model;

import com.bootcamp.enumformula.Formula;
import com.bootcamp.vehicle.Bus;
import com.bootcamp.vehicle.Car;
import com.bootcamp.vehicle.Tipper;
import com.bootcamp.vehicle.Vehicle;

public class VehicleInfo {
    private String id;
    private String vehicleTypeName;
    private String vehicleTypeFormula;
    private int age;
    private long numberOfMiles;
    private boolean isDiesel;

    public VehicleInfo() {
    }

    public VehicleInfo(String id, String vehicleTypeName, String vehicleTypeFormula, int age, long numberOfMiles, boolean isDiesel) {
        this.id = id;
        this.vehicleTypeName = vehicleTypeName;
        this.vehicleTypeFormula = vehicleTypeFormula;
        this.age = age;
        this.numberOfMiles = numberOfMiles;
        this.isDiesel = isDiesel;
    }

    public String getId() {
        return id;
    }

    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    public String getVehicleTypeFormula() {
        return vehicleTypeFormula;
    }

    public int getAge() {
        return age;
    }

    public long getNumberOfMiles() {
        return numberOfMiles;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public Vehicle getVehicle(){
        final String carClassName = Car.class.getSimpleName().toUpperCase();
        final String busClassName = Bus.class.getSimpleName().toUpperCase();
        final String tipperClassName = Tipper.class.getSimpleName().toUpperCase();

        if(vehicleTypeName.equals(carClassName)){
            return new Car(age, numberOfMiles, isDiesel);
        }

        if(vehicleTypeName.equals(busClassName)){
            return new Bus(age, numberOfMiles, isDiesel);
        }

        if(vehicleTypeName.equals(tipperClassName)){
            return new Tipper(age, numberOfMiles, isDiesel);
        }

        return null;
    }

    public Formula getFormula(){
        return Formula.valueOf(vehicleTypeFormula);
    }
}
