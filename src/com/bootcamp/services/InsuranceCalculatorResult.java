package com.bootcamp.services;

public class InsuranceCalculatorResult {
    private final String id;
    private final int cost;

    public InsuranceCalculatorResult(String id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }
}
