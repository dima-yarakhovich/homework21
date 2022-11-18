package Task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
////        Car lada = new Car("", "Granta", 2015, "Росcии", "", 1.7, "АКПП", "Универсал", "а158ап777", 5, "Зимние", 0, "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
////        Car audi = new Car("Audi", "A8 50L TDI", 2020, "Германии", "черный", 3.0, "МКПП", "", "а158ап777", 4, "Летние", 0, "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
////        Car bmw = new Car("BMW", "Z8", 2021, "", "черный", 3.0, "", "Кабриолет", "а158ап777", 2, "Зимние", 0, "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
////        Car kia = new Car("Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4, "АКПП", "", "", 5, "", 0, "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
////        Car hyundai = new Car("Hyundai", "Avante", 0, "Южной Корее", "оранжевый", -1, "АКПП", "Универсал", "а158ап777", 7, "Зимние", 0, "Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
//////        Train Martin = new Train("Ласточка", "В-901", 2011, "Россия", "", 301, 3500, 0, "Белорусский вокзал", "Минск-пассажирский", 11, "Нужно заправлять дизелем.");
//////        Train Lenin = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, "Нужно заправлять дизелем.");
////        Bus VW = new Bus("VW", "LT", 2002, "Germany", "Белый", 180, "Можно заправлять бензином или дизелем на заправке.");
////        Bus Crafter = new Bus("VW", "Crafter", 2015, "Germany", "Серый", 195, "Можно заправлять бензином или дизелем на заправке.");
////        Bus MB = new Bus("MB", "Vito", 2005, "Germany", "Желтый", 205, "Можно заправлять бензином или дизелем на заправке.");
//        System.out.println(audi);
//        System.out.println(Martin);
//        System.out.println(VW);
//        System.out.println(Crafter);
//        System.out.println(MB);
////        Martin.refil();
//        lada.refil();
//        MB.refil();
        Car lada = new Car("Lada", "Granta", 1.5, 1.2, 1.3, 1.4, Car.TypeBody.UNIVERSAL);
        Car Audi = new Car("Audi", "A8", 3.0, 2.2, 2.3, 2.4, Car.TypeBody.COUPE);
        Car VW = new Car("VW", "Phaeton", 4.2, 3.2, 3.3, 3.4, Car.TypeBody.SEDAN);
        Car hyundai = new Car("Hyundai", "Avante", 2.2, 4.2, 4.3, 4.4, Car.TypeBody.MINIVAN);
        Bus vw = new Bus("VW", "LT", 2.8, 5.2, 5.3, 5.4, Bus.PasCapacity.ESPECIALLY_BIG);
        Bus Crafter = new Bus("VW", "Crafter", 2.5, 1.2, 1.3, 1.4, Bus.PasCapacity.AVERAGE);
        Bus MB = new Bus("MB", "Vito", 2.2, 1.2, 1.3, 1.4, Bus.PasCapacity.SMALL);
        Bus Hyundai = new Bus("Hyundai", "H1", 2.2, 1.2, 1.3, 1.4, Bus.PasCapacity.ESPECIALLY_SMALL);
        Truck volvo = new Truck("Volvo", "F12", 12.3, 1.2, 1.3, 1.4, Truck.LoadCapacity.N1);
        Truck Daf = new Truck("Daf", "", 12.5, 1.2, 1.3, 1.4, Truck.LoadCapacity.N2);
        Truck Scania = new Truck("Scania", "S", 14.0, 1.2, 1.3, 1.4, Truck.LoadCapacity.N3);
        Truck MAZ = new Truck("MAZ", "5531", 12.0, 1.2, 1.3, 1.4, Truck.LoadCapacity.N1);
//        service(lada, Audi, Crafter, MB, MAZ, Scania);

        Mechanic<Car> saha = new Mechanic<Car>("Саша", "Ракович", "NEVADA");
        Mechanic<Car> leha = new Mechanic<Car>("Леша", "Ахрамович", "OZI");
        Mechanic<Car> ivan = new Mechanic<Car>("Иван", "Абраменя", "A100");
        Sponsor Alfa = new Sponsor("Альфа банк", 200_000);
        Sponsor BNB = new Sponsor("БНБ банк", 50_000);
        Sponsor BelVeb = new Sponsor("БелВЭБ банк", 1_000_000);
        lada.addMechanic(leha);
        lada.addSponsor(Alfa, BNB);
        lada.addDriver(new Driver<>("Дима", "B", 5, lada));
        Audi.addMechanic(ivan);
        Audi.addSponsor(BelVeb, BNB);
        Audi.addDriver(new Driver<>("Женя", "B", 4, Audi));
        hyundai.addMechanic(leha);
        hyundai.addSponsor(BelVeb, Alfa);
        hyundai.addDriver(new Driver<>("Аня", "D", 7, hyundai));
        Crafter.addMechanic(saha);
        Crafter.addSponsor(Alfa);
        Crafter.addDriver(new Driver<>("Архип", "D", 6, Crafter));
        volvo.addMechanic(saha);
        volvo.addSponsor(BelVeb);
        volvo.addDriver(new Driver<>("Алекс", "D", 8, volvo));
        MAZ.addMechanic(ivan);
        MAZ.addSponsor(BNB);
        MAZ.addDriver(new Driver<>("Анатолий", "D", 20, MAZ));


        List<Transport> transports = List.of(
                lada, Audi,
                hyundai, Crafter,
                MAZ, volvo);

        for (Transport transport : transports) {
            printInfo(transport);
        }


//        DriverB driverB = new DriverB("Рак Мих Мих", "B", 2, lada);
//        System.out.println(driverB);
//        Audi.startMoving();
//        Hyundai.stopMoving();
//        MB.printType();
//        VW.printType();
//        Daf.printType();
//        infoAuto(lada, Crafter, hyundai, Hyundai, MAZ);
    }

    //    public static void infoAuto(Competing... autos) {
//        for (Competing auto : autos) {
//           System.out.println(auto.info());
//            System.out.println(auto.infoEnum());
//        }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.print("Водитель(и): ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFIO());
        }
        System.out.println("Механик: " + transport.getMechanics());
        System.out.println("Спонсор(ы): " + transport.getSponsors());
        System.out.println("---------------");

    }

//    private static void service(Transport... transports) {
//        for (Transport transport : transports) {
//            serviceTr(transport);
//        }
//    }
//
//
//    private static void serviceTr(Transport transport) {
//        try {
//            if (!transport.goDiagnostik()) {
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + " не прошел диагностику");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
