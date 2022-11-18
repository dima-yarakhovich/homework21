package Task_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private double pitStop;
    private double bestLapTime;
    private double maxSpeed;


    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();




    public Transport(String brand, String model, double engineVolume, double pitStop, double bestLapTime, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.pitStop = pitStop;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
    }





    public  boolean goDiagnostik() {
        System.out.println("Диагностика автобуса"+getBrand()+" не требуется");
        return true;
    }

    public double getPitStop() {
        if (pitStop <= 0) {
            this.pitStop = 0;
        }
        return pitStop;
    }

    public double getBestLapTime() {
        if (bestLapTime <= 0) {
            this.bestLapTime = 0;
        }
        return bestLapTime;
    }

    public double getMaxSpeed() {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        }
        return maxSpeed;
    }


    public String getBrand() {
        if (brand.isEmpty() || brand == null || brand.isBlank()) {
            this.brand = "Не указан";
        }
        return brand;
    }

    public String getModel() {
        if (model.isEmpty() || model == null || model.isBlank()) {
            this.model = "Не указан";
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 0;
        }
        return engineVolume;
    }


    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>...mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public void startMoving() {
        System.out.println(getBrand() + " Начать движение");
    }

    public void stopMoving() {
        System.out.println(getBrand() + " Закончить движение");
    }

    public String toString() {
        return getBrand() + " " + getModel() + " объём двигателя: " + getEngineVolume() + " л.";
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public String infoEnum() {
        return null;
    }

    public void repair() {
    }


    //    private int yearMade;
//    private String country;
//    private String color;
//    private int maxSpeed;
//    private String refill;


//    public Transport(String brand, String model, int yearMade, String country, String color, int maxSpeed, String refill) {
//        this.brand = brand;
//        this.refill = refill;
//        this.model = model;
//        this.yearMade = yearMade;
//        this.country = country;
//        if (color.isEmpty() || color == null || color.isBlank()) {
//            this.color = "Не указан";
//        } else {
//            this.color = color;
//            this.maxSpeed = maxSpeed;
//        }
//    }
//
//    public String getRefill() {
//        return refill;
//    }
//
//    public abstract void refil();
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getYearMade() {
//        return yearMade;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaxSpeed() {
//        if (maxSpeed <= 0) {
//            maxSpeed = 0;
//        } else {
//            return maxSpeed;
//        }
//        return 0;
//    }
//
//    public void setColor(String color) {
//        if (color.isEmpty() || color == null || color.isBlank()) {
//            this.color = "Не указан";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            maxSpeed = 0;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return brand + " " + model + ", " + yearMade + " года выпуска, сборка в: " + country + ", " + color + " цвет кузова, Максимальная скорость движения равна: " + maxSpeed;
//    }
}
