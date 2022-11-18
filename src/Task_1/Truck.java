package Task_1;

public class Truck extends Transport implements Competing {
    private final LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, double pitStop, double bestLapTime, double maxSpeed, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
        this.loadCapacity = loadCapacity;

    }
    public  boolean goDiagnostik() {
        return Math.random()>0.8;
    }

    public enum LoadCapacity {
        N1(null, 3.5), N2(3.5, 12.0), N3(12.0, Double.MAX_VALUE);
        private final Double fromCapacity;
        private final Double toCapacity;

        LoadCapacity(Double fromCapacity, Double toCapacity) {
            this.fromCapacity = fromCapacity;
            this.toCapacity = toCapacity;
        }

        public double getFromCapacity() {
            return fromCapacity;
        }

        public double getToCapacity() {
            return toCapacity;
        }

        public String toString() {
            String fromCapacityString = fromCapacity != null
                    ? "от " + fromCapacity : "";
            String toCapacityString = toCapacity != null
                    ? " до " + toCapacity + " тонн" : "";
            return "Грузоподъемность автомобиля " + fromCapacityString + toCapacityString;
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void printType() {
        if (this.loadCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println(this.loadCapacity);
        }
    }
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public String infoEnum() {
        return getModel() + " " + getBrand() + " " + getLoadCapacity();
    }

    @Override
    public String info() {
        return getModel() + ": Пит-стоп " + getPitStop() + ", Лучшее время круга " + getBestLapTime() + ", Максимальная скорость " + getMaxSpeed() + ", " + getLoadCapacity();
    }

}
