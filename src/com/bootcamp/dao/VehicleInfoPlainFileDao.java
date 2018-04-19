package com.bootcamp.dao;

import com.bootcamp.enumformula.Formula;
import com.bootcamp.model.VehicleInfo;
import com.bootcamp.vehicle.Bus;
import com.bootcamp.vehicle.Car;
import com.bootcamp.vehicle.Tipper;
import com.bootcamp.vehicle.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleInfoPlainFileDao implements VehicleInfoDao {

    private final String filePath;

    public VehicleInfoPlainFileDao(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<VehicleInfo> getAllVehicles() {
        String SEPARATOR = ";";

        int VEHICLE_ID = 0;
        int VEHICLE_TYPE = 1;
        int VEHICLE_FORMULA = 2;
        int VEHICLE_AGE = 3;
        int VEHICLE_MILES = 4;
        int VEHICLE_IS_DIESEL = 5;
        List<VehicleInfo> vehicleList = new ArrayList<VehicleInfo>();
        File file = new File(this.filePath);
        try {
            final InputStream inputStream = new FileInputStream(file);
            final Scanner scanner = new Scanner(inputStream);

            while(scanner.hasNextLine()){
                final String line = scanner.nextLine();
                final String[] tokens = line.split(SEPARATOR);
                VehicleInfo vehicleInfo = new VehicleInfo(tokens[VEHICLE_ID],tokens[VEHICLE_TYPE],tokens[VEHICLE_FORMULA],
                        Integer.parseInt(tokens[VEHICLE_AGE]),
                        Long.parseLong(tokens[VEHICLE_MILES]),Boolean.parseBoolean(tokens[VEHICLE_IS_DIESEL]));
                vehicleList.add(vehicleInfo);
            }

            scanner.close();

        } catch (FileNotFoundException noFileFound) {
            System.err.println(noFileFound.getMessage());
        }
        return vehicleList;
    }
}
