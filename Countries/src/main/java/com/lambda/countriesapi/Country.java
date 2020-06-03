package com.lambda.countriesapi;

public class Country {
    private String name;
    private int population;
    private int landMassSize;
    private int medianAge;

    public Country(String name, int population, int landMassSize, int medianAge) {
        this.name = name;
        this.population = population;
        this.landMassSize = landMassSize;
        this.medianAge = medianAge;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getLandMassSize() {
        return landMassSize;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLandMassSize(int landMassSize) {
        this.landMassSize = landMassSize;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", landMassSize=" + landMassSize +
                ", medianAge=" + medianAge +
                '}';
    }
}
